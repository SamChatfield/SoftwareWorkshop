package com.samchatfield.exercise8Bonus1;

import javax.swing.*;
import java.util.Observable;
import java.util.Observer;

/**
 * Another part of the view portion of the MVC design, this time the slider representing the day value which must dynamically change depending on which month it is
 *
 * Created by Sam on 18/11/2015.
 */
public class DaySliderView extends JSlider implements Observer {

    private DayWeekModel model;

    /**
     * Create new view observing the given model and initialise the JSlider using getDayMax to use correct maxiumum value based on current month
     *
     * @param model model observable
     */
    public DaySliderView(DayWeekModel model) {
        this.model = model;
        setMinimum(1);
        setMaximum(model.getDayMax());
        setValue(model.getDay());
        setPaintTicks(true);
        setMajorTickSpacing(4);
        setMinorTickSpacing(1);
        setPaintLabels(true);
        setLabelTable(createStandardLabels(4));
    }

    /**
     * Called when notifyObservers is called from the model observable
     * @param o observable modified
     * @param arg object
     */
    @Override
    public void update(Observable o, Object arg) {
        setMaximum(model.getDayMax());
        setMajorTickSpacing(4);
        setMinorTickSpacing(1);
        setLabelTable(createStandardLabels(4));
    }

}
