package com.example.dh.agregaroquitarcontactospedro;

import java.io.Serializable;

/**
 * Created by DH on 18/4/2018.
 */

public class Series implements Serializable{

    private String nombre;
    private int intImagen;

    public Series(String nombre, String descripcion) {
        this.nombre = nombre;
        this.intImagen = R.drawable.vikings;

    }

    public Series(String nombre, String descripcion, int intImagen) {
        this.nombre = nombre;
        this.intImagen = intImagen;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIntImagen() {
        return intImagen;
    }



}
