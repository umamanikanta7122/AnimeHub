package com.example.animehub;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button startBtn, logoutBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startBtn = findViewById(R.id.startBtn);
        logoutBtn = findViewById(R.id.logoutBtn);

        startBtn.setOnClickListener(v -> {

            Intent intent = new Intent(
                    MainActivity.this,
                    AnimeApiActivity.class
            );

            startActivity(intent);

        });

        logoutBtn.setOnClickListener(v -> {

            Intent intent = new Intent(
                    MainActivity.this,
                    LoginActivity.class
            );

            startActivity(intent);
            finish();

        });
    }
}