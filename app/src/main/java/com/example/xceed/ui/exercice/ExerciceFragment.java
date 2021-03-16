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
import com.example.xceed.ui.entrainement.Entrainement;
import com.example.xceed.ui.entrainement.EntrainementFragment;
import com.example.xceed.ui.entrainement.Entrainement_fb;
import com.example.xceed.ui.entrainement.FbActivity;

import java.util.ArrayList;
import java.util.List;

public class ExerciceFragment extends Fragment {

    private ExerciceViewModel exerciceViewModel;
    private ImageView lunch_dc;
    private List<ImageView> all_buton;

    public static ArrayList<Exercice> listExercice;
    public static List<Button> lstbtnadd;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        all_buton = new ArrayList<ImageView>();
        listExercice = new ArrayList<Exercice>();
        exerciceViewModel =
                new ViewModelProvider(this).get(ExerciceViewModel.class);
        View root = inflater.inflate(R.layout.fragment_exercice, container, false);
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

        /*lstbtnadd.add((Button) root.findViewById(R.id.button1));
        lstbtnadd.add((Button) root.findViewById(R.id.button2));
        lstbtnadd.add((Button) root.findViewById(R.id.button3));
        lstbtnadd.add((Button) root.findViewById(R.id.button4));
        lstbtnadd.add((Button) root.findViewById(R.id.button5));
        lstbtnadd.add((Button) root.findViewById(R.id.button6));
        lstbtnadd.add((Button) root.findViewById(R.id.button7));
        lstbtnadd.add((Button) root.findViewById(R.id.button8));
        lstbtnadd.add((Button) root.findViewById(R.id.button9));
        lstbtnadd.add((Button) root.findViewById(R.id.button10));
        lstbtnadd.add((Button) root.findViewById(R.id.button11));
        lstbtnadd.add((Button) root.findViewById(R.id.button12));
        lstbtnadd.add((Button) root.findViewById(R.id.button13));
        lstbtnadd.add((Button) root.findViewById(R.id.button14));
        lstbtnadd.add((Button) root.findViewById(R.id.button15));
        lstbtnadd.add((Button) root.findViewById(R.id.button16));
        lstbtnadd.add((Button) root.findViewById(R.id.button17));
        lstbtnadd.add((Button) root.findViewById(R.id.button18));
        lstbtnadd.add((Button) root.findViewById(R.id.button19));
        lstbtnadd.add((Button) root.findViewById(R.id.button20));
        lstbtnadd.add((Button) root.findViewById(R.id.button21));
        lstbtnadd.add((Button) root.findViewById(R.id.button22));
        lstbtnadd.add((Button) root.findViewById(R.id.button23));
        lstbtnadd.add((Button) root.findViewById(R.id.button23));
        lstbtnadd.add((Button) root.findViewById(R.id.button24));
        lstbtnadd.add((Button) root.findViewById(R.id.button25));
        lstbtnadd.add((Button) root.findViewById(R.id.button26));
        lstbtnadd.add((Button) root.findViewById(R.id.button27));
        lstbtnadd.add((Button) root.findViewById(R.id.button28));
        lstbtnadd.add((Button) root.findViewById(R.id.button29));
        lstbtnadd.add((Button) root.findViewById(R.id.button30));*/
        //ajout des exercice
        listExercice.add(new Exercice("Developpé couché (Barre)","Ceci est du dev Couch",R.drawable.gif_dc,"Pectoraux"));
        listExercice.add(new Exercice("Developpé couché incliné (Barre)","Ceci est du dev Couch incliné",R.drawable.gif_devinc,"Pectoraux (Haut)"));
        listExercice.add(new Exercice("Developpé couché décliné (Barre)","Ceci est du dev Couch décliné",R.drawable.gif_devdec, "Pectoraux (Bas)"));
        listExercice.add(new Exercice("Pompe","Ceci est des pompe",R.drawable.gif_pompes, "Pectoraux"));
        listExercice.add(new Exercice("Ecarté (Haltere)","Ceci est de l'écarté",R.drawable.gif_ecarte, "Pectoraux"));
        listExercice.add(new Exercice("Ecarté (Poulie)","Ceci est de l'écarté poulie",R.drawable.gif_ecarte_poulie, "Pectoraux"));
        listExercice.add(new Exercice("Developpé couché Haltere","Ceci est de du dev couch haltere",R.drawable.gif_dc, "Pectoraux"));
        listExercice.add(new Exercice("Developpé incliné Haltere","Ceci est de du dev couch haltere",R.drawable.gif_developpe_incline_haltere, "Pectoraux (Haut)"));
        listExercice.add(new Exercice("Butterfly","Ceci est de du ButterFly",R.drawable.gif_butterfly, "Pectoraux"));
        listExercice.add(new Exercice("Traction","Ceci est de des Tractions",R.drawable.gif_traction, "Dos (Grand Dorsal)"));
        listExercice.add(new Exercice("Tirage Vertical","Ceci est du tirage Vertical",R.drawable.gif_tirage_vertical, "Dos (Grand Dorsal)"));
        listExercice.add(new Exercice("Rowing (Barre)","Ceci est du Rowing Barre",R.drawable.gif_rowing, "Dos (Grand Dorsal)"));
        listExercice.add(new Exercice("Tirage Bucheron (Haltere)","Ceci est du Tirage Bucheron",R.drawable.gif_tirage_bucheron, "Dos (Grand Dorsal)"));
        listExercice.add(new Exercice("Tirage Verticale Prise Serrée (Poulie)","Ceci est Tirage Verticale Prise Serrée",R.drawable.gif_tirage_vertical, "Dos (Grand/Petit Rond)"));
        listExercice.add(new Exercice("Soulever de Terre (Barre)","Ceci est Soulever de Terre",R.drawable.gif_soulever_de_terre, "Dos (Lombaire)"));
        listExercice.add(new Exercice("Curl (Barre)","Ceci est du curl",R.drawable.gif_curl_barre, "Biceps"));
        listExercice.add(new Exercice("Curl Concentré (Haltere)","Ceci est du curl concentrée",R.drawable.gif_curl_concentre, "Biceps"));
        listExercice.add(new Exercice("Curl Prise Marteau (Haltere)","Ceci est du curl concentrée marteau",R.drawable.gif_prise_marteau, "Biceps"));
        listExercice.add(new Exercice("Curl Larry Scott (Haltere)","Ceci est du curl Larry Scott",R.drawable.temp, "Biceps"));
        listExercice.add(new Exercice("Dips","Ceci est du dips",R.drawable.gif_dips, "Triceps/Pectoraux"));
        listExercice.add(new Exercice("Extension couché (Barre)","Ceci est du extension couché",R.drawable.gif_extension_couche, "Triceps"));
        listExercice.add(new Exercice("Extension (Poulie)","Ceci est du extension poulie",R.drawable.gif_extension_poulie, "Triceps"));
        listExercice.add(new Exercice("Extension inclinée (Poulie)","Ceci est du extension inclinée poulie",R.drawable.gif_extension_incline, "Triceps"));
        listExercice.add(new Exercice("Extension Verticale (Haltere)","Ceci est du extension Verticale Haltere",R.drawable.gif_extension_verticale, "Triceps"));
        listExercice.add(new Exercice("Squat (Barre)","Ceci est du Squat",R.drawable.gif_squat, "Fessier/Jambe"));
        listExercice.add(new Exercice("Soulever de Terre Jambes Tendues (Barre)","Ceci est du Soulever de Terre Jambes Tendues",R.drawable.gif_soulever_de_terre_jambe_tendues, "Fessier/Jambe"));
        listExercice.add(new Exercice("Leg Extension","Ceci est du Leg Extension",R.drawable.gif_leg_extension, "Jambe"));
        listExercice.add(new Exercice("Press Cuisse","Ceci est du Press Cuisse",R.drawable.gif_press_cuisse, "Jambe"));
        listExercice.add(new Exercice("Leg Curl","Ceci est du Leg Curl",R.drawable.gif_leg_curl, "Jambe"));
        listExercice.add(new Exercice("Fente (Haltere)","Ceci est des fentes",R.drawable.gif_fente, "Jambe"));


        /*for(Button i : lstbtnadd){
            i.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(ExerciceFragment.this.getActivity(), Entrainement_fb.class);
                    intent.putExtra("ButtonId",i.getId());
                    startActivity(intent);

                }
            });
        }*/










        lunch_dc =(ImageView) root.findViewById(R.id.imgEx1);

        for(ImageView i : all_buton){
            i.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(ExerciceFragment.this.getActivity(), ExerciceActivity.class);
                    intent.putExtra("ButtonId",i.getId());
                    startActivity(intent);

                }
            });
        }
        return root;
    }
}