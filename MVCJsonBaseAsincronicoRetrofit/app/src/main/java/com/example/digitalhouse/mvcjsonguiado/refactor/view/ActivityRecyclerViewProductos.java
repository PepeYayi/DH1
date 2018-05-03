package com.example.digitalhouse.mvcjsonguiado.refactor.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Toast;

import com.example.digitalhouse.mvcjsonguiado.R;
import com.example.digitalhouse.mvcjsonguiado.refactor.dao.Producto;
import com.example.digitalhouse.mvcjsonguiado.refactor.controller.ProductoController;
import com.example.digitalhouse.mvcjsonguiado.refactor.utils.ResultListener;

import java.util.List;

public class ActivityRecyclerViewProductos extends AppCompatActivity {
    private List<Producto> productos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producto_v4);

        cargarProductos();

        Toast.makeText(this, "Hola", Toast.LENGTH_SHORT).show();
        Button unBoton;
 /*       unBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        controlador.dameProductos(new EscuchadorDeProductos() {
            @Override
            public void laOperacionTermino(List<Producto>) {

            }
        });*/
    }

    public void cargarProductos(){
        ProductoController productoController = new ProductoController();
        //productos = productoController.obtenerProductos();
        productoController.obtenerProductos(new ResultListener<List<Producto>>() {
            @Override
            public void finish(List<Producto> resultado) {
                productos = resultado;
                Toast.makeText(ActivityRecyclerViewProductos.this, productos.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}


