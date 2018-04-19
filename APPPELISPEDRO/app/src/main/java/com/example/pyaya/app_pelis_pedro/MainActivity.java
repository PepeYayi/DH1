package com.example.pyaya.app_pelis_pedro;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Fragment1.Notificable2 {


    Notificable3 notificable3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment1 fragment1 = new Fragment1();

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.add(R.id.containerMainActivityFragment1, fragment1);

        fragmentTransaction.commit();


    }

    @Override
    public void abrirDetalleContactoClickeado2(Serie serie) {
         notificable3.abrirDetalleContactoClickeado2(serie);
    }

    public interface Notificable3 {
        public void abrirDetalleContactoClickeado2(Serie serie);
    }


}
