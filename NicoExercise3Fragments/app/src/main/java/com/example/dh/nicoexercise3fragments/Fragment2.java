package com.example.dh.nicoexercise3fragments;


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


    public Fragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_fragment2, container, false);

        EditText email = view.findViewById(R.id.editTextEmail);
        EditText password = view.findViewById(R.id.editTextPasswordFrag2);
        EditText repetirPass = view.findViewById(R.id.editTextRepetirPasswordFrag2);
        Button botonCrear2 = view.findViewById(R.id.botonCrearFrag2);




        return view;
    }

}
