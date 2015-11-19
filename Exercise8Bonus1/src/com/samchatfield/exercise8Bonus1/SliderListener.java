package com.samchatfield.exercise8Bonus1;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * Listen to given slider components and take action when their values are changed
 *
 * Created by Sam on 18/11/2015.
 */
public class SliderListener implements ChangeListener {

    private DayWeekModel model;
    private JSlider daySlider, monthSlider, yearSlider;

    /**
     * Create new listener on given model and sliders
     *
     * @param model       model
     * @param daySlider   slider for day value
     * @param monthSlider slider for month value
     * @param yearSlider  slider for year value
     */
    public SliderListener(DayWeekModel model, JSlider daySlider, JSlider monthSlider, JSlider yearSlider) {
        this.model = model;
        this.daySlider = daySlider;
        this.monthSlider = monthSlider;
        this.yearSlider = yearSlider;
    }

    /**
     * Take action when slider values changed
     * @param e the event that occurred on the slider
     */
    @Override
    public void stateChanged(ChangeEvent e) {
        if (e.getSource() == daySlider) {
            model.setDay(daySlider.getValue());
        } else if (e.getSource() == monthSlider) {
            model.setMonth(monthSlider.getValue());
        } else {
            model.setYear(yearSlider.getValue());
        }
    }
}
