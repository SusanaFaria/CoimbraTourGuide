package com.example.android.coimbratourguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

public class PlacesFragmentPagerAdapter extends android.support.v4.app.FragmentPagerAdapter {

    private String TabTitles[] = new String[]{"Monuments", "Things To Do", "Eat"};

    public PlacesFragmentPagerAdapter(FragmentManager fm) {
        super(fm);

    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public Fragment getItem(int position) {

        if (position == 0) {
            return new Monuments();
        } else if (position ==1) {
                return new ThingsToDo();
            }
        else return new Eat ();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return TabTitles[position];

    }
}

