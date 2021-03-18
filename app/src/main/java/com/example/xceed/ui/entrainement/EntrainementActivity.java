package com.example.xceed.ui.entrainement;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.app.NavUtils;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.xceed.MainActivity;
import com.example.xceed.R;
import com.example.xceed.SetsAdapter;
import com.example.xceed.SplashActivity;
import com.example.xceed.WorkoutAdapter;
import com.example.xceed.ui.exercice.Exercice;
import com.example.xceed.ui.exercice.ExerciceActivity;
import com.example.xceed.ui.exercice.ExerciceFragment;
import com.example.xceed.ui.profil.GereProfil;
import com.example.xceed.ui.profil.Profil;
import com.example.xceed.ui.profil.ProfilViewModel;
import com.goodiebag.protractorview.ProtractorView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.xw.repo.BubbleSeekBar;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alkassoum
 */
public class EntrainementActivity extends Activity {
        public static ArrayList<Entrainement> listEntrainement = new ArrayList<Entrainement>();
        private Exercice exCourant;
        private GereEntrainement gereEntrainement = new GereEntrainement();


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.entrainement_show);

       // ArrayList<Entrainement> listEntrainement = new ArrayList<Entrainement>();



        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        int id = intent.getIntExtra("ButtonId",0);
        int indiceExercice = 0;
        //String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        switch (id){
            case R.id.button1:
                indiceExercice = 0;
                break;
            case R.id.button2:
                indiceExercice = 1;
                break;
            case R.id.button3:
                indiceExercice = 2;
                break;
            case R.id.button4:
                indiceExercice = 3;
                break;
            case R.id.button5:
                indiceExercice = 4;
                break;
            case R.id.button6:
                indiceExercice = 5;
                break;
            case R.id.button7:
                indiceExercice = 6;
                break;
            case R.id.button8:
                indiceExercice = 7;
                break;
            case R.id.button9:
                indiceExercice = 8;
                break;
            case R.id.button10:
                indiceExercice = 9;
                break;
            case R.id.button11:
                indiceExercice = 10;
                break;
            case R.id.button12:
                indiceExercice = 11;
                break;
            case R.id.button13:
                indiceExercice = 12;
                break;
            case R.id.button14:
                indiceExercice = 13;
                break;
            case R.id.button15:
                indiceExercice = 14;
                break;
            case R.id.button16:
                indiceExercice = 15;
                break;
            case R.id.button17:
                indiceExercice = 16;
                break;
            case R.id.button18:
                indiceExercice = 17;
                break;
            case R.id.button19:
                indiceExercice = 18;
                break;
            case R.id.button20:
                indiceExercice = 19;
                break;
            case R.id.button21:
                indiceExercice = 20;
                break;
            case R.id.button22:
                indiceExercice = 21;
                break;
            case R.id.button23:
                indiceExercice = 22;
                break;
            case R.id.button24:
                indiceExercice = 23;
                break;
            case R.id.button25:
                indiceExercice = 24;
                break;
            case R.id.button26:
                indiceExercice = 25;
                break;
            case R.id.button27:
                indiceExercice = 26;
                break;
            case R.id.button28:
                indiceExercice = 27;
                break;
            case R.id.button29:
                indiceExercice = 28;
                break;
            case R.id.button30:
                indiceExercice = 29;
                break;
        }

        exCourant = ExerciceFragment.listExercice.get(indiceExercice);
        ListView workouts =findViewById(R.id.workoutView);
        workouts.setAdapter(new WorkoutAdapter(this,listEntrainement));
    }

    public void addExercice(View v){
        //Intent intent = new Intent(EntrainementActivity.this.getActivity(), EntrainementActivity.class);
        //intent.putExtra("ButtonId",i.getId());
        //startActivity(intent);
        int position = (Integer)v.getTag();
        listEntrainement.get(position).getLstExercices().add(exCourant);
        finish();

    }
}
