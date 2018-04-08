package com.example.dh.nicoexercise3fragments;


import android.content.Context;
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

  // private Notificador3 notificador3;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_fragment3, container, false);

        EditText emailFrag3 = view.findViewById(R.id.editTextEmailFrag3);
        EditText passFrag3 = view.findViewById(R.id.editTextPasswordFrag3);





        return view;
    }

      /*  @Override
        public void onAttach(Context context) {
        super.onAttach(context);
        this.notificador3 = (Notificador3) context;
        }

        public interface Notificador3{


        } */



}
