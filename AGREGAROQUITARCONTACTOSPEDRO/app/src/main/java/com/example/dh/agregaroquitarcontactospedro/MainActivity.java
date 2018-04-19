package com.example.dh.agregaroquitarcontactospedro;


import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Fragment1.Notificable2 {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment1 fragment1 = new Fragment1();

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.add(R.id.containerMainActivityFragment1, fragment1);

        fragmentTransaction.commit();




    }


    @Override
    public void abrirDetalleContactoClickeado2(Contacto contacto) {
        FragmentDetalle fragmentDetalle = new FragmentDetalle();
        Bundle bundle = new Bundle();
        bundle.putSerializable(FragmentDetalle.CLAVE_CONTACTO_DETALLE,contacto);
        fragmentDetalle.setArguments(bundle);


        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.containerMainActivityFragment1, fragmentDetalle);

        fragmentTransaction.commit();

    }


}

//AL ADAPTER CREA UN NOTIFICABLE QUE LO IMPLEMENTA EL FRAGMENT Y DENTRO DE ESA IMPLEMENTACION EN EL METODO DICE QUE
// UN NUEVO NOTIFICABLE VA A IMPLEMENTAR UN NUEVO METODO QUE VA A ESTAR IMPLEMENTANDO FINALMENTE LA ACTIVITY