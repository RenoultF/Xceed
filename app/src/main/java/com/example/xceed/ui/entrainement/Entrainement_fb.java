package com.example.xceed.ui.entrainement;

import com.example.xceed.ui.exercice.Exercice;

import java.util.LinkedList;

public class Entrainement_fb extends Entrainement {
    public Entrainement_fb(int nbSets, int nbRep, LinkedList<Exercice> lstExercices){
        super(nbSets,nbRep,lstExercices);
        this.nbJours=3;


    }
}
