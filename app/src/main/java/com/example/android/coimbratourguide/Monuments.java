package com.example.android.coimbratourguide;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Monuments extends Fragment {


    public Monuments() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
      final View rootView = inflater.inflate(R.layout.grid_view, container, false);


        //create a list of monuments

        final ArrayList<Places> places = new ArrayList<>();
        places.add(new Places(R.drawable.uc, "University", "One of the oldest Universities in Europe", " 239 242 744", "www.googlemaps.com"));
        places.add(new Places(R.drawable.criptoportico, "Criptoportic", "Enter the underground Roman city", "239 853 070", ""));
        places.add(new Places(R.drawable.aqueduto, "Roman Aqueduct", "Remains of the roman presence", "no booking", ""));
        places.add(new Places(R.drawable.jardim_da_manga, "Jardim da Manga", "É uma das primeiras obras arquitectónicas inteiramente renascentistas feitas em Portugal e a sua estrutura é evocativa da Fonte da Vida", "no booking", ""));
        places.add(new Places(R.drawable.mosteiro_sclv, "Santa Clara-a-velha Monastery", "Representa um momento de experimentação do estilo gótico no país. A sua fundação, em fins do século XIII, inscreve-se numa conjuntura de gradual influência e aceitação na sociedade portuguesa em geral", " 239 801 160", ""));
        places.add(new Places(R.drawable.fonte_dos_amores, "Fonte dos Amores", " Data de 1326, ano em que Santa Isabel de Aragão, Rainha de Portugal mandou fazer um canal para levar a água de duas nascentes para o Convento de Santa Clara. Ao sítio de onde saía a água chamou-se \"Fonte dos Amores\", por ter presenciado a paixão de D. Pedro, neto da soberana, por Inês de Castro, fidalga galega que servia de dama de companhia à esposa de D. Pedro, D. Constança", "239 802 380", ""));

        final PlacesAdapter adapter = new PlacesAdapter(getActivity(), places);

        GridView gridView = (GridView) rootView.findViewById(R.id.grid);
        gridView.setAdapter(adapter);


        return rootView;


    }
}








