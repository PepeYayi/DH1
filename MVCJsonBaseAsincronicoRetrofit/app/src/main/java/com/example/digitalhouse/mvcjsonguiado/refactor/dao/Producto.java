package com.example.digitalhouse.mvcjsonguiado.refactor.dao;

/**
 * Created by digitalhouse on 24/05/17.
 */

public class Producto {
    private String title;
    private String id;
    private Double price;

    public Producto(String title, String id, Double price) {
        this.title = title;
        this.id = id;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getId() {
        return id;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "title='" + title + '\'' +
                ", id='" + id + '\'' +
                ", price=" + price +
                '}';
    }
}
