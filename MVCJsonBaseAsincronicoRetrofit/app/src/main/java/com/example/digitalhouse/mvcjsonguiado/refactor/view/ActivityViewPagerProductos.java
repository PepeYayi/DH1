package com.example.digitalhouse.mvcjsonguiado.refactor.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.digitalhouse.mvcjsonguiado.R;
import com.example.digitalhouse.mvcjsonguiado.refactor.dao.Producto;
import com.example.digitalhouse.mvcjsonguiado.refactor.controller.ProductoController;
import com.example.digitalhouse.mvcjsonguiado.refactor.utils.ResultListener;

import java.util.List;

public class ActivityViewPagerProductos extends AppCompatActivity {

    private List<Producto> productos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producto_deportivos_v4);

        cargarProductos();
    }

    public void cargarProductos(){
        ProductoController productoController = new ProductoController();
        //productos = productoController.obtenerProductos();
        productoController.obtenerProductos(new ResultListener<List<Producto>>() {
            @Override
            public void finish(List<Producto> resultado) {
                Toast.makeText(ActivityViewPagerProductos.this, productos.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }

}



