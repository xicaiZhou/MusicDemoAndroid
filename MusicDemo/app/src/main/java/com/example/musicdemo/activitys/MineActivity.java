package com.example.musicdemo.activitys;

import android.content.Intent;
import android.support.v4.util.LogWriter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.musicdemo.R;
import com.example.musicdemo.utils.UserUtils;

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

    public void changePassword (View v){
        Log.w("TAG","changePassword");

        Intent intent = new Intent(this, ChangePasswordActivity.class);
        startActivity(intent);
    }

    public void logout (View v){
        Log.w("TAG","logout");
        UserUtils.logout(this);

    }

}
