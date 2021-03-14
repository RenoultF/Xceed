package com.example.xceed.ui.entrainement;

import com.example.xceed.ui.exercice.Exercice;

import java.util.LinkedList;

public class Entrainement_split extends Entrainement {
    public Entrainement_split(int nbSets, int nbRep, LinkedList<Exercice> lstExercices){
        super(nbSets,nbRep,lstExercices);
        this.nbJours=6;


    }
}
