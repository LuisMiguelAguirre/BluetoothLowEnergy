package com.example.admin.bluetoothlowenergy;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Admin on 10/14/2017.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    public void setDevices(List<String> devices) {
        this.devices = devices;
        notifyDataSetChanged();
    }

    List<String> devices;

    public Adapter(List<String> devices) {
        this.devices = devices;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.items, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.textView.setText(devices.get(position));
    }

    @Override
    public int getItemCount() {
        return devices.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView textView;

        public ViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.item_card_id);
        }
    }
}
