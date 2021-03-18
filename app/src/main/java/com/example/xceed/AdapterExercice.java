package com.example.xceed;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.xceed.ui.entrainement.Entrainement2Activity;
import com.example.xceed.ui.entrainement.EntrainementActivity;
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
        int idImg = currentSet.getIdImg();
        String nbSerie = String.valueOf(currentSet.getNbSerie());
        String nbRep = String.valueOf(currentSet.getNbRep());
        TextView itemNameView= convertView.findViewById(R.id.item_name);
        ImageView itemImageView = convertView.findViewById(R.id.item_icon);
        TextView itemSetsnbView = convertView.findViewById(R.id.item_setsnumber);
        TextView itemNbRepView = convertView.findViewById(R.id.item_reps);

        itemImageView.setImageResource(idImg);
        itemNameView.setText(workoutName);
        itemSetsnbView.setText(context.getResources().getString(R.string.setSsize)+" "+ nbSerie);
        itemNbRepView.setText(context.getResources().getString(R.string.repetitions)+" "+ nbRep);



        return convertView;
    }
}