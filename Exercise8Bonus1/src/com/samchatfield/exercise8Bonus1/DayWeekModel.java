package com.samchatfield.exercise8Bonus1;

import java.util.Observable;

/**
 * Created by Sam on 18/11/2015.
 */
public class DayWeekModel extends Observable {

    private DayWeek dayWeek;

    public DayWeekModel(DayWeek dayWeek) {
        super();
        this.dayWeek = dayWeek;
    }

    public int getDay() {
        return dayWeek.getDay();
    }

    public int getMonth() {
        return dayWeek.getMonth();
    }

    public int getYear() {
        return dayWeek.getYear();
    }

    public void setDay(int day) {
        dayWeek.setDay(day);
        setChanged();
        notifyObservers();
    }

    public void setMonth(int month) {
        dayWeek.setMonth(month);
        setChanged();
        notifyObservers();
    }

    public void setYear(int year) {
        dayWeek.setYear(year);
        setChanged();
        notifyObservers();
    }

}
