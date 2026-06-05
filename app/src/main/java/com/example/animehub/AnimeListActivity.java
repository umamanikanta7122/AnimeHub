package com.example.animehub;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AnimeListActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Anime> animeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anime_list);

        recyclerView = findViewById(R.id.recyclerView);

        animeList = new ArrayList<>();

        animeList.add(new Anime(
                "One Piece",
                "https://cdn.myanimelist.net/images/anime/6/73245.jpg",
                9.2,
                1100,
                "Monkey D. Luffy sets out to become the King of the Pirates."
        ));

        animeList.add(new Anime(
                "Naruto",
                "https://cdn.myanimelist.net/images/anime/13/17405.jpg",
                8.8,
                720,
                "Naruto Uzumaki dreams of becoming Hokage."
        ));

        AnimeAdapter adapter = new AnimeAdapter(animeList);

        recyclerView.setLayoutManager(
                new LinearLayoutManager(this)
        );

        recyclerView.setAdapter(adapter);
        recyclerView.setAdapter(adapter);
    }
}