package com.example.usuario.pedrogabrielyaya_entregable2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentDetalle extends Fragment {

    private ImageView imagen;
    private TextView titulo;
    private TextView descripcion;


    public ImageView getImagen() {
        return imagen;
    }

    public void setImagen(ImageView imagen) {
        this.imagen = imagen;
    }

    public TextView getTitulo() {
        return titulo;
    }

    public void setTitulo(TextView titulo) {
        this.titulo = titulo;
    }

    public TextView getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(TextView descripcion) {
        this.descripcion = descripcion;
    }

    public FragmentDetalle() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view = inflater.inflate(R.layout.fragment_fragment_detalle, container, false);

        imagen = view.findViewById(R.id.imagenFragmentDetalle);
        titulo = view.findViewById(R.id.tituloFragmentDetalle);
        descripcion = view.findViewById(R.id.descripcionFragmentDetalle);



       return view;
    }

}
