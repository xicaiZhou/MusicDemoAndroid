package com.example.musicdemo.activitys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.musicdemo.R;

public class RegisterActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        initView();
    }
    private void initView () {
        initNavBar(true, "注册",false);
    }
}
