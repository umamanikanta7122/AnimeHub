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
                "Monkey D. Luffy",
                "Gear 5, Haki"
        ));

        animeList.add(new Anime(
                "Naruto",
                "Naruto Uzumaki",
                "Rasengan, Sage Mode"
        ));

        animeList.add(new Anime(
                "Attack on Titan",
                "Eren Yeager",
                "Attack Titan"
        ));

        animeList.add(new Anime(
                "Demon Slayer",
                "Tanjiro Kamado",
                "Sun Breathing"
        ));

        AnimeAdapter adapter = new AnimeAdapter(animeList);

        recyclerView.setLayoutManager(
                new LinearLayoutManager(this)
        );

        recyclerView.setAdapter(adapter);
    }
}