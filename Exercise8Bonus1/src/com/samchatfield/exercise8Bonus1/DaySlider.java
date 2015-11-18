package com.samchatfield.exercise8Bonus1;

import javax.swing.*;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by Sam on 18/11/2015.
 */
public class DaySlider extends JSlider implements Observer {

    private DayWeekModel model;

    public DaySlider(DayWeekModel model) {
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

    @Override
    public void update(Observable o, Object arg) {
        setMaximum(model.getDayMax());
        setMajorTickSpacing(4);
        setMinorTickSpacing(1);
        setLabelTable(createStandardLabels(4));
    }

}
