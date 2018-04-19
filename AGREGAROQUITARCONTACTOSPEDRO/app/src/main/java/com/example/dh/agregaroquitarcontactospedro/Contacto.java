package com.example.dh.agregaroquitarcontactospedro;

import java.io.Serializable;

/**
 * Created by DH on 18/4/2018.
 */

public class Contacto implements Serializable{

    private String nombre;
    private String descripcion;
    private int intImagen;

    public Contacto(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.intImagen = R.drawable.pelado;

    }

    public Contacto(String nombre, String descripcion, int intImagen) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.intImagen = intImagen;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getIntImagen() {
        return intImagen;
    }



}
