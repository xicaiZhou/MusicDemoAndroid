package com.example.musicdemo.utils;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;

import com.blankj.utilcode.util.RegexUtils;

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
     return true;
}

}
