package com.example.xceed.ui.exercice;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.xceed.GifImageView;
import com.example.xceed.R;

public class ExerciceActivity extends Activity {
    public static int draws[]={R.drawable.gif_dc,R.drawable.gif_devinc,R.drawable.gif_devdec,R.drawable.gif_pompes,R.drawable.gif_ecarte};
    Intent intent;
    int buttonId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        intent = getIntent();

        buttonId = intent.getIntExtra("ButtonId", 0);

        setContentView(R.layout.exercize_info);

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
    }
}
