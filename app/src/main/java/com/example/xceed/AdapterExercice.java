package com.example.xceed;

import android.content.Context;
import android.content.Intent;
import android.content.pm.LauncherApps;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.xceed.ui.entrainement.Entrainement;
import com.example.xceed.ui.entrainement.EntrainementActivity;
import com.example.xceed.ui.entrainement.Entrainement_fb;
import com.example.xceed.ui.entrainement.Sets;
import com.example.xceed.ui.exercice.Exercice;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by Alkassoum
 */
public class AdapterExercice extends BaseAdapter {
    private Context context;
    private List<Exercice> setsList = new ArrayList<Exercice>();
    private LayoutInflater inflater;
    public AdapterExercice(Context context, List<Exercice> setsList){
        this.context = context;
        this.setsList=setsList;
        this.inflater=LayoutInflater.from(this.context);



    }

    @Override
    public int getCount() {
        return setsList.size();
    }

    @Override
    public Exercice getItem(int position) {
        return setsList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = inflater.inflate(R.layout.adapter_exercice_item,null);
        // get info about item[pos]
        Exercice currentSet = getItem(position);
        String workoutName = currentSet.getNomExerciceEx();
        //editing adapter_item views
        TextView itemNameView= convertView.findViewById(R.id.item_name);
        //ImageView itemImageView = convertView.findViewById(R.id.item_icon);
        TextView itemSetsnbView = convertView.findViewById(R.id.item_setsnumber);
        TextView itemNbRepView = convertView.findViewById(R.id.item_reps);
      /*  Button t = (Button) convertView.findViewById(R.id.add_to);
        t.setTag(position);
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println(t.getTag());
                Intent i = new Intent(context.getApplicationContext(), Entrainement.class);
                i.putExtra("Numinlst",(Integer)t.getTag());
                context.startActivity(i);
                //   System.out.println(EntrainementActivity.listEntrainement.get((int)t.getTag()));
            }
        });*/
        itemNameView.setText(workoutName);
        itemSetsnbView.setText(R.string.nb_serie +" "+currentSet.getNbSerie());
        itemNbRepView.setText(R.string.repetitions +" "+currentSet.getNbSerie());


        // itemRepsView.setText(context.getResources().getString(R.string.lefting)+" "+ itemReps +context.getResources().getString(R.string.repetitions) );

        //itemSetsnbView.setText(context.getResources().getString(R.string.setSsize) + " "+currentSet.exercice.numOfSets);



        return convertView;
    }
}