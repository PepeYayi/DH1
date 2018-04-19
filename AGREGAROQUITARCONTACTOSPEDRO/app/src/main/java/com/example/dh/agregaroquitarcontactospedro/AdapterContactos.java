package com.example.dh.agregaroquitarcontactospedro;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by DH on 18/4/2018.
 */

public class AdapterContactos extends RecyclerView.Adapter {

    private List<Contacto> listaDeContactos;
    private Notificable notificable;

    public AdapterContactos(List<Contacto> listaDeContactos,Notificable notificable) {
        this.listaDeContactos = listaDeContactos;
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
        Contacto contacto = listaDeContactos.get(position);
        ContactViewHolder contactViewHolder = (ContactViewHolder) holder;
        contactViewHolder.cargarContacto(contacto);

    }

    @Override
    public int getItemCount() {
        return listaDeContactos.size();
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
                    Contacto contactoClickiado = listaDeContactos.get(getAdapterPosition());
                    notificable.abrirDetalleContactoClickeado(contactoClickiado);
                }
            });

        }

        public void cargarContacto(Contacto contacto){
            nombre.setText(contacto.getNombre());
            descripcion.setText(contacto.getDescripcion());
            imagen.setImageResource(contacto.getIntImagen());


        }



    }


    public interface Notificable{
        void abrirDetalleContactoClickeado(Contacto contacto);
    }



}
