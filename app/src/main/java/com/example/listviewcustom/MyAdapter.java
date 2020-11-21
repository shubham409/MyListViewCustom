package com.example.listviewcustom;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyAdapter extends ArrayAdapter<Word>{
    public MyAdapter(Activity context, ArrayList<Word>word) {
        super(context, 0,word);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listitemview =convertView;
        if(listitemview==null){
            listitemview= LayoutInflater.from(getContext()).inflate(R.layout.one_view,parent,false);
        }
        Word currentworld=getItem(position);
        TextView tv=listitemview.findViewById(R.id.mytext);
        ImageView iv=listitemview.findViewById(R.id.myimage);
        tv.setText(currentworld.getName());
        iv.setImageResource(currentworld.getResourceid());
        return listitemview;
    }
}
