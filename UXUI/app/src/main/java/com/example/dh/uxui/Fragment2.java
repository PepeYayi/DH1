package com.example.dh.uxui;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment2 extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment2, container, false);

        TextView mensajeFragment2 = view.findViewById(R.id.mensajeFragment2);
        TextView regalosFragment2 = view.findViewById(R.id.regalosFragment2);

        Bundle bundle = new Bundle();
        String mensaje1 =  bundle.getString("mensaje");
        String regalos1 = bundle.getString("regalos");

        mensajeFragment2.setText(mensaje1);
        regalosFragment2.setText(regalos1);


        return view;
    }

}
