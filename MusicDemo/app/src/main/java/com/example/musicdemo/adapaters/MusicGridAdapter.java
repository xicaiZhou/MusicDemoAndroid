package com.example.musicdemo.adapaters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.musicdemo.R;

public class MusicGridAdapter extends RecyclerView.Adapter {

    private Context mContext;
    public MusicGridAdapter (Context context)
    {
        mContext = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ViewHold(LayoutInflater.from(mContext).inflate(R.layout.item_grid_music, viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return  6;
    }

    class ViewHold extends RecyclerView.ViewHolder{

        public ViewHold(@NonNull View itemView) {
            super(itemView);
        }
    }
}
