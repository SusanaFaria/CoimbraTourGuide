package com.example.android.coimbratourguide;

public class Places {

    private String mPlaceName;
    private int mImage;
    private String mDescription;
    private String mPhoneNum;
    private String mUrl;



    public Places(int image, String placeName, String description, String phoneNum, String url) {
        mPlaceName = placeName;
        mImage = image;
        mDescription = description;
        mPhoneNum = phoneNum;
        mUrl = url;

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

        public String getUrl() {
        return mUrl;
        }

}
