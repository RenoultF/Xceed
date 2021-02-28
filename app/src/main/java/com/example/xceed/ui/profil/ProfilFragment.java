package com.example.xceed.ui.profil;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
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
    private Button btnModifProfil;
    private GereProfil gereProfil;
    private Profil profilRecup;
    private TextView changePoids;
    private EditText tail;
    private BubbleSeekBar seekBarImc;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        profilViewModel =
                new ViewModelProvider(this).get(ProfilViewModel.class);
        View root = inflater.inflate(R.layout.fragment_profil, container, false);
        gereProfil = new GereProfil();
        profilRecup = gereProfil.recupProfil(getContext());
        tail = (EditText) root.findViewById(R.id.nb_taille);
        changePoids = (TextView) root.findViewById(R.id.txt_poids);
        ProtractorView protractorViewPoids = (ProtractorView)root.findViewById(R.id.protractorViewPoids);
        seekBarImc = (BubbleSeekBar) root.findViewById(R.id.seekBar_imc);
        pseudo = (EditText) root.findViewById(R.id.txt_pseudo);
        protractorViewPoids.setAngle(Integer.parseInt(profilRecup.getKg()));
        changePoids.setText("Poids : " + profilRecup.getKg() + "Kg");
        protractorViewPoids.setOnProtractorViewChangeListener(new ProtractorView.OnProtractorViewChangeListener() {
            @Override
            public void onProgressChanged(ProtractorView protractorView, int progress, boolean fromUser) {
                /*try {
                    TimeUnit.MILLISECONDS.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/
                changePoids.setText("Poids : " +Integer.toString(progress) + "Kg");

            }

            @Override
            public void onStartTrackingTouch(ProtractorView protractorView) {

            }

            @Override
            public void onStopTrackingTouch(ProtractorView protractorView) {

            }
        });
        seekBarImc.setEnabled(false);
        seekBarImc.setProgress(profilRecup.calculImc());
        tail.setText(Integer.toString(profilRecup.getTaille()));
        pseudo.setText(profilRecup.getPseudo());
        btnModifProfil = (Button) root.findViewById(R.id.BtnVlider);
        btnModifProfil.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View root) {
                gereProfil.saveProfil(getContext(),pseudo.getText().toString(),tail.getText().toString(),String.valueOf(protractorViewPoids.getAngle()));
                seekBarImc.setProgress(profilViewModel.calculImcActuel(tail.getText().toString(),String.valueOf(protractorViewPoids.getAngle())));
            } });

        return root;
    }
}