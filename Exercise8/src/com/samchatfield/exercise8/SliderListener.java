package com.samchatfield.exercise8;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * Created by Sam on 18/11/2015.
 */
public class SliderListener implements ChangeListener {

    private EasterModel em;
    private JSlider slider;

    public SliderListener(EasterModel em, JSlider slider) {
        this.em = em;
        this.slider = slider;
    }

    public void stateChanged(ChangeEvent e) {
        int sliderValue = slider.getValue();
        em.setYear(sliderValue);
    }
}
