package com.example.dh.nicoexercise3fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1 extends Fragment {

    private Notificador notificador;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_fragment1, container, false);

        Button botonLogin = view.findViewById(R.id.botonLogin);
        Button botonCrear = view.findViewById(R.id.botonCrear);

        botonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notificador.clickLogin();
            }
        });


        botonCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notificador.clickCrear();
            }
        });

        return view;
    }


    public interface Notificador{
       public void clickLogin();
       public void clickCrear();
    }

}
