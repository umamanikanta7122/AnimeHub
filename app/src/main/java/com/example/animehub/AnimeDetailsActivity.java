package com.example.animehub;

import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class AnimeDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anime_details);

        ImageView banner = findViewById(R.id.animeBanner);

        TextView title = findViewById(R.id.animeTitle);
        TextView rating = findViewById(R.id.animeRating);
        TextView episodes = findViewById(R.id.animeEpisodes);
        TextView synopsis = findViewById(R.id.animeSynopsis);

        VideoView videoView = findViewById(R.id.videoPreview);

        String animeTitle = getIntent().getStringExtra("title");
        double animeScore = getIntent().getDoubleExtra("score", 0);
        int animeEpisodes = getIntent().getIntExtra("episodes", 0);
        String imageUrl = getIntent().getStringExtra("image");
        String animeSynopsis = getIntent().getStringExtra("synopsis");

        title.setText(animeTitle);
        rating.setText("⭐ " + animeScore);
        episodes.setText(animeEpisodes + " Episodes");
        synopsis.setText(animeSynopsis);

        Glide.with(this)
                .load(imageUrl)
                .into(banner);

        int videoRes = 0;

        if (animeTitle.equalsIgnoreCase("One Piece")) {
            videoRes = R.raw.onepiece;
        }
        else if (animeTitle.equalsIgnoreCase("Naruto")) {
            videoRes = R.raw.naruto;
        }
        else if (animeTitle.equalsIgnoreCase("Jujutsu Kaisen")) {
            videoRes = R.raw.jjk;
        }
        else if (animeTitle.equalsIgnoreCase("Bleach")) {
            videoRes = R.raw.bleach;
        }

        if (videoRes != 0) {

            String path =
                    "android.resource://" +
                            getPackageName() +
                            "/" +
                            videoRes;

            Uri uri = Uri.parse(path);

            videoView.setVideoURI(uri);

            videoView.setOnPreparedListener(mp -> {
                mp.setLooping(true);
                videoView.start();
            });
        }
    }
}