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
       // ArrayList<Entrainement> listEntrainement = new ArrayList<Entrainement>();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.entrainement_show);
        ArrayList<Entrainement> listEntrainement = new ArrayList<Entrainement>();
        listEntrainement.add(new Entrainement("FB"));
        listEntrainement.add(new Entrainement("HF"));
        listEntrainement.add(new Entrainement("Split"));
        listEntrainement.add(new Entrainement("PPl"));


        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        //String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        // TextView textView = findViewById(R.id.textView);
        //textView.setText(message);
        ListView workouts =findViewById(R.id.workoutView);
        workouts.setAdapter(new WorkoutAdapter(this,listEntrainement));
        

    }





}
