package com.example.xceed.ui.entrainement;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.xceed.GifImageView;
import com.example.xceed.R;
import com.example.xceed.ui.exercice.Exercice;

import java.util.LinkedList;
import java.util.List;

public class Entrainement_fb extends AppCompatActivity {
    private Intent intent;
    protected int nbJours;
    private int nbSets;
    private int nbRep;
    private List<Exercice> lstExercices;
    LinearLayout linearLayout;
    public String dayNumber;
    public Entrainement_fb(int nbSets, int nbRep, LinkedList<Exercice> lstExercices){
        this.nbSets=nbSets;
        this.nbRep=nbRep;
        this.lstExercices=lstExercices;
        this.nbJours=3;


    }
    public Entrainement_fb(){
        super();
    }



        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinkedList<Exercice>lstt= new LinkedList<Exercice>();
        lstt.add(new Exercice("DC","test",0,"haut"));
        lstt.add(new Exercice("DP","test",0,"haut"));
        lstt.add(new Exercice("DC","test",0,"haut"));
        lstt.add(new Exercice("DC","test",0,"haut"));
        Entrainement_fb e= new Entrainement_fb(4,12,lstt);


        intent = getIntent();
        dayNumber = intent.getStringExtra("DayNum");

        setContentView(R.layout.fragment_entrainement_show);
        linearLayout = findViewById(R.id.stuff);
            for (int i = 0; i < 2; i++) {
                TextView textView = new TextView(this);
                textView.setText("TextView " + lstt.get(i).getNomExerciceEx());
                linearLayout.addView(textView);
            }



    }

}

