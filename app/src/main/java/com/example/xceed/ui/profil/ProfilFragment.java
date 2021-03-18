package com.example.xceed.ui.profil;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.content.Context;
import android.util.Log;
import android.util.Xml;
import android.widget.Toast;
import java.util.concurrent.TimeUnit;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.xceed.R;
import com.goodiebag.protractorview.ProtractorView;
import com.xw.repo.BubbleSeekBar;


public class ProfilFragment extends Fragment {

    private ProfilViewModel profilViewModel;
    private EditText pseudo;
    private ImageButton btnModifProfil;
    private GereProfil gereProfil;
    private Profil profilRecup;
    private TextView changePoids;
    private TextView changeTail;
    private SeekBar seekBarTaille;
    private BubbleSeekBar seekBarImc;
    private TextView affichageImc;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        profilViewModel =
                new ViewModelProvider(this).get(ProfilViewModel.class);
        View root = inflater.inflate(R.layout.fragment_profil, container, false);
        //Gere profil permet davoir acces au fonction de récuparion et de sauvegarde.
        gereProfil = new GereProfil();
        //on récupère le profil sur la mémoire interne
        profilRecup = gereProfil.recupProfil(getContext());

        //On récupere les items
        changeTail = (TextView) root.findViewById(R.id.txt_taille);
        changePoids = (TextView) root.findViewById(R.id.txt_poids);
        //widget protactorview
        ProtractorView protractorViewPoids = (ProtractorView)root.findViewById(R.id.protractorViewPoids);
        seekBarTaille = (SeekBar) root.findViewById(R.id.seekBarTaille);
        seekBarImc = (BubbleSeekBar) root.findViewById(R.id.seekBar_imc);
        pseudo = (EditText) root.findViewById(R.id.txt_pseudo);
        affichageImc = (TextView) root.findViewById(R.id.affichage_imc);

        //on met a jour les les valeures selon le profil que l'on a récupéré
        protractorViewPoids.setAngle(Integer.parseInt(profilRecup.getKg()));
        seekBarTaille.setProgress(profilRecup.getTaille());
        changePoids.setText("Poids : " + profilRecup.getKg() + "Kg");
        setViewImc(profilRecup.calculImc());
        protractorViewPoids.setOnProtractorViewChangeListener(new ProtractorView.OnProtractorViewChangeListener() {
            @SuppressLint({"ResourceAsColor", "NewApi"})
            @Override
            public void onProgressChanged(ProtractorView protractorView, int progress, boolean fromUser) {
                //met a jour du text poid en fonction du changement (permet de voir la valeure en direct)
                changePoids.setText("Poids : " +Integer.toString(progress) + "Kg");
                float calculImc = profilViewModel.calculImcActuel(String.valueOf(seekBarTaille.getProgress()),String.valueOf(progress));
                setViewImc(calculImc);
                //on ne fait pas dépasser 12 et 42 pour rester dans la seekbar
                if(calculImc>42){
                    calculImc = 42;
                }
                if(calculImc<12){
                    calculImc = 12;
                }

                //mise a jour du la valeur de la seekbar(imc)
                seekBarImc.setProgress(calculImc);

            }

            @Override
            public void onStartTrackingTouch(ProtractorView protractorView) {

            }

            @Override
            public void onStopTrackingTouch(ProtractorView protractorView) {
                //des que l'on arrete de la toucher on sauvegarde
                gereProfil.saveProfil(getContext(),pseudo.getText().toString(),String.valueOf(seekBarTaille.getProgress()),String.valueOf(protractorViewPoids.getAngle()));
            }
        });

        seekBarTaille.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                //mise a jour de la taille a chaque fois que l'on change (permet de voir la valeure en direct)
                changeTail.setText("Taille : "+Integer.toString(progress)+ " cm");
                float calculImc = profilViewModel.calculImcActuel(String.valueOf(progress),String.valueOf(protractorViewPoids.getAngle()));
                setViewImc(calculImc);
                if(calculImc>42){
                    calculImc = 42;
                }
                if(calculImc<12){
                    calculImc = 12;
                }
                //mise a jour du la valeur de la seekbar(imc)
                seekBarImc.setProgress(calculImc);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //des que l'on arrete de la toucher on sauvegarde
                gereProfil.saveProfil(getContext(),pseudo.getText().toString(),String.valueOf(seekBarTaille.getProgress()),String.valueOf(protractorViewPoids.getAngle()));
            }
        });

        //permet la mis a jour a l'entré dans lappli selon le profil que l'on a récupéré
        seekBarImc.setEnabled(false);
        seekBarImc.setProgress(profilRecup.calculImc());
        //les valeurs de base quand on rentre dans l'appli
        changeTail.setText("Taille : "+Integer.toString(profilRecup.getTaille())+ " cm");
        pseudo.setText(profilRecup.getPseudo());
        btnModifProfil = (ImageButton) root.findViewById(R.id.BtnVlider);
        btnModifProfil.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View root) {
                //on sauvegarde quand on appuie sur el bouton save
                gereProfil.saveProfil(getContext(),pseudo.getText().toString(),String.valueOf(seekBarTaille.getProgress()),String.valueOf(protractorViewPoids.getAngle()));
            } });

        return root;
    }

    public void setViewImc(float calculImc){
        //selon la valeur de l'imc on va changer l'apparence de cette dernière
        if(calculImc<18.5){
            affichageImc.setText("Insuffisance pondérale (maigreur)");
            affichageImc.setTextColor(getContext().getColor(R.color.blue));
            seekBarImc.setBackgroundColor(getContext().getColor(R.color.blue));
        }
        else if(calculImc>=18.5 && calculImc<=25){
            affichageImc.setText("Corpulence normale");
            affichageImc.setTextColor(getContext().getColor(R.color.green));
            seekBarImc.setBackgroundColor(getContext().getColor(R.color.green));
        }
        else if(calculImc>25 && calculImc<30){
            affichageImc.setText("Surpoids");
            affichageImc.setTextColor(getContext().getColor(R.color.yellow));
            seekBarImc.setBackgroundColor(getContext().getColor(R.color.yellow));
        }
        else if(calculImc>=30 && calculImc<35){
            affichageImc.setText("Obésité modérée");
            affichageImc.setTextColor(getContext().getColor(R.color.orange));
            seekBarImc.setBackgroundColor(getContext().getColor(R.color.orange));
        }
        else{
            affichageImc.setText("Obésité sévère");
            affichageImc.setTextColor(getContext().getColor(R.color.red));
            seekBarImc.setBackgroundColor(getContext().getColor(R.color.red));
        }
    }
}