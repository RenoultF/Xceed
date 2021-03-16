package com.example.xceed.ui.entrainement;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.xceed.GifImageView;
import com.example.xceed.R;
import com.example.xceed.SetsAdapter;
import com.example.xceed.ui.exercice.Exercice;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Entrainement_fb extends AppCompatActivity {
    private Intent intent;
    protected int nbJours;
    private int nbSets;
    private int nbRep;
    private List<Exercice> lstExercices;
    private List<TextView> lstTxtView = new ArrayList<TextView>();
    Exercice[] lexcersizes;
    LinearLayout linearLayout;
    public String dayNumber;
    public Entrainement_fb(int nbSets, int nbRep, LinkedList<Exercice> lstExercices){
        this.nbSets=nbSets;
        this.nbRep=nbRep;
        this.lstExercices=lstExercices;
        this.nbJours=3;


    }
    public Entrainement_fb(){
        super();
    }/*
    private void didSet(View view, Exercice excersize) {

        SeekBar numOfSets = excersize.seekSets;
        SeekBar numOfReps = excersize.seekReps;
        EditText weight = excersize.weightUI;

        String sWeight = weight.getText().toString();

        if(sWeight.equals("0.0") | sWeight.isEmpty()){
            Snackbar.make(view, "Please enter a weight before pressing done set." +
                            " Remember weight of bar or your weight.",
                    Snackbar.LENGTH_LONG).setAction("Action", null).show();
        }
        else if(numOfSets.getProgress() < numOfSets.getMax()){
            excersize.doneSet(numOfReps.getProgress(), Float.parseFloat(weight.getText().toString()));
            numOfSets.setProgress(numOfSets.getProgress() + 1);
            numOfSets.refreshDrawableState();

            final View finalView =view;
          //WorkTimer work = new WorkTimer(finalView, currentWorkTimer);

            //currentWorkTimer = work;
        }

        else{
            String sets;
            if (excersize.numOfSets == 1){
                sets = "set";
            } else{
                sets = "sets";

            }
            Snackbar.make(view, "You're done your " + excersize.numOfSets + " "+ sets + " for " + excersize.getNomExerciceEx(), Snackbar.LENGTH_LONG).setAction("Action", null).show();
        }
    }
    private void createExcerUI(final Exercice excer, LinearLayout ll) {

        final int MARGIN_TOP = 8;
        final int MARGIN_LEFT = 8;
        final int MARGIN_BOTTOM = 0;
        final int MARGIN_RIGHT = 0;

        LinearLayout header = new LinearLayout(this);


        TextView title = new TextView(this);
        title.setText(excer.getNomExerciceEx());
        RelativeLayout.LayoutParams titleParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        titleParams.addRule(RelativeLayout.BELOW, R.id.date);
        title.setIncludeFontPadding(true);

        titleParams.setMargins(MARGIN_LEFT, MARGIN_TOP, MARGIN_RIGHT, MARGIN_BOTTOM);

        header.addView(title, titleParams);


        EditText weight = new EditText(this);
        RelativeLayout.LayoutParams weightParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);

        weight.setText(String.valueOf(excer.setsToDo.get(excer.setsDone).weight));
        weightParams.addRule(RelativeLayout.RIGHT_OF, title.getId());
        weightParams.addRule(RelativeLayout.ALIGN_TOP, title.getId());
        weightParams.addRule(RelativeLayout.ALIGN_BOTTOM, title.getId());

        weightParams.setMargins(MARGIN_LEFT, MARGIN_TOP, MARGIN_RIGHT, MARGIN_BOTTOM);

        weight.setInputType(InputType.TYPE_NUMBER_FLAG_DECIMAL);

        header.addView(weight, weightParams);


        RelativeLayout.LayoutParams headerParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);

        headerParams.setMargins(MARGIN_LEFT, MARGIN_TOP, MARGIN_RIGHT, MARGIN_BOTTOM);

        ll.addView(header, headerParams);


        LinearLayout setsHolder = new LinearLayout(this);
        SeekBar setsUI = new SeekBar(this);

        setsUI.setEnabled(false);

        RelativeLayout.LayoutParams setsTextParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        setsTextParams.addRule(RelativeLayout.BELOW, header.getId());
        setsTextParams.setMargins(MARGIN_LEFT, MARGIN_TOP, MARGIN_RIGHT, MARGIN_BOTTOM);

        RelativeLayout.LayoutParams setsSlideParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        setsSlideParams.addRule(RelativeLayout.BELOW, setsHolder.getId());
        setsSlideParams.setMargins(MARGIN_LEFT, MARGIN_TOP, MARGIN_RIGHT, MARGIN_BOTTOM);

        setsUI.setMax(excer.numOfSets);
        setsUI.setProgress(excer.setsDone);

        TextView setsNum = new TextView(this);
        setsNum.setText(String.valueOf(excer.setsDone));

        final TextView finalSetsNum = setsNum;
        setsUI.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekbar, int progress, boolean fromUser) {
                finalSetsNum.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });


        TextView setsLabel = new TextView(this);
        setsLabel.setText("Sets Done");

        setsHolder.addView(setsLabel, setsTextParams);
        setsHolder.addView(setsNum, setsTextParams);
        setsHolder.addView(setsUI, setsSlideParams);
        ll.addView(setsHolder);

        final TextView repsNum = new TextView(this);
        repsNum.setText(String.valueOf(excer.setsToDo.get(excer.setsDone).reps));

        LinearLayout repsHolder = new LinearLayout(this);
        final SeekBar repsUI = new SeekBar(this);
        RelativeLayout.LayoutParams repsLabelParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        repsLabelParams.addRule(RelativeLayout.BELOW, setsHolder.getId());
        repsLabelParams.setMargins(MARGIN_LEFT, MARGIN_TOP, MARGIN_RIGHT, MARGIN_BOTTOM);

        final RelativeLayout.LayoutParams repsSlideParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        repsSlideParams.addRule(RelativeLayout.BELOW, setsHolder.getId());
        repsSlideParams.setMargins(MARGIN_LEFT, MARGIN_TOP, MARGIN_RIGHT, MARGIN_BOTTOM);

        repsUI.setMax(excer.setsToDo.get(excer.setsDone).reps);
        repsUI.setProgress(excer.setsToDo.get(excer.setsDone).reps);

        repsUI.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekbar, int progress, boolean fromUser) {
                repsNum.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });



        Button doneSet = new Button(this);
        RelativeLayout.LayoutParams doneSetParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        doneSetParams.addRule(RelativeLayout.RIGHT_OF, repsUI.getId());
        doneSetParams.setMargins(MARGIN_LEFT, MARGIN_TOP, MARGIN_RIGHT,MARGIN_BOTTOM);

        doneSet.setText("Done Set");
        doneSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                didSet(v, excer);
            }
        });


        Button AMRAP = new Button(this);
        RelativeLayout.LayoutParams AMRAPParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);

        AMRAP.setText("As many reps as possible set: Add +1");
        AMRAP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                repsUI.setMax(repsUI.getMax()+1);
                repsUI.setProgress(repsUI.getMax()+1);
            }
        });

        if (excer.curset.get(0).AMRAP) {
            AMRAP.setVisibility(View.VISIBLE);
        } else {
            AMRAP.setVisibility(View.INVISIBLE);
        }

        LinearLayout doneSetHolder = new LinearLayout(this);

        TextView repsLabel = new TextView(this);
        repsLabel.setText("Reps Done");


        repsHolder.addView(repsLabel,repsLabelParams);
        repsHolder.addView(repsNum,repsLabelParams);
        repsHolder.addView(repsUI,repsSlideParams);

        ll.addView(repsHolder);

        doneSetHolder.addView(doneSet, doneSetParams);
        doneSetHolder.addView(AMRAP, AMRAPParams);

        ll.addView(doneSetHolder);

        excer.setUI(setsUI, repsUI, weight, title,doneSet, repsNum, AMRAP);
    }



        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        intent = getIntent();

        final int MARGIN_TOP = 8;
        final int MARGIN_LEFT = 8;
        final int MARGIN_BOTTOM = 0;
        final int MARGIN_RIGHT = 0;
        LinearLayout header = new LinearLayout(this);
        LinkedList<Exercice>lstt= new LinkedList<Exercice>();
        lstt.add(new Exercice("DC1","test",0,"haut"));
        lstt.add(new Exercice("DP2","test",0,"haut"));
        lstt.add(new Exercice("DC3","test",0,"haut"));
        lstt.add(new Exercice("DC4","test",0,"haut"));
        Entrainement_fb e= new Entrainement_fb(4,12,lstt);
        intent = getIntent();
        dayNumber = intent.getStringExtra("DayNum");
        setContentView(R.layout.fragment_entrainement_show);
        linearLayout = findViewById(R.id.stuff);




            for (int i = 0; i < 4; i++) {
                TextView title = new TextView(this);
                title.setText(lstt.get(i).getNomExerciceEx());
                RelativeLayout.LayoutParams titleParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                        RelativeLayout.LayoutParams.WRAP_CONTENT);
                titleParams.addRule(RelativeLayout.BELOW, R.id.date);
                title.setIncludeFontPadding(true);

                titleParams.setMargins(MARGIN_LEFT, MARGIN_TOP, MARGIN_RIGHT, MARGIN_BOTTOM);
                lstTxtView.add(title);

                linearLayout.addView(title,titleParams);


            }
            linearLayout.removeView(lstTxtView.get(lstTxtView.size()-1));

            setContentView(R.layout.fragment_entrainement_show);

            String[] slExcersizes = getIntent().getStringArrayExtra("Excersizes");
            final String routineName = getIntent().getStringExtra("RoutineName");

            final String programName = getIntent().getStringExtra("program");

            final String dateString = getDateString();

            TextView bDate = findViewById(R.id.date);
            bDate.setText(dateString);

            LinearLayout ll = findViewById(R.id.stuff);
            lexcersizes = new Exercice[slExcersizes.length];
            for(int i=0;i<slExcersizes.length;i++){
                lexcersizes[i]=new Exercice("DC","test",0,"haut");
            }
            LastWorkout todaysWorkout = ExternalStore.getLastidxProp(0);

            boolean lastWorkoutOnPause;

            if (todaysWorkout == null ) {
                lastWorkoutOnPause = false;
            } else {
                lastWorkoutOnPause = todaysWorkout.onPause;
            }

            // Resume today's workout
            if (lastWorkoutOnPause) {
                for (int i = 0; i < slExcersizes.length; i++) {
                    lexcersizes[i] = todaysWorkout.excersizesDone.get(i);
                }
            } else {
                List<NextExcersize>  metaNext = new AssignedExcers().nextRoutineWeightsCheck(slExcersizes, this.getBaseContext());
                for (int i = 0; i < slExcersizes.length; i++) {
                    lexcersizes[i] = new Excersize(slExcersizes[i], metaNext.get(i).excersizeWeight);
                }
            }

            for (int i =0; i < slExcersizes.length; i++) {
                createExcerUI(lexcersizes[i], ll);
            }

            final Button doneWork = new Button(this);
            doneWork.setText("Done Workout");
            ll.addView(doneWork);

            doneWork.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //writeData(routineName, dateString, programName, pausing, v);
                }
            });

            //this.doneWork = doneWork;
            //pausing = false;

    }
    private String appendZero(String original){
        if(original.length() == 1){
            return "0" + original;
        }
        else {
            return original;
        }
    }

    private String getDateString() {

        long day = getIntent().getLongExtra("day", 0);
        long month = getIntent().getLongExtra("month", 0);
        long year = getIntent().getLongExtra("year", 0);

        return year + "-" + appendZero(String.valueOf(month)) + "-" + appendZero(String.valueOf(day));
    }*/
    @Override
    protected void onCreate(Bundle savecInstanceState){
        super.onCreate(savecInstanceState);
        setContentView(R.layout.fragment_entrainement_show);
        //list of sets
        List<Sets> sets = new ArrayList<>();

        sets.add(new Sets(15,10,"Exercice DC",true));
        sets.add(new Sets(10,10,"Exercice C",true));
        sets.add(new Sets(12,10,"Exercice aC",true));
        sets.add(new Sets(18,10,"Exercice bC",true));
        //get list view
        ListView lstView = findViewById(R.id.ListView1);
        lstView.setAdapter(new SetsAdapter(this,sets));
    }
}

