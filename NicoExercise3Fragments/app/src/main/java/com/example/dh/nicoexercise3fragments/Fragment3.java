package com.example.dh.nicoexercise3fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment3 extends Fragment {


    public Fragment3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_fragment3, container, false);

        EditText emailFrag3 = view.findViewById(R.id.editTextEmailFrag3);
        EditText passFrag3 = view.findViewById(R.id.editTextPasswordFrag3);





        return view;
    }

}
