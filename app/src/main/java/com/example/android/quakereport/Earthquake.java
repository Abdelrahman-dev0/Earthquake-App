package com.example.android.quakereport;

/**
 * {@link Earthquake} represents a vocabulary word that the user wants to learn.
 */

public class Earthquake {

    /* magnitude of the earthquake*/
    private double mMagnitude;

    /* location */
    private String mLocation;

    /** Date */
    private String mDate;

    /** Time of the earthquake */
    private long mTimeInMilliseconds;

    private String mUrl;

    /**
     * Constructs a new {@link Earthquake} object.
     *
     * @param mMagnitude is the magnitude (size) of the earthquake
     * @param mLocation is the city location of the earthquake
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
     *  earthquake happened
     */

    public Earthquake(double mMagnitude, String mLocation, long timeInMilliseconds, String url) {
        this.mMagnitude = mMagnitude;
        this.mLocation = mLocation;
        this.mTimeInMilliseconds = timeInMilliseconds;
        this.mUrl = url;
    }

    public Earthquake(double mMagnitude, String mLocation, String mDate) {
        this.mMagnitude = mMagnitude;
        this.mLocation = mLocation;
        this.mDate = mDate;
    }

    public Earthquake(double mMagnitude, String mLocation, long mTimeInMilliseconds) {
        this.mMagnitude = mMagnitude;
        this.mLocation = mLocation;
        this.mTimeInMilliseconds = mTimeInMilliseconds;
    }

    public double getmMagnitude() {
        return mMagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }

    public String getmDate() {
        return mDate;
    }

    /**
     * Returns the time of the earthquake.
     */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    /**
     * Returns the website URL to find more information about the earthquake.
     */
    public String getUrl() {
        return mUrl;
    }
}
