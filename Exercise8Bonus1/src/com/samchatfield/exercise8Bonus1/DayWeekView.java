package com.samchatfield.exercise8Bonus1;

import javax.swing.*;
import java.util.Observable;
import java.util.Observer;

/**
 * View part of the MVC application design which displays the resulting output from the user's input
 *
 * Created by Sam on 18/11/2015.
 */
public class DayWeekView extends JLabel implements Observer {

    private DayWeekModel model;

    /**
     * Create new view linked to given model and set the label value to the formatted form of the date
     *
     * @param model model
     */
    public DayWeekView(DayWeekModel model) {
        this.model = model;
        setText(formatDate(model.getDay(), model.getMonth(), model.getYear(), model.getDayOfWeek()));
    }

    /**
     * Return the formatted output to be shown on the label
     * @param day day
     * @param month month
     * @param year year
     * @param dayOfWeek day of the week
     * @return string to output to label
     */
    public String formatDate(int day, int month, int year, String dayOfWeek) {
        return day + "/" + month + "/" + year + " falls on a " + dayOfWeek;
    }

    /**
     * Called when notifyObservers is called from observables of this view
     * @param o observable changed
     * @param arg object
     */
    @Override
    public void update(Observable o, Object arg) {
        setText(formatDate(model.getDay(), model.getMonth(), model.getYear(), model.getDayOfWeek()));
    }

}
