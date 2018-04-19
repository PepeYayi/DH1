package com.example.dh.recyclerfinalpedro;


import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements Fragment1.Notificable2{

    Fragment1 fragment1 = new Fragment1();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);

        fragment1 = new Fragment1();

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.add(R.id.FragmentContainer, fragment1);
        fragmentTransaction.commit();

        try {
            eliminarCelda();
        }catch (Exception e){

        }


    }

    @Override
    public void recibirProductoClickeado(Producto producto) {
        Intent intent = new Intent(this, Activity2.class);

        Bundle bundle = new Bundle();
        bundle.putString(FragmentDetalle.MODELO_PRODUCTO, producto.getModelo());
        bundle.putString(FragmentDetalle.PRECIO_PRODUCTO, producto.getPrecio());
        //bundle.putInt(FragmentDetalle.IMAGEN_PRODUCTO, producto.getIntImagen());

        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void eliminarCelda() {
        Intent intent = getIntent();

        Bundle bundle = intent.getExtras();

        Producto productoAEliminar = (Producto) bundle.getSerializable("ObjectProduct");

        fragment1.eliminarCelda(productoAEliminar);

    }


    //RECIBIR SERIALIZABLE Y ELIMINAR PRODUCTO
}
