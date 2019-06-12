package com.example.musicdemo.activitys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.musicdemo.R;
import com.example.musicdemo.utils.UserUtils;
import com.example.musicdemo.views.InputView;


import static android.content.ContentValues.TAG;

public class LoginActivity extends BaseActivity {

    private InputView mInputPhone, getmInputPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
    }

    private void initView(){
        initNavBar(false,"登录",false);
        mInputPhone = findViewById(R.id.input_Phone);
        getmInputPassword = findViewById(R.id.input_Password);
    }

    //前往注册
    public void onRegisterClick(View view){
        Log.w(TAG, "onRegisterClick: 前往注册！");

        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);

    }
    public void toLogin(View view){
        Log.w(TAG, "toLogin: 前往登录");

       if (!UserUtils.validateLogin(this, mInputPhone.getInputText(), getmInputPassword.getInputText())){
           return;
       }

        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
