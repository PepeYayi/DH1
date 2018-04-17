package digitalhouse.android.listviewpersonajesbasico;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //Aca declaro que voy a tener una lista de personajes favoritos
    List<PersonajeDeSerie> misPersonajesFavoritos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Aca comienzo a cargar la lista con los personajes
        misPersonajesFavoritos = new ArrayList<>();
        misPersonajesFavoritos.add(new PersonajeDeSerie("Goku"));
        misPersonajesFavoritos.add(new PersonajeDeSerie("Seiya"));
        misPersonajesFavoritos.add(new PersonajeDeSerie("Ikki"));
        misPersonajesFavoritos.add(new PersonajeDeSerie("HeMan"));
        misPersonajesFavoritos.add(new PersonajeDeSerie("La vaca y el pollito"));
        misPersonajesFavoritos.add(new PersonajeDeSerie("Coraje el perro cobarte"));
        misPersonajesFavoritos.add(new PersonajeDeSerie("Dexter y su laboratorio"));
        misPersonajesFavoritos.add(new PersonajeDeSerie("Oliver Atom"));
        misPersonajesFavoritos.add(new PersonajeDeSerie("Tom Misaki"));
        misPersonajesFavoritos.add(new PersonajeDeSerie("Pinky y Cerebro"));
        misPersonajesFavoritos.add(new PersonajeDeSerie("Los Simpsons"));
        misPersonajesFavoritos.add(new PersonajeDeSerie("Duckman"));
        misPersonajesFavoritos.add(new PersonajeDeSerie("Steve hyuga"));
        misPersonajesFavoritos.add(new PersonajeDeSerie("Johny Bravo"));


        //Busco el RecyclerView para luego poder setearle el adaptador
        RecyclerView recyclerViewPersonajes = (RecyclerView) findViewById(R.id.recyclerViewMainActivity);

        //Le decios que no va a variar el tamanio de la lista
        recyclerViewPersonajes.setHasFixedSize(true);

        //Le pedimos que muestre las cosas en forma de lista
        recyclerViewPersonajes.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));

        //Le pedimos que muestre las cosas en forma de grilla
        //recyclerViewPersonajes.setLayoutManager(new GridLayoutManager(this,2));


        //Aca creo el adapter que necesita tener un contexto y una lista de personajes
        //PersonajesAdapter unAdapterDePersonajes = new PersonajesAdapter(this,misPersonajesFavoritos);

        //Creamos el adaptador del recycler
        PersonajesRecyclerAdapter unAdapterDePersonajesAdapter = new PersonajesRecyclerAdapter(this,misPersonajesFavoritos);


        //Al listView le seteo el adapter
        //unaViewList.setAdapter(unAdapterDePersonajes);

        //Le damos el adapter al Recycler
        //listViewJuguetes.setAdapter(adaptadorDeJuguetes);
        recyclerViewPersonajes.setAdapter(unAdapterDePersonajesAdapter);

    }
}
