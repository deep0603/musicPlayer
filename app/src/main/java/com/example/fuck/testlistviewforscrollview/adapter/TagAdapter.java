package com.example.fuck.testlistviewforscrollview.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.fuck.testlistviewforscrollview.R;

import java.util.List;

public class TagAdapter extends ArrayAdapter<String> {
    private int reseourceId;
    public TagAdapter(@NonNull Context context, int resource, @NonNull List<String> objects) {
        super(context, resource, objects);
        reseourceId=resource;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup group){
        String str = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(reseourceId,group,false);
        TextView textView = view.findViewById(R.id.tag_textview);
        textView.setText(str);
        return view;
    }

}
