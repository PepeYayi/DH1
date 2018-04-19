package com.example.dh.agregaroquitarcontactospedro;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentDetalle extends Fragment {

    private ImageView imagenDetalle;
    private TextView nombreDetalle;
    private TextView descripcionDetalle;


   public static final String CLAVE_CONTACTO_DETALLE = "contacto";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_fragment_detalle, container, false);
        Bundle elBundleQueMeMandoLaActivity = getArguments();
        Series series = (Series) elBundleQueMeMandoLaActivity.getSerializable(CLAVE_CONTACTO_DETALLE);

        nombreDetalle = view.findViewById(R.id.textViewNombreContactoFragmentDetalle);
        descripcionDetalle = view.findViewById(R.id.textViewDescripcionContactoFragmentDetalle);
        imagenDetalle = view.findViewById(R.id.imagenFragmentDetalle);

        nombreDetalle.setText(series.getNombre());
        descripcionDetalle.setText(series.getDescripcion());
        imagenDetalle.setImageResource(series.getIntImagen());





        return view;

    }

}
