package com.example.xceed.ui.exercice;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import com.example.xceed.ui.entrainement.Sets;

import java.util.ArrayList;
import java.util.List;


public class Exercice {

    private final String nomExercice;
    private final String descriptionExercice;
    private final String categorie;
    private int nbSerie;
    private int nbRep;
    private int idImg;
    public List<Sets> setsToDo = new ArrayList<>();

    // This variable holds the info for the sets done
    public List<Sets> curset = new ArrayList<>();

    public int setsDone;
    private final int idGif;
    public int numOfSets;

    public Exercice(String nom, String dE, int idGif, String categorie,int nbSerie,int NbRep,int idImg){
        this.nomExercice = nom;
        this.descriptionExercice = dE;
        this.idGif = idGif;
        this.categorie = categorie;
        this.nbSerie = nbSerie;
        this.nbRep = nbRep;
        this.idImg = idImg;
    }

    //getter & sette
    public String getNomExerciceEx() {
        return this.nomExercice;
    }

    public int getNbSerie() {
        return nbSerie;
    }

    public int getNbRep() {
        return nbRep;
    }

    public String getDescriptionExercice() {
        return descriptionExercice;
    }

    public int getIdGif() {
        return idGif;
    }

    public String getCategorie() {
        return categorie;
    }

    public int getIdImg() {
        return idImg;
    }
}
