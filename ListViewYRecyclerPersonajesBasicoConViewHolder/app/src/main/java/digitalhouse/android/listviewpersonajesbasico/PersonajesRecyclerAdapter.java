package digitalhouse.android.listviewpersonajesbasico;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by joe on 5/8/17.
 */

public class PersonajesRecyclerAdapter extends RecyclerView.Adapter {
    private Context unContexto;
    private List<PersonajeDeSerie> listaDeDatosAMostrar;

    public PersonajesRecyclerAdapter(Context contextoRecivido,
        List<PersonajeDeSerie>unaLista){
        unContexto = contextoRecivido;
        listaDeDatosAMostrar = unaLista;
    }


    //Aca es donde se crea la vista y el viewHolder
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(unContexto);
        View viewDeLaCelda = layoutInflater.inflate(R.layout.listview_detalle,parent,false);
        PersonajesViewHolder personajesViewHolder = new PersonajesViewHolder(viewDeLaCelda);

        return personajesViewHolder;
    }

    //Aca es donde al viewHolder que contiene la vista le cargo informacion
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        PersonajeDeSerie unPersonaje = listaDeDatosAMostrar.get(position);
        PersonajesViewHolder personajesViewHolder = (PersonajesViewHolder) holder;
        personajesViewHolder.cargarPersonaje(unPersonaje);
    }

    @Override
    public int getItemCount() {
        return listaDeDatosAMostrar.size();
    }


        //Aca creo al viewHolder que va a mantener las referencias
        //de los elementos de la celda y va a saber cargarla
    private class PersonajesViewHolder extends RecyclerView.ViewHolder{
        private TextView textViewNombrePersonaje;

        public PersonajesViewHolder(View itemView) {
            super(itemView);
            textViewNombrePersonaje = (TextView)itemView.findViewById(R.id.textViewNombrePersonaje);
        }

        public void cargarPersonaje(PersonajeDeSerie unPersonaje){
            textViewNombrePersonaje.setText(unPersonaje.getNombre());
        }
    }
}