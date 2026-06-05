package com.example.animehub;
import android.view.MotionEvent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AnimeApiActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    AnimeAdapter adapter;

    ArrayList<Anime> animeList = new ArrayList<>();
    ArrayList<Anime> filteredList = new ArrayList<>();

    EditText searchAnime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anime_api);
        recyclerView = findViewById(R.id.recyclerView);
        searchAnime = findViewById(R.id.searchAnime);

        recyclerView.setOnTouchListener((v, event) -> {
            searchAnime.clearFocus();
            return false;
        });

        recyclerView.setLayoutManager(
                new LinearLayoutManager(this)
        );

        adapter = new AnimeAdapter(filteredList);
        recyclerView.setAdapter(adapter);

        loadAnimeFromApi();

        searchAnime.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                filteredList.clear();

                for (Anime anime : animeList) {

                    if (anime.getTitle().toLowerCase()
                            .contains(s.toString().toLowerCase())) {

                        filteredList.add(anime);
                    }
                }

                adapter.notifyDataSetChanged();
            }

            @Override
            public void afterTextChanged(Editable s) {}
        });
    }

    private void loadAnimeFromApi() {

        // Your Custom Anime

        animeList.add(new Anime(
                "One Piece",
                "https://cdn.myanimelist.net/images/anime/6/73245.jpg",
                9.2,
                1100,
                "Monkey D. Luffy sets out on a grand adventure to become the King of the Pirates and discover the legendary One Piece treasure."
        ));

        animeList.add(new Anime(
                "Naruto",
                "https://cdn.myanimelist.net/images/anime/13/17405.jpg",
                8.8,
                720,
                "Naruto Uzumaki dreams of becoming the Hokage while overcoming challenges and protecting his village."
        ));

        animeList.add(new Anime(
                "Bleach",
                "https://cdn.myanimelist.net/images/anime/3/40451.jpg",
                8.7,
                366,
                "Ichigo Kurosaki gains the powers of a Soul Reaper and fights evil spirits to protect humanity."
        ));

        animeList.add(new Anime(
                "Jujutsu Kaisen",
                "https://cdn.myanimelist.net/images/anime/1171/109222.jpg",
                8.9,
                47,
                "Yuji Itadori joins a secret organization of Jujutsu Sorcerers to battle powerful curses threatening the world."
        ));

        animeList.add(new Anime(
                "Demon Slayer",
                "https://cdn.myanimelist.net/images/anime/1286/99889.jpg",
                8.6,
                55,
                "Tanjiro Kamado becomes a demon slayer to save his sister Nezuko and avenge his family."
        ));

        animeList.add(new Anime(
                "Attack on Titan",
                "https://cdn.myanimelist.net/images/anime/10/47347.jpg",
                9.0,
                89,
                "Eren Yeager fights against giant Titans that threaten humanity's survival."
        ));

        animeList.add(new Anime(
                "Solo Leveling",
                "https://cdn.myanimelist.net/images/anime/1823/138022.jpg",
                8.8,
                25,
                "Sung Jin-Woo transforms from the weakest hunter into the strongest after gaining a mysterious system."
        ));

        animeList.add(new Anime(
                "Death Note",
                "https://cdn.myanimelist.net/images/anime/9/9453.jpg",
                8.9,
                37,
                "Light Yagami discovers a notebook that allows him to kill anyone by writing their name in it."
        ));

        filteredList.clear();
        filteredList.addAll(animeList);
        adapter.notifyDataSetChanged();

        // API Anime

        ApiService apiService =
                RetrofitClient.getRetrofit()
                        .create(ApiService.class);

        apiService.getTopAnime().enqueue(new Callback<AnimeResponse>() {

            @Override
            public void onResponse(Call<AnimeResponse> call,
                                   Response<AnimeResponse> response) {

                if (response.isSuccessful()
                        && response.body() != null) {

                    for (AnimeData animeData :
                            response.body().getData()) {

                        animeList.add(
                                new Anime(
                                        animeData.getTitle(),
                                        animeData.getImages().getImageUrl(),
                                        animeData.getScore(),
                                        animeData.getEpisodes(),
                                        animeData.getSynopsis()
                                )
                        );
                    }

                    filteredList.clear();
                    filteredList.addAll(animeList);

                    adapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<AnimeResponse> call,
                                  Throwable t) {

                t.printStackTrace();
            }
        });
    }
}