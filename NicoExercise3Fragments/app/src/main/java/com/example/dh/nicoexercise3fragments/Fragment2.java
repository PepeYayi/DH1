package com.example.dh.nicoexercise3fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment2 extends Fragment {


    private Notificador2 notificador2;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_fragment2, container, false);

        Button botonCrear2 = view.findViewById(R.id.botonCrearFrag2);


        botonCrear2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText email = view.findViewById(R.id.editTextEmail);
                EditText password = view.findViewById(R.id.editTextPasswordFrag2);
                EditText repetirPass = view.findViewById(R.id.editTextRepetirPasswordFrag2);

                String enviarEmail = email.getText().toString();
                String enviarPassword = password.getText().toString();
                String enviarRepetirPass = repetirPass.getText().toString();




                notificador2.clickCrear2(enviarEmail, enviarPassword, enviarRepetirPass);
            }
        });







        return view;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.notificador2 = (Notificador2) context;
    }



    public interface Notificador2{
        public void clickCrear2(String email, String pass, String passRepetida);

    }


}
