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
    public List<Sets> setsToDo = new ArrayList<>();

    // This variable holds the info for the sets done
    public List<Sets> curset = new ArrayList<>();

    public int setsDone;

    public int numOfSets;
/*debut modif 15-03-21*/
    private final int idGif;
    public TextView textUI;
    public SeekBar seekSets;
    public SeekBar seekReps;
    public EditText weightUI;
    public TextView repsText;
    public Button doneSetUI;
    public Button AMRAP;
    public boolean didEverything(){
        if (this.setsDone < this.setsToDo.size()){
            return false;
        }

        for (int i = 0; i < this.setsToDo.size(); i++){
            if (this.curset.get(i).reps < this.setsToDo.get(i).reps){
                return false;
            }

            if (this.curset.get(i).weight < this.setsToDo.get(i).weight){
                return false;
            }
        }

        return true;
    }
    public void doneSet(int repsDone, double weightDone){
        this.set_reps(repsDone, weightDone);
        this.setsDone = setsDone + 1;
        if (seekReps != null & setsDone < setsToDo.size()) {
            seekReps.setMax(setsToDo.get(setsDone).reps);
            seekReps.setProgress(setsToDo.get(setsDone).reps);
        }
        if (weightUI != null & setsDone < setsToDo.size()) {
            weightUI.setText(String.valueOf(setsToDo.get(setsDone).weight));
        }
        if (AMRAP != null & setsDone < setsToDo.size()){
            if (curset.get(setsDone).AMRAP) {
                AMRAP.setVisibility(View.VISIBLE);
            } else {
                AMRAP.setVisibility(View.INVISIBLE);
            }
        }

        if (weightUI != null){
            if (weightUI.getText().toString().equals("0.0")) {
                weightUI.setText(String.valueOf(curset.get(0).weight));
            }
        }
    }

    private void set_reps(int repsDone, double weightDone){
        // write reps to file memory
        curset.set(setsDone, new Sets(repsDone, weightDone,this.getNomExerciceEx(),false));
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


    private void setSetsWeightToDo(double[] weight){
        int[] reps =  new int[]{ 15,15,15,15};
        for (int i = 0; i < reps.length; i++){
            setsToDo.add(new Sets(reps[i], weight[i],this.getNomExerciceEx(),false));
        }
        numOfSets = setsToDo.size();

        for (int i=0; i < numOfSets; i++){
            curset.add(new Sets(0, weight[i],this.getNomExerciceEx(),false));
        }

        /*setsToDo = AssignedExcers.getAmrap(setsToDo);
        curset = AssignedExcers.getAmrap(curset);*/
    }/*fin modif 15-03-21*/

    public Exercice(String nom, String dE, int idGif, String categorie){
        this.nomExercice = nom;
        this.descriptionExercice = dE;
        this.idGif = idGif;
        this.categorie = categorie;
        numOfSets = 4;

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
