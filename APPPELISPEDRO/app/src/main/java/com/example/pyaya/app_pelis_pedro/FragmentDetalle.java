package com.example.pyaya.app_pelis_pedro;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class FragmentDetalle extends Fragment {

    private ImageView imagenDetalle;
    private TextView nombreDetalle;
    private TextView descripcionDetalle;


    public static final String CLAVE_SERIE_DETALLE = "contacto";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_fragment_detalle, container, false);
        Bundle elBundleQueMeMandoLaActivity = getArguments();
        Serie serie = (Serie) elBundleQueMeMandoLaActivity.getSerializable(CLAVE_SERIE_DETALLE);

        nombreDetalle = view.findViewById(R.id.textViewNombreContactoFragmentDetalle);
        descripcionDetalle = view.findViewById(R.id.textViewDescripcionContactoFragmentDetalle);
        imagenDetalle = view.findViewById(R.id.imagenFragmentDetalle);

        nombreDetalle.setText(serie.getNombre());
        descripcionDetalle.setText(serie.getDescripcion());
        imagenDetalle.setImageResource(serie.getIntImagen());





        return view;

    }
}
