package com.example.xceed.ui.profil;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Context;
import android.util.Log;
import android.util.Xml;
import android.widget.Toast;

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

public class ProfilFragment extends Fragment {

    private ProfilViewModel profilViewModel;
    private EditText pseudo;
    private Button btnModifProfil;
    private GereProfil gereProfil;
    private Profil profilRecup;
    private EditText kilo;
    private EditText tail;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        profilViewModel =
                new ViewModelProvider(this).get(ProfilViewModel.class);
        View root = inflater.inflate(R.layout.fragment_profil, container, false);
        gereProfil = new GereProfil();
        profilRecup = gereProfil.recupProfil(getContext());
        kilo = (EditText) root.findViewById(R.id.nb_poids);
        tail = (EditText) root.findViewById(R.id.nb_taille);
        pseudo = (EditText) root.findViewById(R.id.txt_pseudo);
        kilo.setText(profilRecup.getKg());
        tail.setText(Integer.toString(profilRecup.getTaille()));
        pseudo.setText(profilRecup.getPseudo());
        btnModifProfil = (Button) root.findViewById(R.id.BtnVlider);
        btnModifProfil.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View root) {
                gereProfil.saveProfil(getContext(),pseudo.getText().toString(),tail.getText().toString(),kilo.getText().toString());
            } });
        return root;
    }
}