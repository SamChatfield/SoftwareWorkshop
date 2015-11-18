package com.samchatfield.exercise8;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * The listener for the input slider for the year for which we will calculate the date of Easter
 *
 * Created by Sam on 18/11/2015.
 */
public class SliderListener implements ChangeListener {

    private EasterModel em;
    private JSlider slider;

    /**
     * Create a new SliderListener given the model and a slider to listen to
     *
     * @param em     EasterModel to use
     * @param slider the slider to listen to
     */
    public SliderListener(EasterModel em, JSlider slider) {
        this.em = em;
        this.slider = slider;
    }

    /**
     * Overridden method from ChangeListener called when the state of the slider is changed by java (i.e. the slider is moved) which will then call setYear on the model with the new year given by the slider's position in order to recalculate the date of Easter
     * @param e the ChangeEvent which occurred
     */
    public void stateChanged(ChangeEvent e) {
        em.setYear(slider.getValue());
    }
}
