package com.example.xceed.ui.chronometre;

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

public class ChronometreFragment extends Fragment {

    private ChronometreViewModel chronometreViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        chronometreViewModel =
                new ViewModelProvider(this).get(ChronometreViewModel.class);
        View root = inflater.inflate(R.layout.fragment_chronometre, container, false);
        final TextView textView = root.findViewById(R.id.text_notifications);
        chronometreViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}