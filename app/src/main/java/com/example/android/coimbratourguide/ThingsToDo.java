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
        places.add(new Places(R.drawable.boat_ride,"Basófias", "Take a boat ride through the Mondego river", "969 830 664", ""));
        places.add(new Places(R.drawable.bus, getString(R.string.bus), "YellowBusTours", "239 801 100", ""));
        places.add(new Places(R.drawable.downtown,"Old Town", "Take a walk through the downtown town streets", "", ""));
        places.add(new Places(R.drawable.golf, "Play Golf", "Catch some fresh air and exercise!", "239 802 388", ""));
        places.add(new Places(R.drawable.jb, "Botanical Garden", "Elegante jardim do séc. XVIII com canteiros de flores formais, fontes elevadas e estufas de plantas tropicais.\n" +
                "\n", "239 855 215", ""));
        places.add(new Places(R.drawable.portugal_pequenitos, "Portugal dos Pequenitos", "Portugal of the small, here you can be a child again and play inside the many houses and portuguese monuments in miniature. Come with kids or not, the fun is guaranteed. It even has a Barbie museum!", "239 801 170", ""));

        final PlacesAdapter adapter = new PlacesAdapter(getActivity(), places);

        GridView gridView = (GridView) rootView.findViewById(R.id.grid);
        gridView.setAdapter(adapter);

        return rootView;


    }


}
