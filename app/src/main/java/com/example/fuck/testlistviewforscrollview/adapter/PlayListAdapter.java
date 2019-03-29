package com.example.fuck.testlistviewforscrollview.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.fuck.testlistviewforscrollview.PlayList;
import com.example.fuck.testlistviewforscrollview.R;

import java.util.List;

public class PlayListAdapter extends ArrayAdapter<PlayList> {
    private int reseourceId;
    public PlayListAdapter(@NonNull Context context, int resource, @NonNull List<PlayList> objects) {
        super(context, resource, objects);
        reseourceId=resource;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup group){
        PlayList playList = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(reseourceId,group,false);
        TextView num = view.findViewById(R.id.playlist_num);
        TextView title = view.findViewById(R.id.playlist_title);
        TextView summary = view.findViewById(R.id.playlist_summary);
        num.setText(String.valueOf(playList.getNum()));
        title.setText(playList.getTitle());
        summary.setText(playList.getSummary());
        return view;
    }
}
