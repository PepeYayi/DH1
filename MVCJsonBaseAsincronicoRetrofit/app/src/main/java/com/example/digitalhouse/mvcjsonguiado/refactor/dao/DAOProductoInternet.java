package com.example.digitalhouse.mvcjsonguiado.refactor.dao;

import com.example.digitalhouse.mvcjsonguiado.refactor.utils.ResultListener;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by digitalhouse on 24/05/17.
 */

public class DAOProductoInternet {
    private String baseURL;
    private Retrofit retrofit;
    private ServiceProducto service;

    public DAOProductoInternet(){
        baseURL = "http://pokeapi.co/api/v2/";
        retrofit = new Retrofit.Builder()
                .baseUrl( baseURL)
                .addConverterFactory(GsonConverterFactory. create())
                .build();
        service = retrofit.create(ServiceProducto. class);
    }
    public List<Producto> obtenerProductosDeInternet(){
        List<Producto>productos = new ArrayList<>();

        productos.add(new Producto("PS4","La ultima PlayStation, diversion asegurada",12000.0));
        productos.add(new Producto("PS3","La ante-ultima PlayStation, diversion casi-asegurada",12000.0));
        productos.add(new Producto("PS2","La segunda PlayStation, diversion notan-asegurada",12000.0));
        productos.add(new Producto("PS1","La primer Play, diversion solo para entendidos",12000.0));

        return productos;
    }
    public void obtenerProductosDeInternetAsincronico(final ResultListener<List<Producto>> escuchadorDelControlador){
        List<Producto>productos = new ArrayList<>();
        //Armo el hilo secundario
        //Dos mil años despues
        service.getProductos("Zapatillas").enqueue(new Callback<ContenedorDeProductos>() {
            @Override
            public void onResponse(Call<ContenedorDeProductos> call, Response<ContenedorDeProductos> response) {
                escuchadorDelControlador.finish(response.body().getResults());

            }

            @Override
            public void onFailure(Call<ContenedorDeProductos> call, Throwable t) {

            }
        });
    }
}
