package com.example.dh.uxui;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1 extends Fragment {

    private Notificador notificador;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_fragment1, container, false);

        EditText editTextMensaje = view.findViewById(R.id.mensajeFragment1);
        EditText editTextRegalos = view.findViewById(R.id.regalosFragment1);

       final String mensaje = editTextMensaje.getText().toString();
       final String regalos = editTextRegalos.getText().toString();

        final FloatingActionButton botonFloating = view.findViewById(R.id.botonMas);

        botonFloating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notificador.clickEnMas(mensaje, regalos);

            }
        });


        return view;
    }

    public interface Notificador{
        public void clickEnMas(String mensaje, String regalos);
    }




}
