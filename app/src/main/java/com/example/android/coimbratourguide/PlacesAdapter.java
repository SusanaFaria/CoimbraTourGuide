package com.example.android.coimbratourguide;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.sax.StartElementListener;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.text.method.LinkMovementMethod;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.net.URL;
import java.util.ArrayList;

import static com.example.android.coimbratourguide.R.color.colorAccent;

public class PlacesAdapter extends ArrayAdapter<Places> {

    private Context mContext;



    public PlacesAdapter(Activity context, ArrayList<Places> places) {

        super(context, 0, places);
        this.mContext = context;
    }


    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        // Check if the existing view is being reused, otherwise inflate the view
        View gridItemView = convertView;
        if (gridItemView == null) {
            gridItemView = LayoutInflater.from(mContext).inflate(
                    R.layout.place_layout, parent, false);


        }

        final Places currentPlace = getItem(position);
        ImageView imgView = gridItemView.findViewById(R.id.placeImage);
        imgView.setImageResource(currentPlace.getImageId());
        imgView.setVisibility(View.VISIBLE);

        final TextView name = gridItemView.findViewById(R.id.name);
        name.setText(currentPlace.getPlaceName());
        name.setAllCaps(true);

        TextView description = gridItemView.findViewById(R.id.description);
        description.setText(currentPlace.getDescription());
        description.getContext().getResources().getResourceEntryName(R.style.description_text);

        ImageView phone = gridItemView.findViewById(R.id.phone);
        phone.setVisibility(View.VISIBLE);

        TextView phoneNUmber = gridItemView.findViewById(R.id.phone_number);
        phoneNUmber.setText(currentPlace.getPhoneNum());

        TextView urlz = gridItemView.findViewById(R.id.url);
        urlz.setText(getContext().getResources().getString(R.string.web));
        urlz.setAllCaps(true);
        urlz.setTextColor(getContext().getResources().getColor(R.color.colorAccent));
        urlz.setTypeface(null, Typeface.BOLD);
        urlz.setGravity(Gravity.CENTER);
        urlz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent directions = new Intent(Intent.ACTION_VIEW);
                directions.setData(Uri.parse(String.valueOf("http://"+currentPlace.getUrl())));
                getContext().startActivity(directions);

            }
        });


        return gridItemView;

    }
}

