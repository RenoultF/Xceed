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
/**
 * Created by Alkassoum
 */
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
        int indiceExercice = 0;
       /* switch (buttonId){
            case R.id.imgEx1:
                indiceExercice = 0;
                break;
            case R.id.imgEx2:
                indiceExercice = 1;
                break;
            case R.id.imgEx3:
                indiceExercice = 2;
                break;
            case R.id.imgEx4:
                indiceExercice = 3;
                break;
            case R.id.imgEx5:
                indiceExercice = 4;
                break;
            case R.id.imgEx6:
                indiceExercice = 5;
                break;
            case R.id.imgEx7:
                indiceExercice = 6;
                break;
            case R.id.imgEx8:
                indiceExercice = 7;
                break;
            case R.id.imgEx9:
                indiceExercice = 8;
                break;
            case R.id.imgEx10:
                indiceExercice = 9;
                break;
            case R.id.imgEx11:
                indiceExercice = 10;
                break;
            case R.id.imgEx12:
                indiceExercice = 11;
                break;
            case R.id.imgEx13:
                indiceExercice = 12;
                break;
            case R.id.imgEx14:
                indiceExercice = 13;
                break;
            case R.id.imgEx15:
                indiceExercice = 14;
                break;
            case R.id.imgEx16:
                indiceExercice = 15;
                break;
            case R.id.imgEx17:
                indiceExercice = 16;
                break;
            case R.id.imgEx18:
                indiceExercice = 17;
                break;
            case R.id.imgEx19:
                indiceExercice = 18;
                break;
            case R.id.imgEx20:
                indiceExercice = 19;
                break;
            case R.id.imgEx21:
                indiceExercice = 20;
                break;
            case R.id.imgEx22:
                indiceExercice = 21;
                break;
            case R.id.imgEx23:
                indiceExercice = 22;
                break;
            case R.id.imgEx24:
                indiceExercice = 23;
                break;
            case R.id.imgEx25:
                indiceExercice = 24;
                break;
            case R.id.imgEx26:
                indiceExercice = 25;
                break;
            case R.id.imgEx27:
                indiceExercice = 26;
                break;
            case R.id.imgEx28:
                indiceExercice = 27;
                break;
            case R.id.imgEx29:
                indiceExercice = 28;
                break;
            case R.id.imgEx30:
                indiceExercice = 29;
                break;
        }*/
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
