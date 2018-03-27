package com.example.dh.comunicaractivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class RecieverActivity extends AppCompatActivity {


    public static final String CLAVE_NOMBRE = "clave nombre";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reciever);

        Intent intentRecibido = getIntent();
        Bundle bundleRecibido = intentRecibido.getExtras();

        String nombreRecibido = bundleRecibido.getString(CLAVE_NOMBRE);

        Toast.makeText(this, "Nombre: " + nombreRecibido, Toast.LENGTH_SHORT).show();

    }
}
