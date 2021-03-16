package com.example.xceed;

import android.content.Context;
import android.content.pm.LauncherApps;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.xceed.ui.entrainement.Sets;

import java.util.List;

public class SetsAdapter extends BaseAdapter {
    private Context context;
    private List<Sets> setsList;
    private LayoutInflater inflater;
    public SetsAdapter(Context context, List<Sets> setsList){
        this.context = context;
        this.setsList=setsList;
        this.inflater=LayoutInflater.from(this.context);


    }

    @Override
    public int getCount() {
        return setsList.size();
    }

    @Override
    public Sets getItem(int position) {
        return setsList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.adapter_item,null);
        // get info about item[pos]
        Sets currentSet = getItem(position);
        String itemName = currentSet.exercice.getNomExerciceEx();
        double itemReps = currentSet.getReps();
        //editing adapter_item views
        TextView itemNameView= convertView.findViewById(R.id.item_name);
        TextView itemRepsView = convertView.findViewById(R.id.item_reps);
       //ImageView itemImageView = convertView.findViewById(R.id.item_icon);
        TextView itemSetsnbView = convertView.findViewById(R.id.item_setsnumber);

        //itemImageView.set;
        itemNameView.setText(itemName);
        itemRepsView.setText(context.getResources().getString(R.string.lefting)+" "+ itemReps +context.getResources().getString(R.string.repetitions) );

        itemSetsnbView.setText(context.getResources().getString(R.string.setSsize) + " "+currentSet.exercice.numOfSets);



        return convertView;
    }
}
