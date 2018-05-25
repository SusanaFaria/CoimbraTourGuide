package com.example.android.coimbratourguide;


import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import static android.text.Layout.JUSTIFICATION_MODE_INTER_WORD;


public class AboutCoimbra extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_coimbra);

        TextView aboutCoimbra = (TextView) findViewById(R.id.aboutCoimbra);
        aboutCoimbra.setText(R.string.aboutCoimbra);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            aboutCoimbra.setJustificationMode(JUSTIFICATION_MODE_INTER_WORD);
        }

        ImageView map = (ImageView) findViewById(R.id.map);
        map.setVisibility(View.VISIBLE);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = getString(R.string.about_map);

                Uri webpage = Uri.parse(url);
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);

                }
            }
        });


    }
}