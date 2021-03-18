package com.example.xceed.ui.entrainement;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.xceed.AdapterExercice;
import com.example.xceed.R;
import com.example.xceed.ui.exercice.Exercice;

import java.util.ArrayList;
import java.util.List;

public class Entrainement2Activity extends AppCompatActivity {

    private GereEntrainement gereEntrainement;
    private ListView lstView;

    @Override
    protected void onCreate(Bundle savecInstanceState) {
        super.onCreate(savecInstanceState);
        setContentView(R.layout.fragment_entrainement_show);
        //list of sets
        List<Exercice> sets = new ArrayList<Exercice>();
        gereEntrainement = new GereEntrainement();
        int c = getIntent().getIntExtra("Numinlst", 0);

        for (Exercice e : EntrainementActivity.listEntrainement.get(c).lstExercices) {
            sets.add(e);
        }

        Button btnQuitter = findViewById(R.id.btn_quitter);
        btnQuitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Entrainement entrainementTemp = EntrainementActivity.listEntrainement.get(c);
                gereEntrainement.saveEntrainement(getApplicationContext(), entrainementTemp);
                finish();
            }
        });

        lstView = findViewById(R.id.ListView1);
        lstView.setAdapter(new AdapterExercice(this, sets));
    }

}
