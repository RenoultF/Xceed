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
import com.example.xceed.SplashActivity;
import com.example.xceed.ui.profil.GereProfil;
import com.example.xceed.ui.profil.Profil;
import com.example.xceed.ui.profil.ProfilViewModel;
import com.goodiebag.protractorview.ProtractorView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.xw.repo.BubbleSeekBar;

public class FbActivity extends Activity {
    private Button day1,day2,day3;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_fb);
        day1 =  (Button)findViewById(R.id.fb_day1);
        day2 =  (Button)findViewById(R.id.fb_day2);
        day3 =  (Button)findViewById(R.id.fb_day3);
        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        //String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
       // TextView textView = findViewById(R.id.textView);
        //textView.setText(message);
        day1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                /*TextView view = new TextView(ViewOnClick.this);
                view.setText(++i+" view");
                ll.addView(view, layoutParams);*/
                //TODO

            }
        });
        day2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                /*TextView view = new TextView(ViewOnClick.this);
                view.setText(++i+" view");
                ll.addView(view, layoutParams);*/
                //TODO

            }
        });
        day3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                /*TextView view = new TextView(ViewOnClick.this);
                view.setText(++i+" view");
                ll.addView(view, layoutParams);*/
                //TODO

            }
        });
    }





}