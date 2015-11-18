package com.samchatfield.exercise8Bonus1;

import javax.swing.*;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by Sam on 18/11/2015.
 */
public class DayWeekView extends JLabel implements Observer {

    private DayWeekModel model;

    public DayWeekView(DayWeekModel model) {
        this.model = model;
        setText(formatDate(model.getDay(), model.getMonth(), model.getYear(), model.getDayOfWeek()));
    }

    public String formatDate(int day, int month, int year, String dayOfWeek) {
        return day + "/" + month + "/" + year + " falls on a " + dayOfWeek;
    }

    @Override
    public void update(Observable o, Object arg) {
        setText(formatDate(model.getDay(), model.getMonth(), model.getYear(), model.getDayOfWeek()));
    }

}
