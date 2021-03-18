package com.example.xceed;

import android.os.Bundle;

import com.example.xceed.ui.entrainement.Entrainement;
import com.example.xceed.ui.entrainement.EntrainementActivity;
import com.example.xceed.ui.entrainement.GereEntrainement;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class MainActivity extends AppCompatActivity {

    private GereEntrainement gereEntrainement;
    private Entrainement entrainementFB;
    private Entrainement entrainementHF;
    private Entrainement entrainementPPl;
    private Entrainement entrainementSplit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_Chronometre, R.id.navigation_exercices,  R.id.navigation_entrainements)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);


        gereEntrainement = new GereEntrainement();
        //entrainement
        entrainementFB = gereEntrainement.recupEntrainement(getApplicationContext(),"FB",R.drawable.img_fb);
        entrainementHF = gereEntrainement.recupEntrainement(getApplicationContext(),"HB",R.drawable.img_hb);
        entrainementPPl = gereEntrainement.recupEntrainement(getApplicationContext(),"PPl",R.drawable.img_ppl);
        entrainementSplit = gereEntrainement.recupEntrainement(getApplicationContext(),"Split",R.drawable.img_split);


        EntrainementActivity.listEntrainement.add(entrainementFB);
        EntrainementActivity.listEntrainement.add(entrainementHF);
        EntrainementActivity.listEntrainement.add(entrainementPPl);
        EntrainementActivity.listEntrainement.add(entrainementSplit);

      /*  NavController navControllerEntrainement = Navigation.findNavController(this,R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController((this));
*/
    }

}