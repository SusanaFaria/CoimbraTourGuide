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
        places.add(new Places(R.drawable.uc, "University", "description", "phoneNum", ""));
        places.add(new Places(R.drawable.portugal_pequenitos, "Portugal dos Pequenitos", "description", "", ""));
        places.add(new Places(R.drawable.aqueduto, "Roman Ruins", "", "", ""));
        final PlacesAdapter adapter = new PlacesAdapter(getActivity(), places);

        GridView gridView = (GridView) rootView.findViewById(R.id.grid);
        gridView.setAdapter(adapter);


        return rootView;
    }

}
