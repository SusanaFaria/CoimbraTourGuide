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
        places.add(new Places(R.drawable.uc, getString(R.string.UC), getString(R.string.UC_description), getString(R.string.UC_phone_num), getString(R.string.UC_url)));
        places.add(new Places(R.drawable.criptoportico, getString(R.string.criptoportic), getString(R.string.crpt_descript), getString(R.string.cript_ph_num), getString(R.string.cript_url)));
        places.add(new Places(R.drawable.aqueduto, getString(R.string.aqueduto),getString(R.string.aqued_descript), null, getString(R.string.aqued_url)));
        places.add(new Places(R.drawable.jardim_da_manga, getString(R.string.jardim_manga), getString(R.string.jard_manga_descript), null, getString(R.string.jard_manga_url)));
        places.add(new Places(R.drawable.mosteiro_sclv, getString(R.string.santa_clara_velha), getString(R.string.santa_cl_vlh_descript), getString(R.string.santa_cl_vlh_phon_num), getString(R.string.santa_cl_vlh_url)));
        places.add(new Places(R.drawable.fonte_dos_amores, getString(R.string.fonte_dos_amores), getString(R.string.font_amores_descript), getString(R.string.font_amores_phone_num), getString(R.string.font_amores_url)));

        final PlacesAdapter adapter = new PlacesAdapter(getActivity(), places);

        GridView gridView = rootView.findViewById(R.id.grid);
        gridView.setAdapter(adapter);

        return rootView;
    }
}








