package com.samchatfield.exercise8Bonus1;

import javax.swing.*;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by Sam on 20/11/2015.
 */
public class JulianView extends JLabel implements Observer {

    private DayWeekModel model;

    /**
     * Create new view linked to given model and set the label value to the julian day
     *
     * @param model model
     */
    public JulianView(DayWeekModel model) {
        this.model = model;
        setText(formatDay(model.getJulianDay(), model.getDay(), model.getMonth(), model.getYear()));
    }

    public String formatDay(double j, int day, int month, int year) {
        String julianDay = "The Julian Day on " + day + "/" + month + "/" + year + " is " + Double.toString(j);
        if (year > 1582) {
            return julianDay;
        } else if (year == 1582) {
            if (month > 10) {
                return julianDay;
            } else if (month == 10) {
                if (day >= 15) {
                    return julianDay;
                }
            }
        }
        return "Julian day only valid for dates after 15/10/1582";
    }

    /**
     * Called when notifyObservers is called from observables of this view
     *
     * @param o   observable changed
     * @param arg object
     */
    @Override
    public void update(Observable o, Object arg) {
        setText(formatDay(model.getJulianDay(), model.getDay(), model.getMonth(), model.getYear()));
    }
}
