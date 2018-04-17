package com.example.dh2.listview;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class FragmentDetalle extends Fragment {

    public static final String NOMBRE_PERSONAJE = "nombre";
    public static final String SUPERPODER_PERSONAJE = "superpoder";
    public static final String IMAGEN_PERSONAJE = "imagen";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment_detalle, container, false);

        //EXTRAER EL BUNDLE
        Bundle bundle = getArguments();

        String nombre = bundle.getString(NOMBRE_PERSONAJE);
        String superpoder = bundle.getString(SUPERPODER_PERSONAJE);
        Integer imageId = bundle.getInt(IMAGEN_PERSONAJE);

        Personaje unPersonaje = new Personaje(nombre, superpoder, imageId);

        TextView textViewNombre = (TextView) view.findViewById(R.id.textViewDetalleNombre);
        textViewNombre.setText(unPersonaje.getNombre());

        TextView textViewSuperPoder = (TextView) view.findViewById(R.id.textViewDetalleSuperPoder);
        textViewSuperPoder.setText(unPersonaje.getSuperpoder());

        ImageView imageView = (ImageView) view.findViewById(R.id.imageViewDetallePersonaje);
        imageView.setImageResource(unPersonaje.getImagenId());
        return view;
    }

}
