package com.example.xceed.ui.chronometre;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
/**
 * Created by Alkassoum
 */
public class ChronometreViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ChronometreViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is notifications fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}