package com.samchatfield.exercise8;

import javax.swing.JSlider;
import javax.swing.JPanel;

/**
 * Created by Sam on 18/11/2015.
 */
public class EasterComponent extends JPanel {

    public EasterComponent(Easter easter, int min, int max, int initial) {
        super();

        EasterModel em = new EasterModel(easter);
        EasterView ev = new EasterView(em);
        em.addObserver(ev);

        JSlider slider = new JSlider(min, max, initial);
        slider.setPaintTicks(true);
        slider.setMajorTickSpacing((max - min) / 5);
        slider.setPaintLabels(true);
        slider.setLabelTable(slider.createStandardLabels(slider.getMajorTickSpacing()));

        SliderListener listener = new SliderListener(em, slider);
        slider.addChangeListener(listener);

        add(slider);
        add(ev);
    }

}
