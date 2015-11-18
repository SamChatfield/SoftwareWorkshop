package com.samchatfield.exercise8;

import java.util.Observable;

/**
 * Created by Sam on 17/11/2015.
 */
public class EasterModel extends Observable {

    private Easter easter;

    public EasterModel(Easter easter) {
        super();
        this.easter = easter;
    }

    public int getDay() {
        return easter.getDay();
    }

    public int getMonth() {
        return easter.getMonth();
    }

    public int getYear() {
        return easter.getYear();
    }

    public void setYear(int year) {
        easter.setYear(year);
        setChanged();
        notifyObservers();
    }

}
