package com.example.dh.recyclerfinalpedro;

import android.widget.ImageView;

import java.io.Serializable;

/**
 * Created by DH on 16/4/2018.
 */

public class Producto implements Serializable {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Producto producto = (Producto) o;

        if (intImagen != producto.intImagen) return false;
        if (modelo != null ? !modelo.equals(producto.modelo) : producto.modelo != null)
            return false;
        return precio != null ? precio.equals(producto.precio) : producto.precio == null;
    }

    @Override
    public int hashCode() {
        int result = modelo != null ? modelo.hashCode() : 0;
        result = 31 * result + (precio != null ? precio.hashCode() : 0);
        result = 31 * result + intImagen;
        return result;
    }
}
