package com.example.xceed.ui.chronometre;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import android.os.SystemClock;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Chronometer;

import com.example.xceed.R;
/**
 * Created by Alkassoum
 */
public class ChronometreFragment extends Fragment {
    private Chronometer simpleChronometer; //We use the android provided chronometer
    private ImageButton  start, stop, restart;
    private Button setFormat, clearFormat;
    private TextView value;

    private ChronometreViewModel chronometreViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        chronometreViewModel =
                new ViewModelProvider(this).get(ChronometreViewModel.class);
        View root = inflater.inflate(R.layout.fragment_chronometre, container, false);
// Button recuperation
        simpleChronometer = (Chronometer) root.findViewById(R.id.simpleChronometer);
        start =  (ImageButton)root.findViewById(R.id.startButton);
        stop =  (ImageButton)root.findViewById(R.id.stopButton);
        restart =  (ImageButton)root.findViewById(R.id.restartButton);
        setFormat =  (Button)root.findViewById(R.id.setFormat);
        clearFormat = (Button)root.findViewById(R.id.clearFormat);

        //Setting observers/listner on button
        chronometreViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                //      textView.setText(s);
            }
        });
        start.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                simpleChronometer.start();
            }
        });

        // perform click  event on stop button to stop the chronometer
        stop.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                simpleChronometer.stop();
            }
        });

        // perform click  event on restart button to set the base time on chronometer
        restart.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                simpleChronometer.setBase(SystemClock.elapsedRealtime());
            }
        });

        // perform click  event on set Format button to set the format of chronometer
        setFormat.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                simpleChronometer.setFormat("Time (%s)");
            }
        });

        // perform click  event on clear button to clear the current format of chronmeter as you set through set format
        clearFormat.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                simpleChronometer.setFormat(null);
            }
        });



        return root;
    }
}