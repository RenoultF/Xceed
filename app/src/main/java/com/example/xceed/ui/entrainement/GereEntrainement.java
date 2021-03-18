package com.example.xceed.ui.entrainement;


import android.content.Context;
import android.util.Log;
import android.util.Xml;

import com.example.xceed.ui.exercice.Exercice;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class GereEntrainement {

    public Entrainement recupEntrainement(Context context,String nomEntrainement,int idImgEntrainement){
        Entrainement entrainement = new Entrainement(nomEntrainement,idImgEntrainement);
        //We create a workout wich will last if none is already declared
        System.out.println(entrainement.getNomEntrainement()+".xml");
        File newXml = new File(context.getFilesDir()+"/"+entrainement.getNomEntrainement()+".xml");


        //No saved instances, so we return the new one

        if(!newXml.exists()){
            return entrainement;
        }

        XmlPullParserFactory parserFactory;
        try {

            parserFactory = XmlPullParserFactory.newInstance();
            XmlPullParser parser = parserFactory.newPullParser();
            InputStream is = context.openFileInput(nomEntrainement+".xml");
            parser.setFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES, true);
            parser.setInput(is, null);
            //Receiving what is inside

            int eventType = parser.getEventType();
            while (eventType != XmlPullParser.END_DOCUMENT) {
                String eltName = null;

                switch (eventType) {
                    case XmlPullParser.START_TAG:
                        eltName = parser.getName();

                        if(eltName.equals("Exercice")) {
                            //If there is something saved,we recup all the attributes in the xml file

                            String nom=parser.getAttributeValue(0);
                            String dE=parser.getAttributeValue(1);
                            int idGif=Integer.parseInt(parser.getAttributeValue(2));
                            String categorie= parser.getAttributeValue(3);
                            int nbSerie = Integer.parseInt(parser.getAttributeValue(4));
                            int nbRep = Integer.parseInt(parser.getAttributeValue(5));
                            int idImg = Integer.parseInt(parser.getAttributeValue(6));
                            //we create an Exercice and add it to the wourkout list
                            Exercice exerciceTemp = new Exercice(nom,dE,idGif,categorie,nbSerie,nbRep,idImg);
                            entrainement.addExercice(exerciceTemp);
                        }

                }
                eventType = parser.next();
            }


        } catch (XmlPullParserException e) {

        } catch (IOException e) {
        }

        return entrainement;

    }

    public void saveEntrainement(Context context,Entrainement entrainement){
        //we open the xml file

        try {
            FileOutputStream fos = context.openFileOutput(entrainement.getNomEntrainement()+".xml", Context.MODE_PRIVATE);
            XmlSerializer serializer = Xml.newSerializer();
            serializer.setOutput(fos, "UTF-8");

            serializer.startDocument(null, Boolean.valueOf(true));
            serializer.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
            serializer.startTag(null, "Root");


            Log.e("avant",""+entrainement.getLstExercices().size());
            if(entrainement.getLstExercices().size()>0) {
                for (Exercice e : entrainement.getLstExercices()) {
                    serializer.startTag(null, "Exercice");
                    serializer.attribute(null, "Nom", e.getNomExerciceEx());
                    serializer.attribute(null, "Description", e.getDescriptionExercice());
                    serializer.attribute(null, "IdGif", String.valueOf(e.getIdGif()));
                    serializer.attribute(null, "Categorie", e.getCategorie());
                    serializer.attribute(null, "NbSerie", String.valueOf(e.getNbSerie()));
                    serializer.attribute(null, "NbRep", String.valueOf(e.getNbSerie()));
                    serializer.attribute(null, "IdImg", String.valueOf(e.getIdImg()));
                    serializer.endTag(null, "Exercice");
                }
            }
            serializer.endDocument();
            serializer.flush();


            fos.close();

        }catch (IOException e) {
        }

    }
}
