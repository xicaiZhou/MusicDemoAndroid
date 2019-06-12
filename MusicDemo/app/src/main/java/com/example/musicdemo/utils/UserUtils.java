package com.example.musicdemo.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.widget.Toast;

import com.blankj.utilcode.util.RegexUtils;
import com.example.musicdemo.R;
import com.example.musicdemo.activitys.LoginActivity;

public class UserUtils {

/**
 *  验证登录用户名合法性
 **/

 public static boolean validateLogin (Context context, String phone, String password){
//     if (TextUtils.isEmpty(phone)){
//         Toast.makeText(context, "手机号不能为空", Toast.LENGTH_LONG).show();
//         return false;
//     }
//     if (!RegexUtils.isMobileExact(phone)){
//         Toast.makeText(context, "无效手机号", Toast.LENGTH_LONG).show();
//         return false;
//     }
//
//     if (TextUtils.isEmpty(password)){
//         Toast.makeText(context, "请输入密码", Toast.LENGTH_LONG).show();
//         return false;
//     }
     return true;
 }

    public static boolean validateRegister (Context context, String phone, String password, String passwordAgain){
         if (TextUtils.isEmpty(phone)){
             Toast.makeText(context, "手机号不能为空",Toast.LENGTH_LONG).show();
             return false;
         }
         if (TextUtils.isEmpty(password)){
             Toast.makeText(context, "密码不能为空",Toast.LENGTH_LONG).show();
             return false;
         }
         if (TextUtils.isEmpty(passwordAgain)){
             Toast.makeText(context, "确认密码不能为空",Toast.LENGTH_LONG).show();
             return false;
         }

         if (!RegexUtils.isMobileExact(phone)){
             Toast.makeText(context, "手机号格式错误！",Toast.LENGTH_LONG).show();
             return false;
         }
         if (password.equals(passwordAgain)){
             Toast.makeText(context,"确认密码和密码不一致！",Toast.LENGTH_LONG).show();
             return false;
         }
         return true;
    }

    public static void logout (Context context){

        Intent intent = new Intent(context, LoginActivity.class);
        //先清空task栈,并重新创建一个task
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
//定义调转动画
        ((Activity)context).overridePendingTransition(R.anim.open_enter, R.anim.open_exit);

    }

}
