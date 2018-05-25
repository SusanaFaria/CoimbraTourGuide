package com.example.android.coimbratourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Eat extends Fragment {


    public Eat() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.grid_view, container, false);
        //create a list of monuments

        final ArrayList<Places> places = new ArrayList<>();
        places.add(new Places(R.drawable.fangas, getString(R.string.fangas), getString(R.string.fangas_descript), getString(R.string.fangas_phone_num), getString(R.string.fangas_url)));
        places.add(new Places(R.drawable.dux, getString(R.string.dux), getString(R.string.dux_descript), getString(R.string.dux_phon_num), getString(R.string.dux_url)));
        places.add(new Places(R.drawable.bistro_cafe_tapas_nas, getString(R.string.tapas), getString(R.string.tapas_descript), getString(R.string.tapas_phon_num), getString(R.string.tapas_url)));
        places.add(new Places(R.drawable.maria_portuguesa_tapas, getString(R.string.maria), getString(R.string.maria_descript), getString(R.string.maria_phon_num), getString(R.string.maria_url)));
        places.add(new Places(R.drawable.nata_lisboa, getString(R.string.nata), getString(R.string.nata_descript), getString(R.string.nata_phon_num), getString(R.string.nata_url)));
        places.add(new Places(R.drawable.taberna, getString(R.string.taberna), getString(R.string.taberna_descript), getString(R.string.taberna_phon_num), getString(R.string.taberna_url)));
        final PlacesAdapter adapter = new PlacesAdapter(getActivity(), places);

        GridView gridView = (GridView) rootView.findViewById(R.id.grid);
        gridView.setAdapter(adapter);


        return rootView;
    }

}
