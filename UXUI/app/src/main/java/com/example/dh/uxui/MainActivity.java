package com.example.dh.uxui;


import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Fragment1.Notificador {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment1 fragment1 = new Fragment1();

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();

        transaction.add(R.id.container1, fragment1);

        transaction.commit();

    }


    @Override
    public void clickEnMas(String mensaje, String regalos) {
        if (mensaje.isEmpty()){

            /* Snackbar.make(MainActivity.this, "Error en los datos", Snackbar.LENGTH_LONG)
                .setAction("CLOSE", new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                        }
                     } */
            Toast.makeText(MainActivity.this, "Error en los datos", Toast.LENGTH_LONG);

    }       else {
            Fragment2 fragment2 = new Fragment2();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container1, fragment2);

            Bundle bundle = new Bundle();
            bundle.putString("mensaje", mensaje);
            bundle.putString("regalos", regalos);

            fragmentTransaction.commit();

        }
}}
