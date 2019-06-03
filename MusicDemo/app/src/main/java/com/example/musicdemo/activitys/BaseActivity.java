package com.example.musicdemo.activitys;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.musicdemo.R;

import static android.content.ContentValues.TAG;

public class BaseActivity extends Activity implements View.OnClickListener {

    private ImageView leftIM, rightIM;
    private TextView title;

    protected void initNavBar(boolean isShowLeft, String titleText, boolean isShowRight){
       leftIM = findViewById(R.id.navBar_left);
       rightIM = findViewById(R.id.navBar_right);
       title = findViewById(R.id.navBar_title);

       leftIM.setVisibility(isShowLeft? View.VISIBLE:View.GONE);
       rightIM.setVisibility(isShowRight? View.VISIBLE:View.GONE);
       title.setText(titleText);

       leftIM.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.navBar_left:
                Log.w(TAG, "navBar_left");
                break;
            case R.id.navBar_right:
                Log.i(TAG, "navBar_right");
                break;
            default:
                break;

        }
    }
}
