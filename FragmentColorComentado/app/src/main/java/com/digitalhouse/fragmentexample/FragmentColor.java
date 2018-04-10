package com.digitalhouse.fragmentexample;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class FragmentColor extends Fragment {
    // MIS CLAVES
    public static final String CLAVE_TEXTO = "claveTexto";
    public static final String CLAVE_COLOR = "claveColor";


    // TIENE QUE SER ESTATICO PARA QUE PUEDA LLAMARLO CON EL NOMBRE DE LA CLASE DIRECTAMENTE.

    // SER ESTATICO SIGNIFICA QUE ES UN MÉTODO DE LA CLASE, NO DE LA INSTANCIA.
    // ES DECIR, NO HAY UN METODO POR CADA INSTANCIA, SINO QUE ES UN SOLO METODO GLOBAL PARA LA CLASE.
    public static FragmentColor fabricaDeFragmentsDeColores(String texto, Integer resColor){
        // CREO UN BUNDLE PARA PASAR LOS PARAMETROS AL FRAGMENT
        Bundle unBundle = new Bundle();
        unBundle.putString(CLAVE_TEXTO, texto);
        unBundle.putInt(CLAVE_COLOR, resColor);

        // CREO UNA INSTANCIA DE FRAGMENT_COLOR
        FragmentColor fragmentColor = new FragmentColor();
        // LE PASO LOS PARAMETROS AL FRAGMENT
        fragmentColor.setArguments(unBundle);

        // DEVUELVO LA INSTANCIA DE FRAGMENT CREADA.
        return fragmentColor;
    }


    public FragmentColor(){
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // PIDO EL BUNDLE
        Bundle bundle = getArguments();

        // CONSIGO LOS PARAMETROS
        String texto = bundle.getString(CLAVE_TEXTO);
        Integer resColor = bundle.getInt(CLAVE_COLOR);

        // INFLO EL LAYOUT
        View view = inflater.inflate(R.layout.fragment_color, container, false);

        // BUSCO LOS COMPONENTES
        View root = view.findViewById(R.id.root);
        TextView textView = view.findViewById(R.id.textview);

        // CARGAR LOS PARAMETROS EN LOS COMPONENTES
        textView.setText(texto);

        // VOY A BUSCAR A LOS RECURSOS MI COLOR CON EL ID DE RECURSO QUE TENGO.
        // LOS COLORES EN JAVA TAMBIÉN SON ENTEROS.
        Integer color = ContextCompat.getColor(getContext(), resColor);
        // CARGO EL COLOR
        root.setBackgroundColor(color);

        // DEVUELVO LA VISTA PARA QUE SE CARGUE.
        return view;
    }

}
