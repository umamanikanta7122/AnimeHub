package com.example.animehub;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AnimeAdapter extends RecyclerView.Adapter<AnimeAdapter.ViewHolder> {

    ArrayList<Anime> animeList;

    public AnimeAdapter(ArrayList<Anime> animeList) {
        this.animeList = animeList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.anime_item, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Anime anime = animeList.get(position);

        holder.titleTxt.setText(anime.getTitle());
        holder.characterTxt.setText(anime.getCharacter());
        holder.powerTxt.setText(anime.getPower());
    }

    @Override
    public int getItemCount() {
        return animeList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView titleTxt, characterTxt, powerTxt;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            titleTxt = itemView.findViewById(R.id.titleTxt);
            characterTxt = itemView.findViewById(R.id.characterTxt);
            powerTxt = itemView.findViewById(R.id.powerTxt);
        }
    }
}
