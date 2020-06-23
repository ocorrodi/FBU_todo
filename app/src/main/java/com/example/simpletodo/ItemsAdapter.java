package com.example.simpletodo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.*;

public class ItemsAdapter extends RecyclerView.Adapter<ItemsAdapter.ViewHolder> {

    List<String> items;

    public ItemsAdapter(List<String> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //use layout inflator to inflate a view
        View todoView = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_1, parent, false);
        return new ViewHolder(todoView);
    }

    //binding data to a particular view holder
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        //grab item at the position
        String item = items.get(position);
        //bind item into view holder
        holder.bind(item);
    }

    //tells how many items in list
    @Override
    public int getItemCount() {
        return items.size();
    }

    //container to provide easy access to views that represent each row of the list

    class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvitem;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvitem = itemView.findViewById(android.R.id.text1);
        }

        public void bind(String item) {
            tvitem.setText(item);
        }
    }
}
