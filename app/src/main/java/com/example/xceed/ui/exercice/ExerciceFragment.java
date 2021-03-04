package com.example.xceed.ui.exercice;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.xceed.R;

public class ExerciceFragment extends Fragment {

    private ExerciceViewModel exerciceViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        exerciceViewModel =
                new ViewModelProvider(this).get(ExerciceViewModel.class);
        View root = inflater.inflate(R.layout.fragment_exercice, container, false);
        
        return root;
    }
}