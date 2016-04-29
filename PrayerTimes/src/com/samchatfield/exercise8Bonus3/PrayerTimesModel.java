package com.samchatfield.exercise8Bonus3;

/**
 * Created by Sam on 21/11/2015.
 */
public class PrayerTimesModel {

    private double julianDay, longitude, latitude;
    private int timeZone;

    public PrayerTimesModel(double julianDay, double longitude, double latitude) {
        this.julianDay = julianDay;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public double getJulianDay() {
        return julianDay;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public int getTimeZone() {
        return timeZone;
    }

}
