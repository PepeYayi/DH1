package com.example.comunicacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    public static final String CLAVE_NOMBRE = "clave nombre";
    public static final String CLAVE_EDAD = "clave edad";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        //ACA HAGO EL PROCESO INVERSO. DEBO OBTENER TOODO LO QUE VIAJO EN EL BUNDLE DENTRO DEL INTENT
        //POR ESO PRIMERO DE TOODO OBTENGO EL INTENT
        Intent intentRecibido = getIntent();
        //LUEGO OBTENGO EL BUNDLE QUE ESTA DENTRO DEL INTENT OBTENIDO
        Bundle bundleRecibido = intentRecibido.getExtras();
        //LUEGO OBTENGO LOS STRINGS QUE VIAJARON DENTRO DEL BUNDLE
        //PARA ESO LO HAGO A TRAVES DE LAS CLAVES. ES DECIR LAS CONSTANTES QUE DECLARE
        //EN ESTA ACTIVDAD, QUE ES LA RECEPTORA. "CLAVE_NOMBRE" Y "CLAVE_EDAD"
        String nombreRecibido = bundleRecibido.getString(CLAVE_NOMBRE);
        String edadRecibida = bundleRecibido.getString(CLAVE_EDAD);

        Toast.makeText(this, "Hola: " + nombreRecibido
                 + " edad: " + edadRecibida, Toast.LENGTH_SHORT).show();
    }
}
