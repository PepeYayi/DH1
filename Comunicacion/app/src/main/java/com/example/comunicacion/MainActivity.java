package com.example.comunicacion;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView botonEnviar;
    private EditText editText;
    private EditText editTextEdad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botonEnviar = findViewById(R.id.enviar);
        editText = findViewById(R.id.edittext);
        editTextEdad = findViewById(R.id.edittext_edad);
        //SETEO EL CLICK LISTENER PROGRAMATICAMENTE (EN VEZ DE HACERLO POR XML)
        //ESTO SE HACE CREANDO UNA "INNER CLASS".
        botonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //CREO UN INTENT: PRIMERO SE LE ESPECIFICA DONDE ESTOY Y LUEGO COMO SEGUNDO PARAMETRO
                //A QUE ACTIVITY VOY.
                Intent intent = new Intent(MainActivity.this,HomeActivity.class);
                String nombreIngresado = editText.getText().toString();
                String edadIngresada = editTextEdad.getText().toString();
                //CREO UN BUNDLE. ES UN PAQUETE QUE CONTIENE PARES "CLAVE - VALOR"
                Bundle bundle = new Bundle();
                //LE INGRESO DOS PARES DE CLAVE VALOR AL BUNDLE
                //LAS CLAVES QUE PONGO EN EL BUNDLE POR BUENAS PRACTICAS DEBERIAN ESTAR DECLARADAS
                //EN LA ACTIVIDAD RECEPTORA, COMO CONSTANTES. EN ESTE CASO "CLAVE_NOMBRE" Y "CLAVE_EDAD"
                bundle.putString(HomeActivity.CLAVE_NOMBRE,nombreIngresado);
                bundle.putString(HomeActivity.CLAVE_EDAD,edadIngresada);
                //LE PONGO AL INTENT EL BUNDLE CREADO
                intent.putExtras(bundle);
                //INICIO EN EL INTENT PARA IR A LA ACTIVIDAD DESEADA.
                startActivity(intent);
            }
        });
    }


}
