package com.example.digitalhouse.mvcjsonguiado.refactor.controller;


import com.example.digitalhouse.mvcjsonguiado.refactor.dao.DAOProductoArchivo;
import com.example.digitalhouse.mvcjsonguiado.refactor.dao.DAOProductoInternet;
import com.example.digitalhouse.mvcjsonguiado.refactor.dao.Producto;
import com.example.digitalhouse.mvcjsonguiado.refactor.utils.ResultListener;

import java.util.List;

/**
 * Created by digitalhouse on 24/05/17.
 */

public class ProductoController {

    public void obtenerProductos(final ResultListener<List<Producto>>escuchadorDeLaVista) {
        List<Producto> productos = null;
        if(hayInternet()){
//            DAOProductoInternet daoProductoInternet = new DAOProductoInternet();
            DAOProductoInternet daoProductoInternet = new DAOProductoInternet();
            //   productos = daoProductoInternet.obtenerProductosDeInternet();

            daoProductoInternet.obtenerProductosDeInternetAsincronico(new ResultListener<List<Producto>>() {
                @Override
                public void finish(List<Producto> resultado) {
                    escuchadorDeLaVista.finish(resultado);
                }
            });

        }else{
            DAOProductoArchivo daoProductoArchivo = new DAOProductoArchivo();
            escuchadorDeLaVista.finish(daoProductoArchivo.obtenerProductosDeArchivo());
        }

    }

    public Boolean hayInternet(){
        return true;
    }

}
