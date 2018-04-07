package com.example.dh.nicoexercise3fragments;


import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Fragment1.Notificador {



    //REGLAS : EMAIL DEBE CONTENER @ Y .COM
    // PASS DEBE ESTAR CORRECTA LA REPETICION
    // PASS MIN 6 CARACTERES



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment1 fragment1 = new Fragment1();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.container1, fragment1);
        //FALTAN ACA LOS COMMIT




    }


    @Override
    public void clickLogin() {

        Fragment2 fragment2 = new Fragment2();
        FragmentManager fragmentManager2 = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction2 = fragmentManager2.beginTransaction();
        fragmentTransaction2.replace(R.id.container1, fragment2);

    }

    @Override
    public void clickCrear() {

        Fragment3 fragment3 = new Fragment3();
        FragmentManager fragmentManager3 = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction3 = fragmentManager3.beginTransaction();
        fragmentTransaction3.replace(R.id.container1, fragment3);


    }
}
