package com.example.xceed.ui.entrainement;

import com.example.xceed.ui.exercice.Exercice;

import java.util.LinkedList;

public class Entrainement_hf extends Entrainement {
    public Entrainement_hf(int nbSets, int nbRep, LinkedList<Exercice> lstExercices){
        super(nbSets,nbRep,lstExercices);
        this.nbJours=4;


    }
}
