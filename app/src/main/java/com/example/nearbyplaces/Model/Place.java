package com.example.nearbyplaces.Model;

public class Place {

    private String mPlaceName;
    private Double mPlaceRating;
    private String mPlaceAddress;
    private String mPlacePhoneNumber;
    private String mPlaceOpeningHourStatus;

    public String getmPlaceName() {
        return mPlaceName;
    }

    public Double getmPlaceRating() {
        return mPlaceRating;
    }

    public String getmPlaceAddress() {
        return mPlaceAddress;
    }

    public String getmPlacePhoneNumber() {
        return mPlacePhoneNumber;
    }

    public String getmPlaceOpeningHourStatus() {
        return mPlaceOpeningHourStatus;
    }

    public void setmPlaceName(String mPlaceName) {
        this.mPlaceName = mPlaceName;
    }

    public void setmPlaceRating(Double mPlaceRating) {
        this.mPlaceRating = mPlaceRating;
    }

    public void setmPlaceAddress(String mPlaceAddress) {
        this.mPlaceAddress = mPlaceAddress;
    }

    public void setmPlacePhoneNumber(String mPlacePhoneNumber) {
        this.mPlacePhoneNumber = mPlacePhoneNumber;
    }

    public void setmPlaceOpeningHourStatus(String mPlaceOpeningHourStatus) {
        this.mPlaceOpeningHourStatus = mPlaceOpeningHourStatus;
    }
}
