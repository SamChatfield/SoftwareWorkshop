package com.samchatfield.exercise8Bonus1;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * Created by Sam on 18/11/2015.
 */
public class SliderListener implements ChangeListener {

    private DayWeekModel model;
    private JSlider daySlider, monthSlider, yearSlider;

    public SliderListener(DayWeekModel model, JSlider daySlider, JSlider monthSlider, JSlider yearSlider) {
        this.model = model;
        this.daySlider = daySlider;
        this.monthSlider = monthSlider;
        this.yearSlider = yearSlider;
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        model.setDay(daySlider.getValue());
        model.setMonth(monthSlider.getValue());
        model.setYear(yearSlider.getValue());
    }
}
