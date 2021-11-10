package com.example.list_it;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView=findViewById(R.id.bottomNav);

        bottomNavigationView.setOnNavigationItemSelectedListener(bottomNavMethod);
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new home()).commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener bottomNavMethod=new
            BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                    Fragment fragment=null;
                switch (item.getItemId()){
                    case R.id.faq:
                        fragment=new soporteTecnico();
                        break;
                    case R.id.notifications:
                        fragment=new notificaciones();
                        break;
                    case R.id.home:
                        fragment=new home();
                        break;
                    case R.id.users:
                        fragment=new miembros();
                        break;
                    case R.id.settings:
                        fragment=new settings();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).commit();

                    return true;
                }
            };

    public void launchVerLista(View view) {
        Intent verLista = new Intent (this, verLista.class);
        startActivity(verLista);
    }

    public void launchCrearLista(View view) {
        Intent crearLista = new Intent (this, crearLista.class);
        startActivity(crearLista);
    }
}