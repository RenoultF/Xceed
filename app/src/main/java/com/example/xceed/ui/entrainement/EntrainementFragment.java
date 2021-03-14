package com.example.xceed.ui.entrainement;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.xceed.MainActivity;
import com.example.xceed.R;
import com.example.xceed.ui.entrainement.EntrainementViewModel;
import com.example.xceed.ui.exercice.Exercice;
import com.example.xceed.ui.profil.ProfilFragment;
import com.example.xceed.ui.profil.ProfilViewModel;
import com.goodiebag.protractorview.ProtractorView;
import com.xw.repo.BubbleSeekBar;

import java.util.Collection;
import java.util.LinkedList;

public class EntrainementFragment extends Fragment {

    private EntrainementViewModel entrainementViewModel;
    private Button lunch_split;
    private Button lunch_ppl;
    private Button lunch_hf;
    private Button lunch_fb;
    private Entrainement_fb entrainement_fb;
    private Entrainement_hf entrainement_hf;
    private Entrainement_ppl entrainement_ppl;
    private Entrainement_split entrainement_split;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        entrainementViewModel =
                new ViewModelProvider(this).get(EntrainementViewModel.class);
        View root = inflater.inflate(R.layout.fragment_entrainement, container, false);
        /*entrainement_fb = new Entrainement_fb(4,12,new LinkedList<Exercice>((Collection<? extends Exercice>) new Exercice("deevcouch")));
        entrainement_hf = new Entrainement_hf(4,12,new LinkedList<Exercice>((Collection<? extends Exercice>) new Exercice("deevcouch")));
        entrainement_ppl = new Entrainement_ppl(4,12,new LinkedList<Exercice>((Collection<? extends Exercice>) new Exercice("deevcouch")));
        entrainement_split = new Entrainement_split(4,12,new LinkedList<Exercice>((Collection<? extends Exercice>) new Exercice("deevcouch")));*/

        //entrainementRecup = entrainement.recupEntrainement(getContext());
        lunch_fb =(Button) root.findViewById(R.id.buttone2);
        lunch_hf =(Button) root.findViewById(R.id.buttone3);
        lunch_ppl =(Button) root.findViewById(R.id.buttone1);
        lunch_split =(Button) root.findViewById(R.id.buttone4);
        lunch_fb.setOnClickListener(new View.OnClickListener() {



                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub

                        Intent intent = new Intent(EntrainementFragment.this.getActivity(), FbActivity.class);
                        startActivity(intent);
                }
            });
        lunch_split.setOnClickListener(new View.OnClickListener() {



            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                startActivity(new Intent(EntrainementFragment.this.getActivity(), SplitActivity.class));            }
        });
        lunch_ppl.setOnClickListener(new View.OnClickListener() {



            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                startActivity(new Intent(EntrainementFragment.this.getActivity(), PplActivity.class));            }
        });
        lunch_hf.setOnClickListener(new View.OnClickListener() {



            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                startActivity(new Intent(EntrainementFragment.this.getActivity(), HfActivity.class));            }
        });

        return root;
    }

}