package com.example.android.coimbratourguide;

import android.net.Uri;

public class Places {

    private String mPlaceName;
    private int mImage;
    private String mDescription;
    private String mPhoneNum;
    private String mWeb;


    public Places(int image, String placeName, String description, String phoneNum, String web) {
        mPlaceName = placeName;
        mImage = image;
        mDescription = description;
        mPhoneNum = phoneNum;
        mWeb = web;
        }

    public int getImageId() {
        return mImage;
    }

    public String getPlaceName() {
        return mPlaceName;
    }

    public String getDescription() {
        return mDescription; }

    public String getPhoneNum() {
        return mPhoneNum; }

    public Uri getWeb() {

        return Uri.parse(mWeb);
    }


}
