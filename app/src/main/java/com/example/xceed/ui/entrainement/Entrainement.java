package com.example.xceed.ui.entrainement;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import com.example.xceed.ui.exercice.Exercice;

public class Entrainement {
    private LinkedList<Sets> setsToDo;
    private LinkedList<Sets> setsDone;
    private ArrayList<Exercice> lstExercices;
    private int nbSets;
    protected int nbJours;
    private int nbRep;
    public Entrainement(int nbSets,int nbRep,LinkedList<Exercice> lstExercices){
        this.nbSets=nbSets;
        this.nbJours = 0;
        this.nbRep=nbRep;
        this.lstExercices = new ArrayList<Exercice>(lstExercices);
        for (Exercice temp : lstExercices) {
           // setsToDo.add(new Sets(this.nbRep,100,temp.getNomExerciceEx(),true));
        }

    }


    public int getNbJours() {
        return nbJours;
    }

    public int getNbRep() {
        return nbRep;
    }

    public int getNbSets() {
        return nbSets;
    }


    public void setLstExercices(ArrayList<Exercice> lstExercices) {
        this.lstExercices = lstExercices;
    }

    public void setNbJours(int nbJours) {
        this.nbJours = nbJours;
    }

    public void setNbRep(int nbRep) {
        this.nbRep = nbRep;
    }

    public void setNbSets(int nbSets) {
        this.nbSets = nbSets;
    }

    //list for sets to do
    /*
    private int numOfSets;
    private List<Sets> sets = new ArrayList<Sets>();
    //list for sets done
    private List<Sets> setsd = new ArrayList<Sets>();
    public String exersizeName;
    public int setsDone;
    public TextView textUI;
    public SeekBar seekSets;
    public SeekBar seekReps;
    public EditText weightUI;
    public TextView repsText;
    public Button doneSetUI;
    public Button AMRAP;
    public boolean didEverything(){
        if (this.setsDone < this.sets.size()){
            return false;
        }

        for (int i = 0; i < this.sets.size(); i++){
            if (this.setsd.get(i).reps < this.setsd.get(i).reps){
                return false;
            }

            if (this.setsd.get(i).weight < this.sets.get(i).weight){
                return false;
            }
        }

        return true;
    }
    public void doneSet(int repsDone, double weightDone){
        this.set_reps(repsDone, weightDone);
        this.setsDone = setsDone + 1;
        if (seekReps != null & setsDone < sets.size()) {
            seekReps.setMax(sets.get(setsDone).reps);
            seekReps.setProgress(sets.get(setsDone).reps);
        }
        if (weightUI != null & setsDone < sets.size()) {
            weightUI.setText(String.valueOf(sets.get(setsDone).weight));
        }
        if (AMRAP != null & setsDone < sets.size()){
            if (setsd.get(setsDone).AMRAP) {
                AMRAP.setVisibility(View.VISIBLE);
            } else {
                AMRAP.setVisibility(View.INVISIBLE);
            }
        }

        if (weightUI != null){
            if (weightUI.getText().toString().equals("0.0")) {
                weightUI.setText(String.valueOf(setsd.get(0).weight));
            }
        }
    }
    private void set_reps(int repsDone, double weightDone){
        // write reps to file memory
        setsd.set(setsDone, new Sets(repsDone, weightDone),"DC");
    }

    public void setUI(SeekBar seekSets1, SeekBar seekReps1, EditText weightUI1, TextView textUI1,
                      Button doneSetUI, TextView sentRepsText, Button sentAMRAP){

        this.textUI = textUI1;
        this.seekSets = seekSets1;
        this.seekReps = seekReps1;
        this.weightUI = weightUI1;
        this.doneSetUI = doneSetUI;
        this.repsText = sentRepsText;
        this.AMRAP = sentAMRAP;

    }


    private void setSetsWeightToDo(int rep,double weight,String name,boolean amrap){
        Sets serie = new Sets(rep,weight,name);
        int reps = serie.getReps();
        serie.AMRAP=amrap;
        sets.add(serie);

        this.numOfSets = sets.size();

        for (int i=0; i < numOfSets; i++){
            setsd.add(new Sets(0, weight[i]));
        }

        sets = AssignedExcers.getAmrap(sets);
        setsd = AssignedExcers.getAmrap(setsd);
    }

    public Entrainement(String excersize_sName, double[] weights){

        this.exersizeName = excersize_sName;

        this.setsDone = 0;

        setSetsWeightToDo(weights);


    }
*/
}
