package com.samchatfield.week9;

import javax.swing.*;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by Sam on 24/11/2015.
 */
public class SliderControl extends JSlider implements Observer {

    private SunflowerModel model;

    public SliderControl(SunflowerModel model, int min, int max, int value) {
        super(min, max, value);
        this.model = model;
    }

    @Override
    public void update(Observable o, Object arg) {
        setValue((int) (model.getAngle() * 100));
    }
}
