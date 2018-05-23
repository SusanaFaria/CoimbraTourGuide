package com.example.android.coimbratourguide;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.sax.StartElementListener;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.net.URL;
import java.util.ArrayList;

public class PlacesAdapter extends ArrayAdapter<Places> {



    public PlacesAdapter(Activity context, ArrayList<Places> places) {

        super(context, 0, places);
    }


    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        // Check if the existing view is being reused, otherwise inflate the view
        View gridItemView = convertView;
        if (gridItemView == null) {
            gridItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.place_layout, parent, false);
        }

        final Places currentPlace = getItem(position);
        ImageView imgView = (ImageView) gridItemView.findViewById(R.id.placeImage);
        imgView.setImageResource(currentPlace.getImageId());
        imgView.setVisibility(View.VISIBLE);

        TextView name = (TextView) gridItemView.findViewById(R.id.name);
        name.setText(currentPlace.getPlaceName());

        TextView description = (TextView) gridItemView.findViewById(R.id.description);
        description.setText(currentPlace.getDescription());

        ImageView phone = (ImageView) gridItemView.findViewById(R.id.phone);
        phone.setVisibility(View.VISIBLE);

        TextView phoneNUmber = (TextView) gridItemView.findViewById(R.id.phone_number);
        phoneNUmber.setText(currentPlace.getPhoneNum());

        TextView web = (TextView) gridItemView.findViewById(R.id.url);
        web.setText("Directions");
        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(String.valueOf(currentPlace.getWeb())));
               getContext().startActivity(i);

            }
        });

        return gridItemView;

    }
}

