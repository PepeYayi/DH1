package com.example.dh.recyclerfinalpedro;

import android.widget.ImageView;

/**
 * Created by DH on 16/4/2018.
 */

public class Producto {
    private String modelo;
    private String precio;
    private int intImagen;

    public Producto(String modelo, String precio) {
        this.modelo = modelo;
        this.precio = precio;
        intImagen = R.drawable.desc1;
    }

    public Producto(String modelo, String precio, int intImagen) {
        this.modelo = modelo;
        this.precio = precio;
        this.intImagen = intImagen;
    }


    public String getModelo() {
        return modelo;
    }

    public String getPrecio() {
        return precio;
    }

    public int getIntImagen() {
        return intImagen;
    }
}
