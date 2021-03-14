package com.example.xceed.ui.entrainement;

public class Sets {
    public String exercice_Name;
    public double weight;
    public int reps;
    public boolean AMRAP;

    public Sets (int sentReps, double sentweight,String name){
        weight = sentweight;
        reps = sentReps;
        AMRAP = false;
        exercice_Name = name;
    }
    public int getReps(){ return this.reps;}

}