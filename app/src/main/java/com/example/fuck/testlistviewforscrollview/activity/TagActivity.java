package com.example.fuck.testlistviewforscrollview.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fuck.testlistviewforscrollview.ListViewForScrollView;
import com.example.fuck.testlistviewforscrollview.R;
import com.example.fuck.testlistviewforscrollview.adapter.TagAdapter;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TagActivity extends AppCompatActivity{
    private ListViewForScrollView listViewForScrollView;
    private ListViewForScrollView listViewForScrollView2;
    private ListViewForScrollView listViewForScrollView3;
    private String[] data={"流行","影视原声","华语","清晨","怀旧","摇滚","夜晚","清新","ACG","欧美","儿童","学习","民谣","浪漫","日语","工作","电子","校园","性感",
            "韩语","午休","游戏","伤感","舞曲"};
    private String[] data2 ={"粤语","小语种","下午茶","70后","说唱","治愈","轻音乐","80后","放松","地铁","爵士","90后","驾车","孤独","感动",
            "运动","网络歌曲","乡村","兴奋","KTV","旅行","R&B/Soul","古典","快乐"};
    private String[] data3 ={"散步","经典","翻唱","安静","民族","酒吧","思念","吉他","英伦","金属","钢琴",
            "朋克","器乐","榜单","蓝调","雷鬼","00后","世界音乐","拉丁","另类/独立","New Age","古风","后摇","Bossa Nova"};
    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_songlist_tag);

        listViewForScrollView = findViewById(R.id.listview1);
        listViewForScrollView2 = findViewById(R.id.listview2);
        listViewForScrollView3 = findViewById(R.id.listview3);
        TagAdapter tagAdapter = new TagAdapter(TagActivity.this, R.layout.tag_item, Arrays.asList(data));
        TagAdapter tagAdapter2 = new TagAdapter(TagActivity.this, R.layout.tag_item, Arrays.asList(data2));
        TagAdapter tagAdapter3 = new TagAdapter(TagActivity.this, R.layout.tag_item, Arrays.asList(data3));
        listViewForScrollView.setAdapter(tagAdapter);
        listViewForScrollView2.setAdapter(tagAdapter2);
        listViewForScrollView3.setAdapter(tagAdapter3);
        listViewForScrollView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(TagActivity.this,SongListTagActivity.class);
                intent.putExtra("tag", Arrays.asList(data).get(position));
                startActivity(intent);
            }
        });
        listViewForScrollView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(TagActivity.this,SongListTagActivity.class);
                intent.putExtra("tag",Arrays.asList(data2).get(position));
                startActivity(intent);
            }
        });
        listViewForScrollView3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(TagActivity.this,SongListTagActivity.class);
                intent.putExtra("tag",Arrays.asList(data3).get(position));
                startActivity(intent);
            }
        });
    }
}
