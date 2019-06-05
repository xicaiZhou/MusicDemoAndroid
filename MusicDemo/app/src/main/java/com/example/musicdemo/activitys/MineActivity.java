package com.example.musicdemo.activitys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.musicdemo.R;

public class MineActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mine);
        initView();
    }
    private void initView (){
        initNavBar(true, "个人中心",false);
    }
}
