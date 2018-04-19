package com.example.pyaya.app_pelis_pedro;


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
public class Fragment1 extends Fragment implements AdapterSeries.Notificable {


    AdapterSeries adapterSeries;
    Notificable2 notificable2;

    public Fragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

             View view = inflater.inflate(R.layout.fragment_fragment1, container, false);

             adapterSeries = new AdapterSeries(crearLista(), this);


        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerViewFragment1);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));

        recyclerView.setAdapter(adapterSeries);

        return view;
    }


    private List<Serie> crearLista(){

        List<Serie> lista = new ArrayList<>();

        lista.add(new Serie("LA CASA DE PAPEL", "slaaaam"));
        lista.add(new Serie("VIKINGS", "saasdm"));
        lista.add(new Serie("ASDASD", "saaad"));
        lista.add(new Serie("ADASD", "slaadim"));


        return lista;
    }

    @Override
    public void abrirDetalleContactoClickeado(Serie serie) {
        notificable2.abrirDetalleContactoClickeado2(serie);
    }



    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        notificable2 = (Notificable2) getActivity();
    }


    public interface Notificable2{
        void abrirDetalleContactoClickeado2(Serie serie);
    }


}
