package com.example.digitalhouse.mvcjsonguiado.refactor.dao;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by DH on 3/4/2018.
 */

public interface ServiceProducto {

//    @GET("/sites/MLA/search?q=tennis")
//    Call<ContenedorDeProductos>getProductos();

    @GET("/sites/MLA/search")
    Call<ContenedorDeProductos>getProductos(@Query("q") String terminoABuscar);

}
