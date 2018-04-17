package com.example.dh.recyclerfinalpedro;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Activity2 extends AppCompatActivity implements FragmentDetalle.Notificable3 {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent intent = getIntent();

        Bundle bundle = intent.getExtras();

        FragmentDetalle fragmentDetalle = new FragmentDetalle();
        fragmentDetalle.setArguments(bundle);

        FragmentManager fragmentManager = getFragmentManager();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        // fragmentTransaction.add(R.id.FragmentContainer2, fragmentDetalle); ROMPE!!!!!!!

        fragmentTransaction.commit();

    }

    @Override
    public void eliminarCelda(Producto producto) {
        Intent intent = new Intent(this, MainActivity.class);

        Bundle bundle = new Bundle();
        bundle.putSerializable("ProductObject", producto);

        intent.putExtras(bundle);
        startActivity(intent);
    }

}
