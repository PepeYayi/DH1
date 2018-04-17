package com.example.dh.recyclerfinalpedro;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1 extends Fragment implements FragmentDetalle.Notificable3 {



    private EditText modelo;
    private EditText precio;
    private Button botonCargar;

    private Notificable2 notificable2;


    public Fragment1() {
        // Required empty public constructor
    }


    //EL ON CLICK PIDE POSICION , REMOVE Y NOTIFY


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment1, container, false);

        modelo = view.findViewById(R.id.editTextModelo);
        precio = view.findViewById(R.id.editTextPrecio);
        botonCargar = view.findViewById(R.id.botonCargar);



        List<Producto> listaDeProductos = new ArrayList<>();
        listaDeProductos.add(new Producto("Lanchi1", "$4000",R.drawable.desc3));
        listaDeProductos.add(new Producto("Lanchi2", "$5000",R.drawable.desc1));
        listaDeProductos.add(new Producto("Lanchi3", "$6000",R.drawable.desc2));
        listaDeProductos.add(new Producto("Lanchi4", "$7000",R.drawable.desc3));
        listaDeProductos.add(new Producto("Lanchi5", "$8000",R.drawable.desc4));
        listaDeProductos.add(new Producto("Lanchi6", "$9000",R.drawable.desc1));
        listaDeProductos.add(new Producto("Lanchi7", "$9900",R.drawable.desc2));
        listaDeProductos.add(new Producto("Lanchi8", "$9990",R.drawable.desc3));

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.RecyclerViewPedro);

        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));

        final Adapter adapter = new Adapter(listaDeProductos, new Adapter.Notificable() {
            @Override
            public void notificarClick(Producto producto) {
                notificable2.recibirProductoClickeado(producto);
            }
        });

        recyclerView.setAdapter(adapter);

        botonCargar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String modelo1 = modelo.getText().toString();
                String precio1 = precio.getText().toString();

                Producto productoNuevo = new Producto(modelo1, precio1);

                adapter.agregarProducto(productoNuevo);
            }
        });


        return view;

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.notificable2 = (Notificable2) context;
    }

    @Override
    public void eliminarCelda(Producto producto) {



    }

    public interface Notificable2{
        void recibirProductoClickeado(Producto producto);
    }

}
