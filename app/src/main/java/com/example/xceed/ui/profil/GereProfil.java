package com.example.xceed.ui.profil;


import android.content.Context;
import android.util.Log;
import android.util.Xml;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class GereProfil {

    public Profil recupProfil(Context context){

        //on crer un profil de profil (qui va rester si aucun fichier n'est déjà sauvegarder)
        Profil profil = new Profil("Pseudo",1,"0","0");

        File newXml = new File(context.getFilesDir()+"/Profil.xml");

        //pas de fichier sauvegardé donc on renvoie le profil
        if(!newXml.exists()){
            return profil;
        }

        XmlPullParserFactory parserFactory;
        try {

            parserFactory = XmlPullParserFactory.newInstance();
            XmlPullParser parser = parserFactory.newPullParser();

            //on récupère ce qu'il y a dedans
            InputStream is = context.openFileInput("Profil.xml");
            parser.setFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES, true);
            parser.setInput(is, null);


            int eventType = parser.getEventType();
            while (eventType != XmlPullParser.END_DOCUMENT) {
                String eltName = null;

                switch (eventType) {
                    case XmlPullParser.START_TAG:
                        eltName = parser.getName();


                        //si on a bien quelque chose qui est sauvegardé sous profil
                        if(eltName.equals("Profil")) {

                            //on recupère les attribut qu'il y a dans le xml
                            String pseudo=parser.getAttributeValue(0);
                            int taille=Integer.parseInt(parser.getAttributeValue(1));
                            String poids= parser.getAttributeValue(2);

                            //on les affecte aux profil
                            profil.setPseudo(pseudo);
                            profil.setTaille(taille);
                            profil.setKg(poids);
                            profil.calculImc();
                        }

                }
                eventType = parser.next();
            }


        } catch (XmlPullParserException e) {

        } catch (IOException e) {
        }

        //on retourne le profil récupéré
        return profil;

    }

    public void saveProfil(Context context,String p,String t,String k){

        //boolean fileExist=false;
        try {

            //on ouvre le fichier Profil.xml (crétion si non existant ou surcharge/remplacement des données s'il existe déjà( mode private)
            FileOutputStream fos = context.openFileOutput("Profil.xml", Context.MODE_PRIVATE);
            XmlSerializer serializer = Xml.newSerializer();
            serializer.setOutput(fos, "UTF-8");
            //if(!fileExist) {
            serializer.startDocument(null, Boolean.valueOf(true));
            serializer.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
            serializer.startTag(null, "Root");
            //}

            //on le fait commencer apr profil (utili pour le eltname)
            serializer.startTag(null, "Profil");
            //on met les attributs dedans
            serializer.attribute(null, "Pseudo",p);
            serializer.attribute(null, "Taille",t);
            serializer.attribute(null, "Poids", k);
            serializer.endTag(null, "Profil");
            //femeture fichier
            serializer.endDocument();
            serializer.flush();

            fos.close();

        }catch (IOException e) {
        }

    }
}
