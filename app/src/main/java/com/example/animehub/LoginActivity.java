package com.example.animehub;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    EditText username, password;
    Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginBtn = findViewById(R.id.loginBtn);

        loginBtn.setOnClickListener(v -> {

            String user = username.getText().toString().trim();
            String pass = password.getText().toString().trim();

            if (user.isEmpty()) {
                username.setError("Enter Username");
                username.requestFocus();
                return;
            }

            if (pass.isEmpty()) {
                password.setError("Enter Password");
                password.requestFocus();
                return;
            }

            if (pass.length() < 6) {
                password.setError("Password must be at least 6 characters");
                password.requestFocus();
                return;
            }

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