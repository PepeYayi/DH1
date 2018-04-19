package com.example.dh.recyclerfinalpedro;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by DH on 16/4/2018.
 */



    // PARA EL DEL DETALLE, EL ADAPTER LE AVISA AL FRAGMENT, EL FRAGMENT LE AVISA A LA ACTIVITY , LA ACT A LA ACT2 Y ESTA AL FRAGMENT DETALLE

public class Adapter extends RecyclerView.Adapter implements FragmentDetalle.Notificable3{


    List<Producto> listaDeProductos;
    private Notificable notificable;

    public Adapter(List<Producto> listaDeProductos, Notificable notificable)  {
        this.listaDeProductos = listaDeProductos;
        this.notificable = notificable;
    }

    public Adapter(List<Producto> listaDeProductos) {
        this.listaDeProductos = listaDeProductos;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View viewDeCelda = layoutInflater.inflate(R.layout.celda, parent, false);
        ProductViewHolder productViewHolder = new ProductViewHolder(viewDeCelda);

        return  productViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Producto producto = listaDeProductos.get(position);
        ProductViewHolder productViewHolder = (ProductViewHolder) holder;
        productViewHolder.cargarProducto(producto);
    }

    @Override
    public int getItemCount() {
        return  listaDeProductos.size();
    }

    public void agregarProducto(Producto producto)
    {
        listaDeProductos.add(producto);
        notifyDataSetChanged();
    }

    @Override
    public void eliminarCelda(Producto producto) {
        listaDeProductos.remove(producto);
        notifyDataSetChanged();
    }

    private class ProductViewHolder extends RecyclerView.ViewHolder{

        private TextView modelo;
        private TextView precio;
        private ImageView imagen;

        public ProductViewHolder(View itemView) {
            super(itemView);

            modelo = (TextView) itemView.findViewById(R.id.modeloDeProducto);
            precio = (TextView) itemView.findViewById(R.id.precioDeProducto);
            imagen = (ImageView) itemView.findViewById(R.id.imagenProducto);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    notificable.notificarClick(listaDeProductos.get(getAdapterPosition()));
                }
            });
        }

        public void cargarProducto(Producto producto){
            modelo.setText(producto.getModelo());
            precio.setText(producto.getPrecio());
            imagen.setImageResource(producto.getIntImagen());
        }






    }

    public void eliminarProducto(Producto producto){
        listaDeProductos.remove(producto);
        notifyDataSetChanged();
    }


    public interface Notificable{
        void notificarClick(Producto producto);
    }


}
