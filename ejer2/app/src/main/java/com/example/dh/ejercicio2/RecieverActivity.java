package com.example.dh.ejercicio2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class RecieverActivity extends AppCompatActivity {


    public static final String CLAVE_NOMBRE = "clave nombre";
    public static final String CLAVE_APELLIDO = "clave apellido";
    public static final String CLAVE_EDAD = "clave edad";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reciever);

        Intent intentRecibido = getIntent();
        Bundle bundleRecibido = intentRecibido.getExtras();

        String nombreRecibido = bundleRecibido.getString(CLAVE_NOMBRE);
        String apellidoRecibido = bundleRecibido.getString(CLAVE_APELLIDO);
        String edadRecibida = bundleRecibido.getString(CLAVE_EDAD);

        // RECIEVER : PONER IDS A LOS EDIT TEXT Y SET TEXT A LA VARIABLE ANTERIOR


    }
}
