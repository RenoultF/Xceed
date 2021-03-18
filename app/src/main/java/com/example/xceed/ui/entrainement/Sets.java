package com.example.xceed.ui.entrainement;

import com.example.xceed.ui.exercice.Exercice;
/**
 * Created by Alkassoum
 */
public class Sets {
    public String exercice_Name;
    public double weight;
    public int reps;
    public boolean dropset;
    public boolean AMRAP;
    public Exercice exercice;


    public Sets (int sentReps, double sentweight, Exercice exercice, boolean dropset){
        this.weight = sentweight;
        this.reps = sentReps;
        this.dropset=dropset;
        this.exercice = exercice;
        this.AMRAP=false;
    }
    public int getReps(){ return this.reps;}

}