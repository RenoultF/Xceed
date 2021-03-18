package com.example.xceed.ui.entrainement;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.xceed.AdapterExercice;
import com.example.xceed.R;
import com.example.xceed.SetsAdapter;
import com.example.xceed.ui.exercice.Exercice;
/**
 * Created by Alkassoum
 */
public class Entrainement {
    public LinkedList<Sets> sets;
    private LinkedList<Sets> setsDone;
    public ArrayList<Exercice> lstExercices = new ArrayList<Exercice>();
    public String nomEntrainement;
    private int idImgEntrainement;

    private GereEntrainement gereEntrainement = new GereEntrainement();


    public Entrainement(String nomEntrainement,int idImgEntrainement) {
        this.nomEntrainement = nomEntrainement;
        this.idImgEntrainement = idImgEntrainement;
    }


    public void setLstExercices(ArrayList<Exercice> lstExercices) {
        this.lstExercices = lstExercices;
    }

    public String getNomEntrainement() {
        return nomEntrainement;
    }

    public ArrayList<Exercice> getLstExercices() {
        return lstExercices;
    }

    public void addExercice(Exercice a) {
        lstExercices.add(a);
    }

    public int getIdImgEntrainement() {
        return idImgEntrainement;
    }

    /*  public void setNbRep(int nbRep) {
        this.nbRep = nbRep;
    }
*/




}