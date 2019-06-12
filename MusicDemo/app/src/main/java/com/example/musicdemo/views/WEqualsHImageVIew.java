package com.example.musicdemo.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;


public class WEqualsHImageVIew extends android.support.v7.widget.AppCompatImageView {
    public WEqualsHImageVIew(Context context) {
        super(context);
    }

    public WEqualsHImageVIew(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public WEqualsHImageVIew(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, widthMeasureSpec);

       int width = MeasureSpec.getSize(widthMeasureSpec); //获取宽度
        MeasureSpec.getSize(heightMeasureSpec);//获取高度


        //获取view模式  eg：match_parent、warp_content
    }
}
