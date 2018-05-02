package com.example.usuario.pedrogabrielyaya_entregable2;

import android.app.Fragment;



import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterRecetas.Notificable {


    DrawerLayout drawerLayout;
    NavigationView navigationView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        navigationView = findViewById(R.id.navigationView);
        drawerLayout = findViewById(R.id.drawerLayout);


        NavigationViewListener navigationViewListener = new NavigationViewListener();
        navigationView.setNavigationItemSelectedListener(navigationViewListener);




    }

    @Override
    public void abrirDetalleReceta(List<Receta> recetas, Integer posicionReceta) {
        Receta receta = recetas.get(posicionReceta);
        String titulo = receta.getTitulo();
        String descripcion = receta.getDescripcion();

        Bundle bundle = new Bundle();
        bundle.putString("titulo", titulo);
        bundle.putString("descripcion", descripcion);

        FragmentDetalle fragmentDetalle = new FragmentDetalle();
        fragmentDetalle.setArguments(bundle);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragmentContainer, fragmentDetalle);
        fragmentTransaction.commit();
        onBackPressed();


    }




    private class NavigationViewListener implements NavigationView.OnNavigationItemSelectedListener {

        @Override
        public boolean onNavigationItemSelected(MenuItem item) {

           // FragmentManager fragmentManager = getFragmentManager();

            switch (item.getItemId()) {

                case R.id.recetas_navigation:
                    cargadorDeFragmentRecetas();
                    break;
                case R.id.about_navigation:
                    cargadorDeFragmentAbout();
                    break;


            }
            drawerLayout.closeDrawers();
            return true;
        }


        private void cargadorDeFragmentRecetas() {
            FragmentRecetas fragmentRecetas = new FragmentRecetas();

            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentContainer, fragmentRecetas);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();


        }

        private void cargadorDeFragmentAbout() {

            FragmentAbout fragmentAbout = new FragmentAbout();

            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.fragmentContainer, fragmentAbout);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();


        }


    }}
