package com.example.dh.recyclerviewpedro;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by DH on 11/4/2018.
 */

public class Adapter extends RecyclerView.Adapter {

    private List<PersonajeInvitado> listaDePersonajesInvitados;

    public Adapter(List<PersonajeInvitado> listaDePersonajesInvitados) {
        this.listaDePersonajesInvitados = listaDePersonajesInvitados;

    }


    //Aca es donde se crea la vista y el viewHolder
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View viewDeCelda = layoutInflater.inflate(R.layout.recycler_view, parent, false);
        InvitadosViewHolder invitadosViewHolder = new InvitadosViewHolder(viewDeCelda);

        return  invitadosViewHolder;
    }


    //Aca es donde al viewHolder que contiene la vista le cargo informacion
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        PersonajeInvitado personajeInvitado = listaDePersonajesInvitados.get(position);
        InvitadosViewHolder invitadosViewHolder = (InvitadosViewHolder) holder;
        invitadosViewHolder.cargarInvitado(personajeInvitado);


    }


    @Override
    public int getItemCount() {
        return listaDePersonajesInvitados.size();
    }




    //Aca creo al viewHolder que va a mantener las referencias
    //de los elementos de la celda y va a saber cargarla
    private class InvitadosViewHolder extends RecyclerView.ViewHolder{

        private TextView nombreInvitado;

        public InvitadosViewHolder(View itemView) {
            super(itemView);
            nombreInvitado =    (TextView) itemView.findViewById(R.id.textViewNombreInvitado);


        }

        public void cargarInvitado(PersonajeInvitado unPersonaje){
            nombreInvitado.setText(unPersonaje.getNombre());
        }


    }
}
