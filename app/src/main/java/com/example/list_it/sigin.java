package com.example.list_it;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class sigin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sigin);
    }

    public void launchHome(View view) {
        Intent home = new Intent (this, MainActivity.class);
        startActivity(home);
    }
}