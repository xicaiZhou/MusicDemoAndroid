package com.example.musicdemo.activitys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.musicdemo.R;

import static android.content.ContentValues.TAG;

public class LoginActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
    }

    private void initView(){
        initNavBar(true,"登录",false);
    }

    //前往注册
    public void onRegisterClick(View view){
        Log.w(TAG, "onRegisterClick: 前往注册！");
    }
}
