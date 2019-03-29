package com.example.fuck.testlistviewforscrollview;

import android.app.Application;

import com.itheima.retrofitutils.ItheimaHttp;

public class MyApplication extends Application {
    public void onCreate(){
        super.onCreate();
        ItheimaHttp.init(this, "http://112.74.169.64:80");
    }
}
