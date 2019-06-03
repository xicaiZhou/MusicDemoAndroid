package com.example.musicdemo.activitys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.musicdemo.R;

import java.util.Timer;
import java.util.TimerTask;

import static android.content.ContentValues.TAG;

public class welcomeActivity extends BaseActivity {

    private Timer mTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        //1.延时3秒跳转界面
        init();

    }
    private void init(){
        mTimer = new Timer();
        mTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                toLogin();
                Log.e(TAG, "当前线程："+Thread.currentThread() );
            }
        }, 3*1000);
    }
    private void toLogin(){
        Intent tent = new Intent(this,LoginActivity.class);
        startActivity(tent);
        finish();
    }
    private void toMain(){
        Intent tent = new Intent(this,MainActivity.class);
        startActivity(tent);
        finish();
    }
}
