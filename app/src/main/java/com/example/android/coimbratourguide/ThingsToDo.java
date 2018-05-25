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
public class ThingsToDo extends Fragment {


    public ThingsToDo() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
      final View rootView = inflater.inflate(R.layout.grid_view, container, false);

        //create a list of monuments

        final ArrayList<Places> places = new ArrayList<>();
        places.add(new Places(R.drawable.boat_ride,getString(R.string.basofias), getString(R.string.basofias_descript),getString(R.string.basofias_phone_num), getString(R.string.basofias_url)));
        places.add(new Places(R.drawable.bus,getString(R.string.bus), getString(R.string.bus_descript), getString(R.string.bus_phone_num), getString(R.string.bus_url)));
        places.add(new Places(R.drawable.downtown, getString(R.string.downtown), getString(R.string.downtown_descript), null, getString(R.string.downtown_url)));
        places.add(new Places(R.drawable.golf, getString(R.string.golf), getString(R.string.golf_descript), getString(R.string.golf_phone_num), getString(R.string.golf_url)));
        places.add(new Places(R.drawable.jb, getString(R.string.botanical_garden), getString(R.string.bot_gard_descript), getString(R.string.bot_garden_phone_num), getString(R.string.bot_gard_url)));
        places.add(new Places(R.drawable.portugal_pequenitos,getString(R.string.small_portugal), getString(R.string.small_port_descript), getString(R.string.small_port_phone_num), getString(R.string.small_port_url)));

        final PlacesAdapter adapter = new PlacesAdapter(getActivity(), places);

        GridView gridView = (GridView) rootView.findViewById(R.id.grid);
        gridView.setAdapter(adapter);

        return rootView;


    }


}
