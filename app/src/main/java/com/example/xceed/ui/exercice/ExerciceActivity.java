package com.example.xceed.ui.exercice;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.xceed.GifImageView;
import com.example.xceed.R;

public class ExerciceActivity extends Activity {
    public int draws[]={R.drawable.gif_dc,R.drawable.gif_devinc,R.drawable.gif_devdec,R.drawable.gif_pompes,R.drawable.gif_ecarte};
    private static int pos=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.exercize_info);

        GifImageView gifImageView = (GifImageView) findViewById(R.id.GifImageView);
        gifImageView.setGifImageResource(draws[pos]);
        pos = pos+1;
    }
}
