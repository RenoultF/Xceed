package com.example.xceed.ui.exercice;

import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import com.example.xceed.ui.entrainement.Sets;

import java.util.ArrayList;
import java.util.List;


public class Exercice {

    private String nomExercice;
    private String descriptionExercice;
    private String categorie;
    public List<Sets> setsToDo = new ArrayList<>();

    // This variable holds the info for the sets done
    public List<Sets> curset = new ArrayList<>();

    public int setsDone;

    public int numOfSets;

    private int idGif;

    public Exercice(String nom, String dE, int idGif, String categorie){
        this.nomExercice = nom;
        this.descriptionExercice = dE;
        this.idGif = idGif;
        this.categorie = categorie;

    }

    public String getNomExerciceEx() {
        return nomExercice;
    }

    public int getNbSerie() {
        return numOfSets;
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
}
