package com.example.xceed.ui.entrainement;

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
import com.example.xceed.ui.exercice.ExerciceViewModel;

public class EntrainementFragment extends Fragment {

    private ExerciceViewModel entrainementViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        entrainementViewModel =
                new ViewModelProvider(this).get(ExerciceViewModel.class);
        View root = inflater.inflate(R.layout.fragment_entrainement, container, false);
        final TextView textView = root.findViewById(R.id.text_dashboard);
        entrainementViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}