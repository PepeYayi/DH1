package com.example.dh.ejercicio2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText editTextNombre;
    private EditText editTextApellido;
    private EditText editTextEdad;
    private Button boton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNombre = findViewById(R.id.editTextNombre);
        editTextApellido = findViewById(R.id.editTextApellido);
        editTextEdad = findViewById(R.id.editTextEdad);
        boton = findViewById(R.id.botonMandar);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RecieverActivity.class);
                String nombreIngresado = editTextNombre.getText().toString();
                String apellidoIngresado = editTextApellido.getText().toString();
                String edadIngresada = editTextEdad.getText().toString();


            }
        });




    }
}
