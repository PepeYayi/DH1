package com.example.dh2.listview;


import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentRecyclerView extends Fragment {
    private Notificable notificable;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment_recycler_view, container, false);

        cargarListaDePersonajes();

        //Busco el RecyclerView para luego poder setearle el adaptador
        RecyclerView recyclerViewPersonajes = (RecyclerView) view.findViewById(R.id.recyclerViewPersonajes);

        //Le decimos que no va a variar el tamanio de la lista
        recyclerViewPersonajes.setHasFixedSize(true);

        //Le pedimos que muestre las cosas en forma de lista
        recyclerViewPersonajes.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL,false));

        //Le pedimos que muestre las cosas en forma de grilla
        //recyclerViewPersonajes.setLayoutManager(new GridLayoutManager(this,2));


        //Aca creo el adapter que necesita tener un contexto y una lista de personajes
        PersonajesAdapter adapter = new PersonajesAdapter(cargarListaDePersonajes(), new PersonajesAdapter.NotificableDelClickRecycler() {
            @Override
            public void notificarClick(Personaje personaje) {
                notificable.recibirPersonajeClickeado(personaje);
            }
        });


        recyclerViewPersonajes.setAdapter(adapter);

        return view;
    }

    private List<Personaje> cargarListaDePersonajes(){
        List<Personaje> personajeList = new ArrayList();

        Personaje donald = new Personaje("PatoDonald","Hablar como pato",R.drawable.pato);
        Personaje batman = new Personaje("Batman","Ser rico",R.drawable.batman);
        Personaje spiderman = new Personaje("Spiderman", "Ser picado por una araña", R.drawable.spiderman);
        Personaje goku = new Personaje("Goku","Hamehameha", R.drawable.descarga);


        for (int i = 0; i < 20; i++) {
            personajeList.add(donald);
            personajeList.add(batman);
            personajeList.add(spiderman);
            personajeList.add(goku);
        }

        return personajeList;
    }


    // ------------------------------------------------------------------------------------------//

    //CON EL METODO ON ATTACH ME GUARDO EL CONTEXTO EN DONDE ESTA INCRUSTADO EL FRAGMENT
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.notificable = (Notificable) context;
    }

    //ESTA INTERFAZ LA CREO PARA PODER COMUNICAR AL FRAGMENT CON EL ACTIVITY EN DONDE ESTE
    public interface Notificable{
        void recibirPersonajeClickeado(Personaje personaje);
    }
}
