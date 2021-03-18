package com.example.xceed.ui.profil;

import android.widget.TextView;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.xceed.R;

public class ProfilViewModel extends ViewModel {

    private MutableLiveData<String> mText;


    public ProfilViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");

    }

    public LiveData<String> getText() {
        return mText;
    }

    //fonction permettant de calculer l'imc en direct
    public float calculImcActuel(String taille, String poid){
        float tailleImc = (float)Float.parseFloat(taille)/100;
        float poidsImc = (float)Float.parseFloat(poid);
        return poidsImc/(tailleImc*tailleImc);
    }



}