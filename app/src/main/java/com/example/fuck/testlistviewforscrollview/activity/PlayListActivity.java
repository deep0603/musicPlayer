package com.example.fuck.testlistviewforscrollview.activity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.example.fuck.testlistviewforscrollview.ListViewForScrollView;
import com.example.fuck.testlistviewforscrollview.PlayList;
import com.example.fuck.testlistviewforscrollview.R;
import com.example.fuck.testlistviewforscrollview.SongList;
import com.example.fuck.testlistviewforscrollview.adapter.PlayListAdapter;
import com.example.fuck.testlistviewforscrollview.bean.PlayListBean;
import com.itheima.retrofitutils.ItheimaHttp;
import com.itheima.retrofitutils.Request;
import com.itheima.retrofitutils.listener.HttpResponseListener;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;

public class PlayListActivity extends AppCompatActivity {
    private ScrollView scrollView;
    private ListViewForScrollView listViewForScrollView;
    private ImageView imageView;
    private String songlistId;
    private String songlistUrl;
    private List<PlayList> playListList = new ArrayList<>();
    private List<String> musicIdList = new ArrayList<>();
    private List<String>musicPicUrl = new ArrayList<>();
    private List<String>musicTitle= new ArrayList<>();
    private List<String>musicSummary= new ArrayList<>();
    private String musicUrl="https://api.bzqll.com/music/netease/url?key=579621905&id=";
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_playlist);
        scrollView = findViewById(R.id.scrollview);
        listViewForScrollView = findViewById(R.id.playlist_view);
        scrollView.smoothScrollTo(0, 0);
        imageView = findViewById(R.id.imageview);
        songlistId = getIntent().getStringExtra("songlistId");
        songlistUrl = getIntent().getStringExtra("songlistUrl");
        RoundedCorners roundedCorners = new RoundedCorners(10);
        RequestOptions requestOptions =RequestOptions.bitmapTransform(roundedCorners).override(500,500);
        Glide.with(PlayListActivity.this).load(songlistUrl).apply(requestOptions).into(imageView);
        Toast.makeText(this,songlistId,Toast.LENGTH_SHORT).show();
        queryPlayListData();
        final String[]picData = musicPicUrl.toArray(new String[musicPicUrl.size()]);
        listViewForScrollView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String[] picData = musicPicUrl.toArray(new String[musicPicUrl.size()]);
                String[] titleData = musicTitle.toArray(new String[musicTitle.size()]);
                String[] summaryData = musicSummary.toArray(new String[musicSummary.size()]);
                String[] musicIdData = musicIdList.toArray(new String[musicIdList.size()]);
                Intent intent = new Intent(PlayListActivity.this, PlayMusicActivity.class);
                intent.putExtra("pic", musicPicUrl.get(position));
                intent.putExtra("title", musicTitle.get(position));
                intent.putExtra("summary", musicSummary.get(position));
                intent.putExtra("musicId", musicIdList.get(position));
                intent.putExtra("picData", picData);
                intent.putExtra("titleData", titleData);
                intent.putExtra("summaryData", summaryData);
                intent.putExtra("musicIdData", musicIdData);
                intent.putExtra("position",position);
                startActivity(intent);
            }
        });
    }
    private void queryPlayListData(){
        Request request = ItheimaHttp.newGetRequest("/playlist/detail?id="+songlistId);
        Call call = ItheimaHttp.send(request, new HttpResponseListener<PlayListBean>() {
            @Override
            public void onResponse(PlayListBean playListBean) {
                addData(playListBean);
            }
            @Override
            public void onFailure(Call<ResponseBody> call, Throwable e) {

            }

        });
    }
    private void addData(PlayListBean playListBean){
        int i =1;
        for (PlayListBean.PlaylistBean.TracksBean  tracksBean : playListBean.getPlaylist().getTracks()){
            PlayList playList = new PlayList(tracksBean.getName(),tracksBean.getAr().get(0).getName()+" | "+tracksBean.getAl().getName(),null,i);
            playListList.add(playList);
            musicIdList.add(String.valueOf(tracksBean.getId()));
            musicPicUrl.add(tracksBean.getAl().getPicUrl());
            musicTitle.add(tracksBean.getName());
            musicSummary.add(tracksBean.getAr().get(0).getName());
            i++;
        }
        PlayListAdapter adapter = new PlayListAdapter(PlayListActivity.this,R.layout.playlist_item,playListList);
        listViewForScrollView.setAdapter(adapter);
    }

}
