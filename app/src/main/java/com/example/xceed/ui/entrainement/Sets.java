package com.example.xceed.ui.entrainement;

public class Sets {
    public String exercice_Name;
    public double weight;
    public int reps;
    public boolean dropset;
    public boolean AMRAP;

    public Sets (int sentReps, double sentweight,String name,boolean dropset){
        this.weight = sentweight;
        this.reps = sentReps;
        this.dropset=dropset;
        this.exercice_Name = name;
        this.AMRAP=false;
    }
    public int getReps(){ return this.reps;}

}