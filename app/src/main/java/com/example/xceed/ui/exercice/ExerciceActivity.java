package com.example.xceed.ui.exercice;
import android.app.Activity;
import android.content.Intent;
<<<<<<< HEAD
=======
import android.graphics.drawable.Drawable;
>>>>>>> cbb9a97cf884213b30fdf68b7de192a8af412d26
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.xceed.GifImageView;

import com.example.xceed.R;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ExerciceActivity extends Activity {
<<<<<<< HEAD

    public static int draws[]={R.drawable.gif_dc,R.drawable.gif_devinc,R.drawable.gif_devdec,R.drawable.gif_pompes,R.drawable.gif_ecarte};
    Intent intent;
    int buttonId;
    int indiceExercice;
    private Exercice exerciceCourant;
    private GifImageView gifImageView;
    private TextView text_exercice;
    private TextView text_description;
    private TextView text_categorie;

=======
    public static int draws[]={R.drawable.gif_dc,R.drawable.gif_devinc,R.drawable.gif_devdec,R.drawable.gif_pompes,R.drawable.gif_ecarte};
    Intent intent;
    int buttonId;
>>>>>>> cbb9a97cf884213b30fdf68b7de192a8af412d26
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        intent = getIntent();

<<<<<<< HEAD
        intent = getIntent();
=======
>>>>>>> cbb9a97cf884213b30fdf68b7de192a8af412d26
        buttonId = intent.getIntExtra("ButtonId", 0);

        setContentView(R.layout.exercize_info);

<<<<<<< HEAD
        gifImageView = (GifImageView) findViewById(R.id.GifImageView);
        text_exercice = (TextView) findViewById(R.id.txt_exercice);
        text_description = (TextView) findViewById(R.id.txt_descriptif);
        text_categorie = (TextView) findViewById(R.id.txt_categorie);

        switch (buttonId){
            case R.id.imgEx1:
                indiceExercice = 0;
                break;
            case R.id.imgEx2:
                indiceExercice = 1;
                break;
            case R.id.imgEx3:
                indiceExercice = 2;
                break;
            case R.id.imgEx4:
                indiceExercice = 3;
                break;
            case R.id.imgEx5:
                indiceExercice = 4;
                break;
            case R.id.imgEx6:
                indiceExercice = 5;
                break;
            case R.id.imgEx7:
                indiceExercice = 6;
                break;
            case R.id.imgEx8:
                indiceExercice = 7;
                break;
            case R.id.imgEx9:
                indiceExercice = 8;
                break;
            case R.id.imgEx10:
                indiceExercice = 9;
                break;
            case R.id.imgEx11:
                indiceExercice = 10;
                break;
            case R.id.imgEx12:
                indiceExercice = 11;
                break;
            case R.id.imgEx13:
                indiceExercice = 12;
                break;
            case R.id.imgEx14:
                indiceExercice = 13;
                break;
            case R.id.imgEx15:
                indiceExercice = 14;
                break;
            case R.id.imgEx16:
                indiceExercice = 15;
                break;
            case R.id.imgEx17:
                indiceExercice = 16;
                break;
            case R.id.imgEx18:
                indiceExercice = 17;
                break;
            case R.id.imgEx19:
                indiceExercice = 18;
                break;
            case R.id.imgEx20:
                indiceExercice = 19;
                break;
            case R.id.imgEx21:
                indiceExercice = 20;
                break;
            case R.id.imgEx22:
                indiceExercice = 21;
                break;
            case R.id.imgEx23:
                indiceExercice = 22;
                break;
            case R.id.imgEx24:
                indiceExercice = 23;
                break;
            case R.id.imgEx25:
                indiceExercice = 24;
                break;
            case R.id.imgEx26:
                indiceExercice = 25;
                break;
            case R.id.imgEx27:
                indiceExercice = 26;
                break;
            case R.id.imgEx28:
                indiceExercice = 27;
                break;
            case R.id.imgEx29:
                indiceExercice = 28;
                break;
            case R.id.imgEx30:
                indiceExercice = 29;
                break;
        }
        exerciceCourant = ExerciceFragment.listExercice.get(indiceExercice);
        gifImageView.setGifImageResource(exerciceCourant.getIdGif());
        text_exercice.setText(exerciceCourant.getNomExerciceEx());
        text_categorie.setText(exerciceCourant.getCategorie());
        text_description.setText(exerciceCourant.getDescriptionExercice());
=======
            GifImageView gifImageView = (GifImageView) findViewById(R.id.GifImageView);
            switch (buttonId){
                case R.id.button:
                    gifImageView.setGifImageResource(draws[0]);
                    break;
                case R.id.button2:
                    gifImageView.setGifImageResource(draws[1]);
                    break;
                case R.id.button3:
                    gifImageView.setGifImageResource(draws[2]);
                    break;
                case R.id.button4:
                    gifImageView.setGifImageResource(draws[3]);
                    break;
                case R.id.button5:
                    gifImageView.setGifImageResource(draws[4]);
                    break;


        }
>>>>>>> cbb9a97cf884213b30fdf68b7de192a8af412d26
    }
}
