package com.azuresamples.msalandroidapp;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ContactViewHolder extends RecyclerView.ViewHolder{

    public ImageView dp;
    public TextView name;

    public ContactViewHolder(View view){
        super(view);
        dp = view.findViewById(R.id.dp);
        name = view.findViewById(R.id.name);
    }
}