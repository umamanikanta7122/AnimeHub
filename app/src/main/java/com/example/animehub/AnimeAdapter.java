package com.example.animehub;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class AnimeAdapter extends RecyclerView.Adapter<AnimeAdapter.ViewHolder> {

    List<Anime> animeList;

    public AnimeAdapter(List<Anime> animeList) {
        this.animeList = animeList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_anime, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Anime anime = animeList.get(position);

        holder.title.setText(anime.getTitle());
        holder.score.setText("⭐ " + anime.getScore());
        holder.episodes.setText(anime.getEpisodes() + " Episodes");

        Glide.with(holder.itemView.getContext())
                .load(anime.getImageUrl())
                .into(holder.image);

        holder.itemView.setOnClickListener(v -> {

            Intent intent = new Intent(
                    holder.itemView.getContext(),
                    AnimeDetailsActivity.class
            );

            intent.putExtra("title", anime.getTitle());
            intent.putExtra("score", anime.getScore());
            intent.putExtra("episodes", anime.getEpisodes());
            intent.putExtra("image", anime.getImageUrl());
            intent.putExtra("synopsis", anime.getSynopsis());

            holder.itemView.getContext().startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return animeList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView title, score, episodes;
        ImageView image;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.animeImage);
            title = itemView.findViewById(R.id.animeTitle);
            score = itemView.findViewById(R.id.animeScore);
            episodes = itemView.findViewById(R.id.animeEpisodes);
        }
    }
}