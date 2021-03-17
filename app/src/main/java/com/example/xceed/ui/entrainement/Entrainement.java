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
public class Entrainement extends AppCompatActivity {
    public LinkedList<Sets> sets;
    private LinkedList<Sets> setsDone;
    public ArrayList<Exercice> lstExercices;
    public String nomEntrainement;
    public Entrainement(){




    }
    public Entrainement(String nomEntrainement){


        this.lstExercices = new ArrayList<Exercice>();
        this.nomEntrainement = nomEntrainement;
        for (Exercice temp : lstExercices) {
           // setsToDo.add(new Sets(this.nbRep,100,temp.getNomExerciceEx(),true));
        }

    }


    public void setLstExercices(ArrayList<Exercice> lstExercices) {
        this.lstExercices = lstExercices;
    }

public void addExercice(Exercice a){
        this.lstExercices.add(a);
}

  /*  public void setNbRep(int nbRep) {
        this.nbRep = nbRep;
    }
*/

    @Override
    protected void onCreate(Bundle savecInstanceState){
        super.onCreate(savecInstanceState);
        setContentView(R.layout.fragment_entrainement_show);
        //list of sets
        List<Exercice> sets=new ArrayList<Exercice>();

        int c = getIntent().getIntExtra("Numinlst",0);

        for(Exercice e :EntrainementActivity.listEntrainement.get(c).lstExercices){
            sets.add(e);
        }
        Button quit = (Button) findViewById(R.id.btn_quitter);
        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        ListView lstView = findViewById(R.id.ListView1);
        lstView.setAdapter(new AdapterExercice(this,sets));
        int indiceExercice = 0;
        /*switch (c){
            case R.id.button1:
                indiceExercice = 0;
                break;
            case R.id.button2:
                indiceExercice = 1;
                break;
            case R.id.button3:
                indiceExercice = 2;
                break;
            case R.id.button4:
                indiceExercice = 3;
                break;
            case R.id.button5:
                indiceExercice = 4;
                break;
            case R.id.button6:
                indiceExercice = 5;
                break;
            case R.id.button7:
                indiceExercice = 6;
                break;
            case R.id.button8:
                indiceExercice = 7;
                break;
            case R.id.button9:
                indiceExercice = 8;
                break;
            case R.id.button10:
                indiceExercice = 9;
                break;
            case R.id.button11:
                indiceExercice = 10;
                break;
            case R.id.button12:
                indiceExercice = 11;
                break;
            case R.id.button13:
                indiceExercice = 12;
                break;
            case R.id.button14:
                indiceExercice = 13;
                break;
            case R.id.button15:
                indiceExercice = 14;
                break;
            case R.id.button16:
                indiceExercice = 15;
                break;
            case R.id.button17:
                indiceExercice = 16;
                break;
            case R.id.button18:
                indiceExercice = 17;
                break;
            case R.id.button19:
                indiceExercice = 18;
                break;
            case R.id.button20:
                indiceExercice = 19;
                break;
            case R.id.button21:
                indiceExercice = 20;
                break;
            case R.id.button22:
                indiceExercice = 21;
                break;
            case R.id.button23:
                indiceExercice = 22;
                break;
            case R.id.button24:
                indiceExercice = 23;
                break;
            case R.id.button25:
                indiceExercice = 24;
                break;
            case R.id.button26:
                indiceExercice = 25;
                break;
            case R.id.button27:
                indiceExercice = 26;
                break;
            case R.id.button28:
                indiceExercice = 27;
                break;
            case R.id.button29:
                indiceExercice = 28;
                break;
            case R.id.button30:
                indiceExercice = 29;
                break;
        */}/*
        switch (c){
            case R.id.hf_day1://jour 1 hf body
                sets.add(new Sets(15, 10, new Exercice("Developpé couché (Barre)", "Ceci est du dev Couch", R.drawable.gif_dc, "Pectoraux"), true));
                sets.add(new Sets(10, 10, new Exercice("Developpé couché incliné (Barre)", "Ceci est du dev Couch incliné", R.drawable.gif_devinc, "Pectoraux (Haut)"), true));
                sets.add(new Sets(12, 10, new Exercice("Developpé couché décliné (Barre)", "Ceci est du dev Couch décliné", R.drawable.gif_devdec, "Pectoraux (Bas)"), true));
                sets.add(new Sets(18, 10, new Exercice("Ecarté (Haltere)", "Ceci est de l'écarté", R.drawable.gif_ecarte, "Pectoraux"), true));
                break;
            case R.id.hf_day2:
                sets.add(new Sets(15, 10, new Exercice("Developpé couché (Barre)", "Ceci est du dev Couch", R.drawable.gif_dc, "Pectoraux"), true));
                sets.add(new Sets(10, 10, new Exercice("Developpé couché incliné (Barre)", "Ceci est du dev Couch incliné", R.drawable.gif_devinc, "Pectoraux (Haut)"), true));
                sets.add(new Sets(12, 10, new Exercice("Developpé couché décliné (Barre)", "Ceci est du dev Couch décliné", R.drawable.gif_devdec, "Pectoraux (Bas)"), true));
                sets.add(new Sets(18, 10, new Exercice("Ecarté (Haltere)", "Ceci est de l'écarté", R.drawable.gif_ecarte, "Pectoraux"), true));
                break;
            case R.id.hf_day3:
                sets.add(new Sets(15, 10, new Exercice("Developpé couché (Barre)", "Ceci est du dev Couch", R.drawable.gif_dc, "Pectoraux"), true));
                sets.add(new Sets(10, 10, new Exercice("Developpé couché incliné (Barre)", "Ceci est du dev Couch incliné", R.drawable.gif_devinc, "Pectoraux (Haut)"), true));
                sets.add(new Sets(12, 10, new Exercice("Developpé couché décliné (Barre)", "Ceci est du dev Couch décliné", R.drawable.gif_devdec, "Pectoraux (Bas)"), true));
                sets.add(new Sets(18, 10, new Exercice("Ecarté (Haltere)", "Ceci est de l'écarté", R.drawable.gif_ecarte, "Pectoraux"), true));
                break;
            case R.id.hf_day4:
                sets.add(new Sets(15, 10, new Exercice("Developpé couché (Barre)", "Ceci est du dev Couch", R.drawable.gif_dc, "Pectoraux"), true));
                sets.add(new Sets(10, 10, new Exercice("Developpé couché incliné (Barre)", "Ceci est du dev Couch incliné", R.drawable.gif_devinc, "Pectoraux (Haut)"), true));
                sets.add(new Sets(12, 10, new Exercice("Developpé couché décliné (Barre)", "Ceci est du dev Couch décliné", R.drawable.gif_devdec, "Pectoraux (Bas)"), true));
                sets.add(new Sets(18, 10, new Exercice("Ecarté (Haltere)", "Ceci est de l'écarté", R.drawable.gif_ecarte, "Pectoraux"), true));
                break;
            default:

                break;

        }
        // Entrainement_fb e=  new Entrainement_fb( new Sets(15,10,new Exercice("Developpé couché (Barre)","Ceci est du dev Couch",R.drawable.gif_dc,"Pectoraux"),true));
        //get list view
        ListView lstView = findViewById(R.id.list_entrainement);
        lstView.setAdapter(new SetsAdapter(this,lis));
    }}*/}

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

}
*/