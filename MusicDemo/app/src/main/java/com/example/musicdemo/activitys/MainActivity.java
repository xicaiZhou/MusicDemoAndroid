package com.example.musicdemo.activitys;

import android.os.Bundle;

import com.example.musicdemo.R;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    private void  initView (){
        initNavBar(false, "开心音乐🎵", true);
    }
}
