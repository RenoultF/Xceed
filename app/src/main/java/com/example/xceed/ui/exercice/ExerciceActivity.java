package com.example.xceed.ui.exercice;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.xceed.GifImageView;
import com.example.xceed.R;

public class ExerciceActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.exercize_info);

        GifImageView gifImageView = (GifImageView) findViewById(R.id.GifImageView);
        gifImageView.setGifImageResource(R.drawable.gif_dc);
    }
}
