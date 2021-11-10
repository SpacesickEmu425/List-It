package com.example.list_it;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class verLista extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_lista);
    }

    public void launchCrearListaLista(View view) {
    }

    public void launchCrearLista(View view) {
            Intent crearLista = new Intent (this, crearLista.class);
            startActivity(crearLista);
    }
}