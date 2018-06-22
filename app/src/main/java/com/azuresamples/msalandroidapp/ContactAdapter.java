package com.azuresamples.msalandroidapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import database.Contact;

public class ContactAdapter extends RecyclerView.Adapter<ContactViewHolder> {
    private ArrayList<Contact> items;
    private int itemLayout;

    public ContactAdapter(ArrayList<Contact> r,int itemLayout){
        this.items=r;
        this.itemLayout=itemLayout;
    }

    @Override
    public ContactViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(itemLayout, parent, false);
        return new ContactViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final ContactViewHolder holder, int position) {
        if(items != null && holder != null){
            //holder.dp.setImageResource(items.get(position));
            holder.name.setText(items.get(position).getName());
        }
    }

    @Override
    public int getItemCount() {
        if(items != null)
            return items.size();

        return 0;
    }
}
