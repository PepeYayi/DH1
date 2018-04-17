package com.example.dh.recyclerviewpedro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<PersonajeInvitado> listaDeInvitados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaDeInvitados = new ArrayList<>();
        listaDeInvitados.add(new PersonajeInvitado("ARIEL"));
        listaDeInvitados.add(new PersonajeInvitado("ARIdfEL"));
        listaDeInvitados.add(new PersonajeInvitado("ARIsdfEL"));
        listaDeInvitados.add(new PersonajeInvitado("ARsfsdfIEL"));
        listaDeInvitados.add(new PersonajeInvitado("ARsdfdsfdsfIEL"));
        listaDeInvitados.add(new PersonajeInvitado("ARIsfdsfdsfEL"));
        listaDeInvitados.add(new PersonajeInvitado("ARIsdEL"));
        listaDeInvitados.add(new PersonajeInvitado("ARIdsdfEL"));

        //Busco el RecyclerView para luego poder setearle el adaptador
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerViewMainActivity);


        //Le decimos que no va a variar el tamanio de la lista
        recyclerView.setHasFixedSize(true);


        //Le pedimos que muestre las cosas en forma de lista
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        //Creo el Adapter
        Adapter adapter = new Adapter(listaDeInvitados);

        //Matcheamos al adapter con el recycler
        recyclerView.setAdapter(adapter);







    }
}
