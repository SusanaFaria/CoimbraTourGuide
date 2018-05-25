package com.example.android.coimbratourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Sleep extends Fragment {


    public Sleep() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.grid_view, container, false);

        final ArrayList<Places> places = new ArrayList<>();
        places.add(new Places(R.drawable.hostel_se_velha,getString( R.string.hostel_se_velha), getString(R.string.hostel_se_velha_descript), getString(R.string.hostel_se_velha_phon_num), getString(R.string.hostel_se_velha_url)));
        places.add(new Places(R.drawable.hotel_astoria, getString(R.string.hotel_astoria), getString(R.string.hotel_astoria_descript), getString(R.string.hotel_astoria_phon_num), getString(R.string.hotel_astoria_url)));
        places.add(new Places(R.drawable.hotel_ibis, getString(R.string.hotel_ibis), getString(R.string.hotel_ibis_descript), getString(R.string.hotel_ibis_phon_num), getString(R.string.hotel_ibis_url)));
        places.add(new Places(R.drawable.vila_gale, getString(R.string.hotel_vila_gale), getString(R.string.hotel_vg_descript), getString(R.string.hotel_vg_phon_num), getString(R.string.hotel_vg_url)));
        places.add(new Places(R.drawable.pousada_juventude, getString(R.string.hi_hostel), getString(R.string.hi_hostel_descript), getString(R.string.hi_hostel_phon_num), getString(R.string.hi_hostel_url)));
        places.add(new Places(R.drawable.ibn_arrik, getString(R.string.hotel_ibn_arrik), getString(R.string.hotel_ibn_descript), getString(R.string.hotel_ibn_phon_num), getString(R.string.hotel_ibn_url)));
        final PlacesAdapter adapter = new PlacesAdapter(getActivity(), places);

        GridView gridView = (GridView) rootView.findViewById(R.id.grid);
        gridView.setAdapter(adapter);


        return rootView;
    }

}
