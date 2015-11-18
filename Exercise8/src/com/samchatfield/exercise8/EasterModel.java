package com.samchatfield.exercise8;

import java.util.Observable;

/**
 * The model in the MVC application design which forms another part of the application's logic along with the Easter object itself
 *
 * Created by Sam on 17/11/2015.
 */
public class EasterModel extends Observable {

    private Easter easter;

    /**
     * Create a new model with the given Easter object
     *
     * @param easter the easter object to use
     */
    public EasterModel(Easter easter) {
        super();
        this.easter = easter;
    }

    /**
     * Return the day
     * @return day
     */
    public int getDay() {
        return easter.getDay();
    }

    /**
     * Return an integer representation of the month
     * @return month
     */
    public int getMonth() {
        return easter.getMonth();
    }

    /**
     * Return the year
     * @return year
     */
    public int getYear() {
        return easter.getYear();
    }

    /**
     * Change the year to calculate with a different one and notify observers of the change
     * @param year the new year to calculate date of easter
     */
    public void setYear(int year) {
        easter.setYear(year);
        setChanged();
        notifyObservers();
    }

}
