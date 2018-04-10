package com.digitalhouse.fragmentexample;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // DE EN VEZ DE TENER 2 TIPOS DISTINTOS DE FRAGMENT, TENGO UN SOLO TIPO DE FRAGMENT CUSTOMIZABLE
        // CON LA FABRICA CREO 2 FRAGMENTS DEL MISMO TIPO PERO CON DISTINTO CONTENIDO
        // PUEDO LLAMAR A LA FABRICA DIRECTAMENTE CON EL NOMBRE DE LA CLASE PORQUE ES UN METODO ESTATICO.
        final FragmentColor fragmentRojo = FragmentColor.fabricaDeFragmentsDeColores("Fragment Rojo", R.color.red);
        final FragmentColor fragmentVerde = FragmentColor.fabricaDeFragmentsDeColores("Fragment Verde", R.color.green);


        // Pido el Fragment Manager. POR CADA ACTIVIDAD HAY UN SOLO FRAGMENT MANAGER
        final FragmentManager fragmentManager = getSupportFragmentManager();

        Button buttonRojo = findViewById(R.id.buttonRojo);
        buttonRojo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Primera Transaccion
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayoutBottom, fragmentRojo);
                fragmentTransaction.commit();
            }
        });


        Button buttonVerde = findViewById(R.id.buttonVerde);
        buttonVerde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Segunda Transaccion
                FragmentTransaction fragmentTransaction2 = fragmentManager.beginTransaction();
                fragmentTransaction2.replace(R.id.frameLayoutBottom, fragmentVerde);
                fragmentTransaction2.commit();
            }
        });
    }
}
