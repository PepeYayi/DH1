package com.example.dh2.listview;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        //RECIBO EL INTENT
        Intent unIntent = getIntent();

        //EXTRAIGO EL BUNDLE DEL INTENT
        Bundle bundle = unIntent.getExtras();

        //CARGAR EL FRAGMENT DETALLE EN EL SECOND ACTIVITY Y PASARLE EL BUNDLE QUE TIENE EL PERSONAJE
        FragmentDetalle fragmentDetalle = new FragmentDetalle();
        fragmentDetalle.setArguments(bundle);

        FragmentManager fragmentManager = getFragmentManager();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.add(R.id.contendorDeFragmentSecondActivity, fragmentDetalle);

        fragmentTransaction.commit();
    }
}
