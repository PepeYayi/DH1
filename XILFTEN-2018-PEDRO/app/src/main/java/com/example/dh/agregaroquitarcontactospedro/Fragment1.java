package com.example.dh.agregaroquitarcontactospedro;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
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
public class Fragment1 extends Fragment implements AdapterContactos.Notificable {

    AdapterContactos adapterContactos;
    Notificable2 notificable2;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment1, container, false);

        adapterContactos = new AdapterContactos(crearLista(), this);



        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerViewFragment1);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));

        recyclerView.setAdapter(adapterContactos);

        return view;

    }


    private List<Series> crearLista(){

        List<Series> lista = new ArrayList<>();

        lista.add(new Series("HOUSE OF CARDS"));
        lista.add(new Series("VIKINGS");
        lista.add(new Series("LA CASA DE PAPEL");



        return lista;
    }



    @Override
    public void abrirDetalleContactoClickeado(Series series) {
       notificable2.abrirDetalleContactoClickeado2(series);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        notificable2 = (Notificable2) getActivity();
    }

    public interface Notificable2{
        void abrirDetalleContactoClickeado2(Series series);
    }



}
