package com.example.xceed.ui.entrainement;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.xceed.R;
import com.example.xceed.ui.entrainement.EntrainementViewModel;
import com.example.xceed.ui.profil.ProfilViewModel;
import com.goodiebag.protractorview.ProtractorView;
import com.xw.repo.BubbleSeekBar;

public class EntrainementFragment extends Fragment {

    private EntrainementViewModel entrainementViewModel;
    private Button lunch_split;
    private Button lunch_ppl;
    private Button lunch_hf;
    private Button lunch_fb;
    //private Entrainement entrainement;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        entrainementViewModel =
                new ViewModelProvider(this).get(EntrainementViewModel.class);
        View root = inflater.inflate(R.layout.fragment_entrainement, container, false);
        //entrainement = new Entrainement();
        //entrainementRecup = entrainement.recupEntrainement(getContext());
        lunch_fb =(Button) root.findViewById(R.id.buttone1);
        lunch_hf =(Button) root.findViewById(R.id.buttone2);
        lunch_ppl =(Button) root.findViewById(R.id.buttone3);
        lunch_split =(Button) root.findViewById(R.id.buttone4);


        return root;
    }

}