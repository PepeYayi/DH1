package com.example.dh2.listview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by dh2 on 26/04/17.
 */

public class PersonajesAdapter extends RecyclerView.Adapter {

    private List<Personaje> personajes;
    private NotificableDelClickRecycler notificable;

    public PersonajesAdapter(List<Personaje> personajes, NotificableDelClickRecycler notificable) {
        this.personajes = personajes;
        this.notificable = notificable;
    }

    //Devuelve un ViewHolder con la View
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View viewDeLaCelda = layoutInflater.inflate(R.layout.recyclerview_detalle_celda,parent,false);
        PersonajesViewHolder personajesViewHolder = new PersonajesViewHolder(viewDeLaCelda);
        return personajesViewHolder;
    }

    //Acá es donde se une el ViewHolder con el elemento a mostrar
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        final Personaje unPersonaje = personajes.get(position);
        final PersonajesViewHolder personajesViewHolder = (PersonajesViewHolder)holder;
        personajesViewHolder.cargarPersonaje(unPersonaje);

    }


    //Devolvemos la posición del ítem en la lista
    @Override
    public long getItemId(int position) {
        return position;
    }

    //Devuelve la cantidad de elementos contenidos en la lista
    @Override
    public int getItemCount() {
        return personajes.size();
    }


    public void removerPersonaje(Personaje personaje){
        personajes.remove(personaje);
        notifyDataSetChanged();
    }


    //Aca creo al viewHolder que va a mantener las referencias
    //de los elementos de la celda y va a saber cargarla
    private class PersonajesViewHolder extends RecyclerView.ViewHolder{

        private TextView textViewNombre;
        private TextView textViewPoder;
        private ImageView imageView;

        public PersonajesViewHolder(View itemView) {
            super(itemView);
            textViewNombre = (TextView) itemView.findViewById(R.id.textViewNombrePersonaje);
            textViewPoder = (TextView) itemView.findViewById(R.id.textViewPoder);
            imageView = (ImageView) itemView.findViewById(R.id.imageViewPersonaje);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    notificable.notificarClick(personajes.get(getAdapterPosition()));
                }
            });
        }

        public void cargarPersonaje(Personaje personajeAmostrar){

            textViewNombre.setText(personajeAmostrar.getNombre());
            textViewPoder.setText(personajeAmostrar.getSuperpoder());
            imageView.setImageResource(personajeAmostrar.getImagenId());
        }
    }

    public interface  NotificableDelClickRecycler{
        void notificarClick(Personaje personaje);
    }
}
