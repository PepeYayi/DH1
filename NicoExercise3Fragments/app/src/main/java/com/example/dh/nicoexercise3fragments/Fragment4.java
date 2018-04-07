package com.example.dh.nicoexercise3fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment4 extends Fragment {


    public Fragment4() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_fragment4, container, false);

        TextView emailFrag4 = view.findViewById(R.id.emailFrag4);
        TextView passwordFrag4 = view.findViewById(R.id.passwordFrag4);




        return view;
    }

}
