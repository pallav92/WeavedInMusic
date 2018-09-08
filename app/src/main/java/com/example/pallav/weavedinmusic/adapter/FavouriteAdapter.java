package com.example.pallav.weavedinmusic.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pallav.weavedinmusic.R;

/**
 * Created by YATRAONLINE\v-pallav.srivastava on 4/9/18.
 */

public class FavouriteAdapter extends RecyclerView.Adapter<FavouriteAdapter.FavouriteViewHolder> {

    private Context context;

    @NonNull
    @Override
    public FavouriteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(context).inflate(R.layout.favourite_item);
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull FavouriteViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class FavouriteViewHolder extends RecyclerView.ViewHolder {

        public FavouriteViewHolder(View itemView) {
            super(itemView);

        }
    }
}
