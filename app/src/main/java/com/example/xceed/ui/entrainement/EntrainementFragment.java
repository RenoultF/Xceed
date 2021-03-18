package com.example.xceed.ui.entrainement;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.xceed.AdapterWorkoutFragment;
import com.example.xceed.MainActivity;
import com.example.xceed.R;
import com.example.xceed.SetsAdapter;
import com.example.xceed.ui.entrainement.EntrainementViewModel;
import com.example.xceed.ui.exercice.Exercice;
import com.example.xceed.ui.profil.ProfilFragment;
import com.example.xceed.ui.profil.ProfilViewModel;
import com.goodiebag.protractorview.ProtractorView;
import com.xw.repo.BubbleSeekBar;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Alkassoum
 */
public class EntrainementFragment extends Fragment {

    private EntrainementViewModel entrainementViewModel;
    private Button lunch_split;
    private Button lunch_ppl;
    private Button lunch_hf;
    private Button lunch_fb;





    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        entrainementViewModel =
                new ViewModelProvider(this).get(EntrainementViewModel.class);
        View root = inflater.inflate(R.layout.workout_show, container, false);

        ListView lstView = root.findViewById(R.id.workout_show);
        lstView.setAdapter(new AdapterWorkoutFragment(getActivity(),EntrainementActivity.listEntrainement));


        return root;
    }

}