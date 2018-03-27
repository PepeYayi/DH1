package com.example.dh.comunicaractivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SenderActivity extends AppCompatActivity {
    private EditText editText;
    private Button boton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sender);
        editText = findViewById(R.id.editTextNombre);
        boton = findViewById(R.id.botonEnviar);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SenderActivity.this, RecieverActivity.class);
                String nombreIngresado = editText.getText().toString();
                Bundle bundle = new Bundle();

                bundle.putString(RecieverActivity.CLAVE_NOMBRE, nombreIngresado);

                intent.putExtras(bundle);

                startActivity(intent);

            }
        });

    }
}
