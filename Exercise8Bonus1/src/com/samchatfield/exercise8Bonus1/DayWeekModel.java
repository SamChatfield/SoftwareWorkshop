package com.samchatfield.exercise8Bonus1;

import java.util.Observable;

/**
 * The model in the MVC application design which links to the program logic in DayWeek and notifies observers of changes to fields
 *
 * Created by Sam on 18/11/2015.
 */
public class DayWeekModel extends Observable {

    private DayWeek dayWeek;

    /**
     * Create new model with given DayWeek logic object
     *
     * @param dayWeek DayWeek object
     */
    public DayWeekModel(DayWeek dayWeek) {
        super();
        this.dayWeek = dayWeek;
    }

    /**
     * Return day
     * @return day
     */
    public int getDay() {
        return dayWeek.getDay();
    }

    /**
     * Return string name of day of the week
     * @return day of the week
     */
    public String getDayOfWeek() {
        return dayWeek.getDayOfWeek();
    }

    /**
     * Return month
     * @return month
     */
    public int getMonth() {
        return dayWeek.getMonth();
    }

    /**
     * Return year
     * @return year
     */
    public int getYear() {
        return dayWeek.getYear();
    }

    /**
     * Return max number of days in current month
     * @return number of days
     */
    public int getDayMax() {
        return dayWeek.getDayMax();
    }

    /**
     * Return the julian day of the given Gregorian date
     *
     * @return julian day
     */
    public double getJulianDay() {
        return dayWeek.getJulianDay();
    }

    /**
     * Change day value and notify the view of the change to update itself
     * @param day new day
     */
    public void setDay(int day) {
        dayWeek.setDay(day);
        setChanged();
        notifyObservers();
    }

    /**
     * Change month value and notify the view of the change to update itself
     * @param month new month
     */
    public void setMonth(int month) {
        dayWeek.setMonth(month);
        setChanged();
        notifyObservers();
    }

    /**
     * Change year value and notify the view of the change to update itself
     * @param year new year
     */
    public void setYear(int year) {
        dayWeek.setYear(year);
        setChanged();
        notifyObservers();
    }

}
