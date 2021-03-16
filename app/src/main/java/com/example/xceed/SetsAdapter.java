package com.example.xceed;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

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
        return convertView;
    }
}
