package com.example.animehub;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginBtn = findViewById(R.id.loginBtn);

        loginBtn.setOnClickListener(v -> {

            loginBtn.setText("Loading...");

            loginBtn.animate()
                    .rotation(360)
                    .setDuration(1000);

            loginBtn.postDelayed(() -> {

                Intent intent = new Intent(
                        LoginActivity.this,
                        MainActivity.class
                );

                startActivity(intent);

                overridePendingTransition(
                        android.R.anim.fade_in,
                        android.R.anim.fade_out
                );

            }, 1500);

        });
    }
}