package com.example.list_it;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void launchsignin(View view) {
        Intent signin = new Intent (this, sigin.class);
        startActivity(signin);
    }

    public void launchMainActivity(View view) {
        Intent home = new Intent (this, MainActivity.class);
        startActivity(home);
    }
}