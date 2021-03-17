package com.example.xceed.ui.entrainement;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
/**
 * Created by Alkassoum
 */
public class EntrainementViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public EntrainementViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }/*
    private void didSet(view view, Exercice exercize){
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
            WorkTimer work = new WorkTimer(finalView, currentWorkTimer);

            currentWorkTimer = work;
        }

        else{
            String sets;
            if (excersize.numOfSets == 1){
                sets = "set";
            } else{
                sets = "sets";

            }
            Snackbar.make(view, "You're done your " + excersize.numOfSets + " "+ sets + " for " + excersize.excersizeName, Snackbar.LENGTH_LONG).setAction("Action", null).show();
        }
    }*/
}