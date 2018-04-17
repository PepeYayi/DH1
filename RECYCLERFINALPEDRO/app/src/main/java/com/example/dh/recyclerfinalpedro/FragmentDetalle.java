package com.example.dh.recyclerfinalpedro;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentDetalle extends Fragment {

    private Notificable3 notificable3;

    public static final String MODELO_PRODUCTO = "modelo";
    public static final String PRECIO_PRODUCTO = "precio";
    public static final String IMAGEN_PRODUCTO = "imagen";


    public FragmentDetalle() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment_detalle, container, false);

        Bundle bundle = getArguments();

        String modelo = bundle.getString(MODELO_PRODUCTO);
        String precio = bundle.getString(PRECIO_PRODUCTO);
        // Integer imagenID = bundle.getInt(IMAGEN_PRODUCTO);

        final Producto producto = new Producto(modelo,precio);

        TextView textViewModelo = (TextView) view.findViewById(R.id.textViewDetalleModelo);
        TextView textViewPrecio = (TextView) view.findViewById(R.id.textViewDetallePrecio);
        // ImageView imageView = (ImageView) view.findViewById(R.id.imageViewDetalleImagen);

        textViewModelo.setText(producto.getModelo());
        textViewPrecio.setText(producto.getPrecio());
        // imageView.setImageResource(producto.getIntImagen());


        Button botonBorrar = (Button) view.findViewById(R.id.botonBorrar);
        botonBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notificable3.eliminarCelda(producto);
            }
        });

        return view;




    }


    public interface Notificable3{
        void eliminarCelda(Producto producto);
    }
}
