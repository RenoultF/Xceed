package com.example.xceed.ui.entrainement;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.xceed.R;
import com.example.xceed.SetsAdapter;
import com.example.xceed.ui.exercice.Exercice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Entrainement_hf extends AppCompatActivity {
    private int nbJours;
    public Entrainement_hf(int nbSets, int nbRep, LinkedList<Exercice> lstExercices){
        //super(nbSets,nbRep,lstExercices);
        this.nbJours=4;


    }
    public Entrainement_hf(){
    }
    @Override
    protected void onCreate(Bundle savecInstanceState){
        super.onCreate(savecInstanceState);
        setContentView(R.layout.fragment_entrainement_show);
        //list of sets
        List<Sets> sets=new ArrayList<Sets>();

        int c = getIntent().getIntExtra("DayNum",0);
        switch (c){
            case R.id.hf_day1://jour 1 hf body
                sets.add(new Sets(15, 10, new Exercice("Developpé couché (Barre)", "Ceci est du dev Couch", R.drawable.gif_dc, "Pectoraux"), true));
                sets.add(new Sets(10, 10, new Exercice("Developpé couché incliné (Barre)", "Ceci est du dev Couch incliné", R.drawable.gif_devinc, "Pectoraux (Haut)"), true));
                sets.add(new Sets(12, 10, new Exercice("Developpé couché décliné (Barre)", "Ceci est du dev Couch décliné", R.drawable.gif_devdec, "Pectoraux (Bas)"), true));
                sets.add(new Sets(18, 10, new Exercice("Ecarté (Haltere)", "Ceci est de l'écarté", R.drawable.gif_ecarte, "Pectoraux"), true));
                break;
            case R.id.hf_day2:
                sets.add(new Sets(15, 10, new Exercice("Developpé couché (Barre)", "Ceci est du dev Couch", R.drawable.gif_dc, "Pectoraux"), true));
                sets.add(new Sets(10, 10, new Exercice("Developpé couché incliné (Barre)", "Ceci est du dev Couch incliné", R.drawable.gif_devinc, "Pectoraux (Haut)"), true));
                sets.add(new Sets(12, 10, new Exercice("Developpé couché décliné (Barre)", "Ceci est du dev Couch décliné", R.drawable.gif_devdec, "Pectoraux (Bas)"), true));
                sets.add(new Sets(18, 10, new Exercice("Ecarté (Haltere)", "Ceci est de l'écarté", R.drawable.gif_ecarte, "Pectoraux"), true));
                break;
            case R.id.hf_day3:
                sets.add(new Sets(15, 10, new Exercice("Developpé couché (Barre)", "Ceci est du dev Couch", R.drawable.gif_dc, "Pectoraux"), true));
                sets.add(new Sets(10, 10, new Exercice("Developpé couché incliné (Barre)", "Ceci est du dev Couch incliné", R.drawable.gif_devinc, "Pectoraux (Haut)"), true));
                sets.add(new Sets(12, 10, new Exercice("Developpé couché décliné (Barre)", "Ceci est du dev Couch décliné", R.drawable.gif_devdec, "Pectoraux (Bas)"), true));
                sets.add(new Sets(18, 10, new Exercice("Ecarté (Haltere)", "Ceci est de l'écarté", R.drawable.gif_ecarte, "Pectoraux"), true));
                break;
            case R.id.hf_day4:
                sets.add(new Sets(15, 10, new Exercice("Developpé couché (Barre)", "Ceci est du dev Couch", R.drawable.gif_dc, "Pectoraux"), true));
                sets.add(new Sets(10, 10, new Exercice("Developpé couché incliné (Barre)", "Ceci est du dev Couch incliné", R.drawable.gif_devinc, "Pectoraux (Haut)"), true));
                sets.add(new Sets(12, 10, new Exercice("Developpé couché décliné (Barre)", "Ceci est du dev Couch décliné", R.drawable.gif_devdec, "Pectoraux (Bas)"), true));
                sets.add(new Sets(18, 10, new Exercice("Ecarté (Haltere)", "Ceci est de l'écarté", R.drawable.gif_ecarte, "Pectoraux"), true));
                break;
            default:

                break;

        }
        // Entrainement_fb e=  new Entrainement_fb( new Sets(15,10,new Exercice("Developpé couché (Barre)","Ceci est du dev Couch",R.drawable.gif_dc,"Pectoraux"),true));
        //get list view
        ListView lstView = findViewById(R.id.ListView1);
        lstView.setAdapter(new SetsAdapter(this,sets));
    }

}
