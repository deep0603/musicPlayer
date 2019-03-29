package com.example.fuck.testlistviewforscrollview.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ScrollView;

import com.example.fuck.testlistviewforscrollview.ListViewForScrollView;
import com.example.fuck.testlistviewforscrollview.R;

public class MainActivity extends AppCompatActivity {
    private ScrollView            scrollView;
    private ListViewForScrollView listViewForScrollView;
    private String[]data = {"aaa","bbb","ccc","ddd","eee","fff","ggg","lll","mmm","aaa","bbb","ccc",
            "ddd","eee","fff","ggg","lll","mmm","aaa","bbb","ccc","ddd","eee","fff","ggg","lll","mmm"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scrollView = findViewById(R.id.scrollview);
        scrollView.smoothScrollTo(0, 0);
        listViewForScrollView = findViewById(R.id.listview);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,data);
        listViewForScrollView.setAdapter(adapter);
    }
}
