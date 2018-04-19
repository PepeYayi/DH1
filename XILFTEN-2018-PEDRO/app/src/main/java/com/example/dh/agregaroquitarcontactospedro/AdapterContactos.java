package com.example.dh.agregaroquitarcontactospedro;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by DH on 18/4/2018.
 */

public class AdapterContactos extends RecyclerView.Adapter {

    private List<Series> listaDeSeries;
    private Notificable notificable;

    public AdapterContactos(List<Series> listaDeSeries, Notificable notificable) {
        this.listaDeSeries = listaDeSeries;
        this.notificable = notificable;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View viewCelda = layoutInflater.inflate(R.layout.celda, parent, false);
        ContactViewHolder contactViewHolder = new ContactViewHolder(viewCelda);

        return contactViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Series series = listaDeSeries.get(position);
        ContactViewHolder contactViewHolder = (ContactViewHolder) holder;
        contactViewHolder.cargarContacto(series);

    }

    @Override
    public int getItemCount() {
        return listaDeSeries.size();
    }


    private class ContactViewHolder extends RecyclerView.ViewHolder {


        private TextView nombre;
        private TextView descripcion;
        private ImageView imagen;


        public ContactViewHolder(View itemView) {
            super(itemView);

            nombre = (TextView) itemView.findViewById(R.id.textViewNombreContactoCelda);
            descripcion = (TextView) itemView.findViewById(R.id.textViewDescripcionContactoCelda);
            imagen = (ImageView) itemView.findViewById(R.id.imagenCelda);

            imagen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Series seriesClickiado = listaDeSeries.get(getAdapterPosition());
                    notificable.abrirDetalleContactoClickeado(seriesClickiado);
                }
            });

        }

        public void cargarContacto(Series series){
            nombre.setText(series.getNombre());
            descripcion.setText(series.getDescripcion());
            imagen.setImageResource(series.getIntImagen());


        }



    }


    public interface Notificable{
        void abrirDetalleContactoClickeado(Series series);
    }



}
