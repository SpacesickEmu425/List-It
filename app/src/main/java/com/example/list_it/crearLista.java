package com.example.list_it;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class crearLista extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_lista);
    }

    public void launchVerLista(View view) {
        Intent verLista = new Intent (this, verLista.class);
        startActivity(verLista);
    }
}