package com.example.android.coimbratourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

public class PlacesFragmentPagerAdapter extends android.support.v4.app.FragmentPagerAdapter {

    private Context mContext;


    public PlacesFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;

    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public Fragment getItem(int position) {

        if (position == 0) {
            return new Monuments();
        } else if (position ==1) {
                return new ThingsToDo();
            }
            else if (position ==2) {
            return new Eat();
        }
        else return new Sleep ();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position

        if (position == 0) {
            return mContext.getString(R.string.monuments);
        } else if (position == 1) {
            return mContext.getString(R.string.toDo);
        } else if (position == 2) {
            return mContext.getString(R.string.comer);
        } else {
            return mContext.getString(R.string.sleep);
        }

    }
}

