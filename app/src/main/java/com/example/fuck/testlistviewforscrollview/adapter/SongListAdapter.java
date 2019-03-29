package com.example.fuck.testlistviewforscrollview.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.example.fuck.testlistviewforscrollview.R;
import com.example.fuck.testlistviewforscrollview.SongList;

import java.util.List;

public class SongListAdapter extends ArrayAdapter<SongList> {
    private int resourceId;
    public SongListAdapter(@NonNull Context context, int resource, @NonNull List<SongList> objects) {
        super(context, resource, objects);
        resourceId=resource;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        SongList songList = getItem(position);
        View view;
        ViewHolder viewHolder;
        if (convertView == null){
            view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
            viewHolder = new ViewHolder();
            viewHolder.imageView = view.findViewById(R.id.songlist_img);
            viewHolder.title = view.findViewById(R.id.songlist_title);
            viewHolder.summary = view.findViewById(R.id.songlist_summary);
            view.setTag(viewHolder);

        }else {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }
        RoundedCorners roundedCorners = new RoundedCorners(25);
        RequestOptions requestOptions =RequestOptions.bitmapTransform(roundedCorners).override(500,500);
        Glide.with(getContext()).load(songList.getImgUrl()).apply(requestOptions).into(viewHolder.imageView);
        viewHolder.title.setText(songList.getTitle());
        viewHolder.summary.setText(songList.getSummary());
        return view;

    }
    class ViewHolder{
        ImageView imageView;
        TextView  title;
        TextView summary;
    }
}
