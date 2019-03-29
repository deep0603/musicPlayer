package com.example.fuck.testlistviewforscrollview.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fuck.testlistviewforscrollview.R;
import com.example.fuck.testlistviewforscrollview.SongList;
import com.example.fuck.testlistviewforscrollview.adapter.SongListAdapter;
import com.example.fuck.testlistviewforscrollview.bean.SongListBean;
import com.itheima.retrofitutils.ItheimaHttp;
import com.itheima.retrofitutils.Request;
import com.itheima.retrofitutils.listener.HttpResponseListener;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;

public class SongListTagActivity extends AppCompatActivity {
    private ListView listView;
    private List<SongList> songListList = new ArrayList<>();
    private List<String>   songListId   = new ArrayList<>();
    private List<String>   songListUrl  = new ArrayList<>();
    private Toolbar toolbar;
    private String  tag;
    private  boolean isIntent = false;
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activty_songlist);
        listView=findViewById(R.id.listview);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tag=getIntent().getStringExtra("tag");
        querySongListData(tag);
        toolbar.inflateMenu(R.menu.toolbar_menu);
        toolbar.setTitle(tag);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.action_tag:
                        finish();


                }
                return false;
            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(SongListTagActivity.this,PlayListActivity.class);
                intent.putExtra("songlistId",songListId.get(position));
                intent.putExtra("songlistUrl",songListUrl.get(position));
                startActivity(intent);

            }
        });

    }
    private void querySongListData(String tag){
        Request request = ItheimaHttp.newGetRequest("/top/playlist?limit=100&order=hot&cat="+tag);
        Call call = ItheimaHttp.send(request, new HttpResponseListener<SongListBean>() {
            @Override
            public void onResponse(SongListBean songListBean) {
                addDataForListView(songListBean);
            }
        });
    }
    private void addDataForListView(SongListBean songListBean){
        for (SongListBean.PlaylistsBean playlistsBean :songListBean.getPlaylists()){
            SongList songList = new SongList(playlistsBean.getName(),playlistsBean.getCreator().getNickname(),playlistsBean.getCoverImgUrl());
            songListId.add(String.valueOf(playlistsBean.getId()));
            songListUrl.add(playlistsBean.getCoverImgUrl());
            songListList.add(songList);
        }
        SongListAdapter songListAdapter = new SongListAdapter(SongListTagActivity.this,R.layout.songlist_item,songListList);
        listView.setAdapter(songListAdapter);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.toolbar_menu,menu);
        return true;
    }
}
