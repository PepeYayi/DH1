package com.example.usuario.pedrogabrielyaya_entregable2;


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
public class FragmentRecetas extends Fragment {

    private AdapterRecetas adapterRecetas;
    private AdapterRecetas.Notificable notificable;

    public FragmentRecetas() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment_recetas, container, false);


        RecyclerView recyclerViewRecetas = view.findViewById(R.id.recetas_recycler_view);
        recyclerViewRecetas.setHasFixedSize(true);
        recyclerViewRecetas.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));

        adapterRecetas = new AdapterRecetas(crearListaRecetas(), new AdapterRecetas.Notificable() {
            @Override
            public void abrirDetalleReceta(List<Receta> listaDeRecetas, Integer posicionReceta) {
               notificable.abrirDetalleReceta(listaDeRecetas,posicionReceta);
            }
        });

        recyclerViewRecetas.setAdapter(adapterRecetas);

        return view;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        notificable = (AdapterRecetas.Notificable) context;
    }




    private static List<Receta> crearListaRecetas() {

        List<Receta> listaRecetas = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            listaRecetas.add(new Receta("PAPAS CREMA", "Papas hechas con mil hojas de asdasd ad", R.drawable.milhojas));
            listaRecetas.add(new Receta("CEBICHE", "Cebiche hechas con mil hojas de asdasd ad", R.drawable.cebiche));
            listaRecetas.add(new Receta("EMPANADAS DE CARNE", "Papas hechas con mil hojas de asdasd ad", R.drawable.empanadas));
            listaRecetas.add(new Receta("GRANOLA CON FRUTA", "Papas hechas con mil hojas de asdasd ad", R.drawable.granolaconfruta));
            listaRecetas.add(new Receta("LOCRO", "Papas hechas con mil hojas de asdasd ad", R.drawable.locro));
            listaRecetas.add(new Receta("TARTA DE ACELGA", "Papas hechas con mil hojas de asdasd ad", R.drawable.tartaacelga));
            listaRecetas.add(new Receta("PINCHOS DE POLLO", "Papas hechas con mil hojas de asdasd ad", R.drawable.pinchopollo));
            listaRecetas.add(new Receta("TARTA DE FRUTILLA", "Papas hechas con mil hojas de asdasd ad", R.drawable.tortafrutilla));

        }

        return listaRecetas;
    }


}
