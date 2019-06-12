package com.example.musicdemo.activitys;

import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.musicdemo.R;
import com.example.musicdemo.adapaters.MusicGridAdapter;
import com.example.musicdemo.views.GridSpaceItemDecoration;


public class MainActivity extends BaseActivity {


    private RecyclerView mRvGrid;
    private MusicGridAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    private void  initView (){
        initNavBar(false, "开心音乐🎵", true);
        mRvGrid = findViewById(R.id.rv_grid);
        //item分割线
        mRvGrid.addItemDecoration(new GridSpaceItemDecoration(getResources().getDimensionPixelSize(R.dimen.albumMarginSize)));
        mRvGrid.setLayoutManager(new GridLayoutManager(this,3));
        mAdapter = new MusicGridAdapter(this);
        mRvGrid.setAdapter(mAdapter);
    }
}
