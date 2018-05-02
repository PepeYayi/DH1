package com.example.usuario.pedrogabrielyaya_entregable2;

import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterRecetas extends RecyclerView.Adapter {

    private List<Receta> listaDeRecetas;
    private Notificable notificable;

    public AdapterRecetas(List<Receta> listaDeRecetas, Notificable notificable) {
        this.listaDeRecetas = listaDeRecetas;
        this.notificable = notificable;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View viewCelda = layoutInflater.inflate(R.layout.celda_receta,parent, false);
        RecetasViewHolder recetasViewHolder = new RecetasViewHolder(viewCelda);

        return  recetasViewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Receta receta = listaDeRecetas.get(position);
        RecetasViewHolder recetasViewHolder = (RecetasViewHolder) holder;
        recetasViewHolder.cargarReceta(receta);

    }

    @Override
    public int getItemCount() {
        return listaDeRecetas.size();
    }

    private class RecetasViewHolder extends RecyclerView.ViewHolder{

        private TextView titulo;
        private TextView descripcion;
        private ImageView imagen;



        public RecetasViewHolder(View itemView) {
            super(itemView);


            titulo = itemView.findViewById(R.id.tituloReceta);
            descripcion = itemView.findViewById(R.id.descripcionReceta);
            imagen = itemView.findViewById(R.id.imagenReceta);

            imagen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    notificable.abrirDetalleReceta(listaDeRecetas, getAdapterPosition());
                }
            });

        }

        public void cargarReceta(Receta receta){
            titulo.setText(receta.getTitulo());
            descripcion.setText(receta.getDescripcion());
            imagen.setImageResource(receta.getIntImagen());

        }
    }


    public interface Notificable{
        void abrirDetalleReceta(List<Receta> listaDeRecetas, Integer posicionReceta);
    }

}
