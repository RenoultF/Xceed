package com.example.xceed.ui.chronometre;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

public class ChronometreFragment extends Fragment {
    private Chronometer simpleChronometer;
    private Button start, stop, restart, setFormat, clearFormat;
    private TextView value;

    private ChronometreViewModel chronometreViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        chronometreViewModel =
                new ViewModelProvider(this).get(ChronometreViewModel.class);
        View root = inflater.inflate(R.layout.fragment_chronometre, container, false);
        simpleChronometer = (Chronometer) root.findViewById(R.id.simpleChronometer);
        start = (Button) root.findViewById(R.id.startButton);
        stop = (Button) root.findViewById(R.id.stopButton);
        restart = (Button) root.findViewById(R.id.restartButton);
        setFormat = (Button) root.findViewById(R.id.setFormat);
        clearFormat = (Button) root.findViewById(R.id.clearFormat);

        //final TextView textView = root.findViewById(R.id.text_notifications);
        // value.setText(this.temps.getTop() +":"+this.temps.getMid()+":"+this.temps.getLast());
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