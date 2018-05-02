package com.example.usuario.pedrogabrielyaya_entregable2;

import android.widget.ImageView;

public class Receta {

    private String titulo;
    private String descripcion;
    private int intImagen;


    public Receta(String titulo, String descripcion, int intImagen) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.intImagen = intImagen;
    }


    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getIntImagen() {
        return intImagen;
    }
}
