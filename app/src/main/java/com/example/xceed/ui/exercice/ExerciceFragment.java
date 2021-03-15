package com.example.xceed.ui.exercice;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.xceed.R;
import com.example.xceed.ui.entrainement.EntrainementFragment;
import com.example.xceed.ui.entrainement.FbActivity;

public class ExerciceFragment extends Fragment {

    private ExerciceViewModel exerciceViewModel;
    private Button lunch_dc;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        exerciceViewModel =
                new ViewModelProvider(this).get(ExerciceViewModel.class);
        View root = inflater.inflate(R.layout.fragment_exercice, container, false);
        lunch_dc =(Button) root.findViewById(R.id.button);
        lunch_dc.setOnClickListener(new View.OnClickListener() {



            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                Intent intent = new Intent(ExerciceFragment.this.getActivity(), ExerciceActivity.class);
                startActivity(intent);
            }
        });

        
        return root;
    }
}