package com.example.fuck.testlistviewforscrollview.activity;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.fuck.testlistviewforscrollview.R;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlayMusicActivity extends AppCompatActivity {
    private ImageView imageView;
    private TextView  title;
    private TextView  summary;
    private MediaPlayer mediaPlayer = new MediaPlayer();
    private String musicUrl="https://api.bzqll.com/music/netease/url?key=579621905&id=";
    private ImageButton playMusic;
    private ImageButton lastOne;
    private ImageButton nextOne;
    private ImageButton loopPlay;
    public  ProgressBar progressBar;
    private boolean isLoopOne =false;
    private int i = 0;
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        if (Build.VERSION.SDK_INT>=21){//将状态栏设置成透明色（本功能只有在版本号大于或等于21，也就是Android5.0及以上系统才会执行此代码	）
            View decorView = getWindow().getDecorView();
            decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }
        setContentView(R.layout.activity_playmusic);
        imageView=findViewById(R.id.musicPic);
        title=findViewById(R.id.title_playmusic);
        summary=findViewById(R.id.summary_playmusic);
        playMusic=findViewById(R.id.btn_playmusic);
        progressBar=findViewById(R.id.progressbar);
        nextOne = findViewById(R.id.btn_nextone);
        lastOne =findViewById(R.id.btn_lastone);
        loopPlay =findViewById(R.id.btn_loop);
        progressBar.setMax(mediaPlayer.getDuration());
        Glide.with(PlayMusicActivity.this).load(getIntent().getStringExtra("pic")).into(imageView);
        title.setText(getIntent().getStringExtra("title"));
        summary.setText(getIntent().getStringExtra("summary"));
        initMediaPlayer();
        getIntentData();
        playMusic.setImageResource(R.drawable.ic_zangting);
        playMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer.isPlaying()){
                    playMusic.setImageResource(R.drawable.ic_bofang1);
                    mediaPlayer.pause();
                }else {
                    playMusic.setImageResource(R.drawable.ic_zangting);
                    mediaPlayer.start();
                }
            }
        });

    }
    private void getIntentData(){
        final String[] picData =getIntent().getStringArrayExtra("picData");
        String[] titleData = getIntent().getStringArrayExtra("titleData");
        final String[] summaryData = getIntent().getStringArrayExtra("summaryData");
        final String[] musicIdData = getIntent().getStringArrayExtra("musicIdData");
        final int position = getIntent().getIntExtra("position",0);
        final List<String> picDataList = new ArrayList<String>(Arrays.asList(picData));
        final List<String> titleDataList = new ArrayList<String>(Arrays.asList(titleData));
        final List<String> summaryDataList = new ArrayList<String>(Arrays.asList(summaryData));
        final List<String> musicIdDataList = new ArrayList<String>(Arrays.asList(musicIdData));
        nextOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                if (position+i<picDataList.size()){
                    Glide.with(PlayMusicActivity.this).load(picDataList.get(position+i)).into(imageView);
                    title.setText(titleDataList.get(position+i));
                    summary.setText(summaryDataList.get(position+i));
                    playMusicForMediaPlayer(musicIdDataList,position);
                }else {
                    i=-position;
                    Glide.with(PlayMusicActivity.this).load(picDataList.get(position+i)).into(imageView);
                    title.setText(titleDataList.get(position+i));
                    summary.setText(summaryDataList.get(position+i));
                    playMusicForMediaPlayer(musicIdDataList,position);
                }
            }

        });
        lastOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i--;
                if (position+i>=0){
                    Glide.with(PlayMusicActivity.this).load(picDataList.get(position+i)).into(imageView);
                    title.setText(titleDataList.get(position+i));
                    summary.setText(summaryDataList.get(position+i));
                    playMusicForMediaPlayer(musicIdDataList,position);
                }else {
                    i=picDataList.size()-position-1;
                    Glide.with(PlayMusicActivity.this).load(picDataList.get(position+i)).into(imageView);
                    title.setText(titleDataList.get(position+i));
                    summary.setText(summaryDataList.get(position+i));
                    playMusicForMediaPlayer(musicIdDataList,position);
                }
            }
        });
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                i++;
                if (position+i<picDataList.size()){
                    Glide.with(PlayMusicActivity.this).load(picDataList.get(position+i)).into(imageView);
                    title.setText(titleDataList.get(position+i));
                    summary.setText(summaryDataList.get(position+i));
                    try {
                        mediaPlayer.reset();
                        mediaPlayer.setDataSource(musicUrl+musicIdDataList.get(position+i));
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }else {
                    i=-position;
                    Glide.with(PlayMusicActivity.this).load(picDataList.get(position+i)).into(imageView);
                    title.setText(titleDataList.get(position+i));
                    summary.setText(summaryDataList.get(position+i));
                    try {
                        mediaPlayer.reset();
                        mediaPlayer.setDataSource(musicUrl+musicIdDataList.get(position+i));
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                Toast.makeText(PlayMusicActivity.this,"播放完毕",Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void initMediaPlayer(){
        try {
            mediaPlayer.reset();
            mediaPlayer.setDataSource(musicUrl+getIntent().getStringExtra("musicId"));
            mediaPlayer.prepareAsync();
            mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    mediaPlayer.start();
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void playMusicForMediaPlayer(List<String> musicIdDataList,int position){
        try {
            mediaPlayer.reset();
            mediaPlayer.setDataSource(musicUrl+musicIdDataList.get(position+i));
            mediaPlayer.prepareAsync();
            mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    mediaPlayer.start();
                }
            });
            mediaPlayer.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    class ProgressBarThread implements Runnable{
        @Override
        public void run() {
            while (mediaPlayer.isPlaying()){
                progressBar.setProgress(mediaPlayer.getCurrentPosition());
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        if (mediaPlayer!=null){
            mediaPlayer.pause();
            mediaPlayer.stop();
            mediaPlayer.release();
        }
    }
}
