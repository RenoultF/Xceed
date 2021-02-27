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



}