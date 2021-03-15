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

import java.util.ArrayList;
import java.util.List;

public class ExerciceFragment extends Fragment {

    private ExerciceViewModel exerciceViewModel;
    private Button lunch_dc;
    private List<Button> all_buton;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        all_buton=new ArrayList<Button>();
        exerciceViewModel =
                new ViewModelProvider(this).get(ExerciceViewModel.class);
        View root = inflater.inflate(R.layout.fragment_exercice, container, false);
        all_buton.add((Button) root.findViewById(R.id.button));
        all_buton.add((Button) root.findViewById(R.id.button2));
        all_buton.add((Button) root.findViewById(R.id.button3));
        all_buton.add((Button) root.findViewById(R.id.button4));
        all_buton.add((Button) root.findViewById(R.id.button5));
        all_buton.add((Button) root.findViewById(R.id.button6));
        all_buton.add((Button) root.findViewById(R.id.button7));
        all_buton.add((Button) root.findViewById(R.id.button8));
        all_buton.add((Button) root.findViewById(R.id.button9));
        all_buton.add((Button) root.findViewById(R.id.button10));
        all_buton.add((Button) root.findViewById(R.id.button11));
        all_buton.add((Button) root.findViewById(R.id.button12));
        all_buton.add((Button) root.findViewById(R.id.button13));
        all_buton.add((Button) root.findViewById(R.id.button14));
        all_buton.add((Button) root.findViewById(R.id.button15));
        all_buton.add((Button) root.findViewById(R.id.button16));
        all_buton.add((Button) root.findViewById(R.id.button17));
        all_buton.add((Button) root.findViewById(R.id.button18));
        all_buton.add((Button) root.findViewById(R.id.button19));
        all_buton.add((Button) root.findViewById(R.id.button20));
        all_buton.add((Button) root.findViewById(R.id.button21));
        all_buton.add((Button) root.findViewById(R.id.button22));
        all_buton.add((Button) root.findViewById(R.id.button23));
        all_buton.add((Button) root.findViewById(R.id.button24));
        all_buton.add((Button) root.findViewById(R.id.button25));
        all_buton.add((Button) root.findViewById(R.id.button26));
        all_buton.add((Button) root.findViewById(R.id.button27));
        all_buton.add((Button) root.findViewById(R.id.button28));
        all_buton.add((Button) root.findViewById(R.id.button29));
        all_buton.add((Button) root.findViewById(R.id.button30));



        lunch_dc =(Button) root.findViewById(R.id.button);
        int comp=0;
        for(Button i : all_buton){
            i.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(ExerciceFragment.this.getActivity(), ExerciceActivity.class);
                    intent.putExtra("ButtonId",i.getId());

                    startActivity(intent);

                }
            });
            comp+=1;
        }/*
        lunch_dc.setOnClickListener(new View.OnClickListener() {



            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                Intent intent = new Intent(ExerciceFragment.this.getActivity(), ExerciceActivity.class);
                startActivity(intent);
            }
        });*/

        
        return root;
    }
}