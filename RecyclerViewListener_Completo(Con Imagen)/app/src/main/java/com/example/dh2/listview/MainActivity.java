package com.example.dh2.listview;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements FragmentRecyclerView.Notificable{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //CARGO EL FRAGMENT LISTVIEW EN PANTALLA PRINCIPAL
        Fragment fragmentRecyclerView = new FragmentRecyclerView();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment_holder, fragmentRecyclerView);
        fragmentTransaction.commit();
    }

    @Override
    public void recibirPersonajeClickeado(Personaje personaje) {


        // ESTA FUNCION LO QUE HACE ES LANZAR EL ACTIVITY 2, ENVIANDO AL PERSONAJE DENTRO DE UN BUNDLE

        Intent unIntent = new Intent(this, SecondActivity.class);

        Bundle unBundle = new Bundle();
        unBundle.putString(FragmentDetalle.NOMBRE_PERSONAJE, personaje.getNombre());
        unBundle.putString(FragmentDetalle.SUPERPODER_PERSONAJE, personaje.getSuperpoder());
        unBundle.putInt(FragmentDetalle.IMAGEN_PERSONAJE, personaje.getImagenId());

        unIntent.putExtras(unBundle);

        startActivity(unIntent);
    }
}
