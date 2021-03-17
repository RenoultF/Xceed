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

import java.util.List;
/**
 * Created by Alkassoum
 */
public class AdapterWorkoutFragment extends BaseAdapter {
    private Context context;
    private List<Entrainement> setsList;
    private LayoutInflater inflater;
    public AdapterWorkoutFragment(Context context, List<Entrainement> setsList){
        this.context = context;
        this.setsList=setsList;
        this.inflater=LayoutInflater.from(this.context);


    }

    @Override
    public int getCount() {
        return setsList.size();
    }

    @Override
    public Entrainement getItem(int position) {
        return setsList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = inflater.inflate(R.layout.adapter_workout_fragment,null);
        // get info about item[pos]
        Entrainement currentSet = getItem(position);
        String workoutName = currentSet.nomEntrainement;
        //editing adapter_item views
        TextView itemNameView= convertView.findViewById(R.id.workout_list);
        //ImageView itemImageView = convertView.findViewById(R.id.item_icon);
        TextView itemSetsnbView = convertView.findViewById(R.id.item_setsnumber);
        Button t = (Button) convertView.findViewById(R.id.add_to);
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
        });
        itemNameView.setText(workoutName);


        // itemRepsView.setText(context.getResources().getString(R.string.lefting)+" "+ itemReps +context.getResources().getString(R.string.repetitions) );

        //itemSetsnbView.setText(context.getResources().getString(R.string.setSsize) + " "+currentSet.exercice.numOfSets);



        return convertView;
    }
}