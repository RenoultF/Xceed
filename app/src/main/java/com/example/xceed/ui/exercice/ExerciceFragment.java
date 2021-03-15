package com.example.xceed.ui.exercice;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
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
    private ImageView lunch_dc;
    private List<ImageView> all_buton;

    public static ArrayList<Exercice> listExercice;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        all_buton = new ArrayList<ImageView>();
        listExercice = new ArrayList<Exercice>();
        exerciceViewModel =
                new ViewModelProvider(this).get(ExerciceViewModel.class);
        View root = inflater.inflate(R.layout.fragment_exercice, container, false);
<<<<<<< HEAD
        all_buton.add((ImageView) root.findViewById(R.id.imgEx1));
        all_buton.add((ImageView) root.findViewById(R.id.imgEx2));
        all_buton.add((ImageView) root.findViewById(R.id.imgEx3));
        all_buton.add((ImageView) root.findViewById(R.id.imgEx4));
        all_buton.add((ImageView) root.findViewById(R.id.imgEx5));
        all_buton.add((ImageView) root.findViewById(R.id.imgEx6));
        all_buton.add((ImageView) root.findViewById(R.id.imgEx7));
        all_buton.add((ImageView) root.findViewById(R.id.imgEx8));
        all_buton.add((ImageView) root.findViewById(R.id.imgEx9));
        all_buton.add((ImageView) root.findViewById(R.id.imgEx10));
        all_buton.add((ImageView) root.findViewById(R.id.imgEx11));
        all_buton.add((ImageView) root.findViewById(R.id.imgEx12));
        all_buton.add((ImageView) root.findViewById(R.id.imgEx13));
        all_buton.add((ImageView) root.findViewById(R.id.imgEx14));
        all_buton.add((ImageView) root.findViewById(R.id.imgEx15));
        all_buton.add((ImageView) root.findViewById(R.id.imgEx16));
        all_buton.add((ImageView) root.findViewById(R.id.imgEx17));
        all_buton.add((ImageView) root.findViewById(R.id.imgEx18));
        all_buton.add((ImageView) root.findViewById(R.id.imgEx19));
        all_buton.add((ImageView) root.findViewById(R.id.imgEx20));
        all_buton.add((ImageView) root.findViewById(R.id.imgEx21));
        all_buton.add((ImageView) root.findViewById(R.id.imgEx22));
        all_buton.add((ImageView) root.findViewById(R.id.imgEx23));
        all_buton.add((ImageView) root.findViewById(R.id.imgEx24));
        all_buton.add((ImageView) root.findViewById(R.id.imgEx25));
        all_buton.add((ImageView) root.findViewById(R.id.imgEx26));
        all_buton.add((ImageView) root.findViewById(R.id.imgEx27));
        all_buton.add((ImageView) root.findViewById(R.id.imgEx28));
        all_buton.add((ImageView) root.findViewById(R.id.imgEx29));
        all_buton.add((ImageView) root.findViewById(R.id.imgEx30));
        //ajout des exercice
        listExercice.add(new Exercice("Developpé couché (Barre)","Ceci est du dev Couch",R.drawable.gif_dc,"Pectoraux"));
        listExercice.add(new Exercice("Developpé couché incliné (Barre)","Ceci est du dev Couch incliné",R.drawable.gif_devinc,"Pectoraux (Haut)"));
        listExercice.add(new Exercice("Developpé couché décliné (Barre)","Ceci est du dev Couch décliné",R.drawable.gif_devdec, "Pectoraux (Bas)"));
        listExercice.add(new Exercice("Pompe","Ceci est des pompe",R.drawable.gif_pompes, "Pectoraux"));
        listExercice.add(new Exercice("Ecarté (Haltere)","Ceci est de l'écarté",R.drawable.gif_ecarte, "Pectoraux"));
        listExercice.add(new Exercice("Ecarté (Poulie)","Ceci est de l'écarté poulie",R.drawable.gif_ecarte_poulie, "Pectoraux"));





        lunch_dc =(ImageView) root.findViewById(R.id.imgEx1);

        for(ImageView i : all_buton){
=======
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
>>>>>>> cbb9a97cf884213b30fdf68b7de192a8af412d26
            i.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(ExerciceFragment.this.getActivity(), ExerciceActivity.class);
<<<<<<< HEAD
                    System.out.println(i.getId());
                    intent.putExtra("ButtonId", i.getId());
=======
                    intent.putExtra("ButtonId",i.getId());

>>>>>>> cbb9a97cf884213b30fdf68b7de192a8af412d26
                    startActivity(intent);

                }
            });
<<<<<<< HEAD
=======
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
>>>>>>> cbb9a97cf884213b30fdf68b7de192a8af412d26

        }
        return root;
    }
}