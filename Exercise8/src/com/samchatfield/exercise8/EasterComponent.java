package com.samchatfield.exercise8;

import javax.swing.JSlider;
import javax.swing.JPanel;

/**
 * Class that initialises what will be shown in the program's frame to be interacted with to affect the program, this is the controller in the MVC design
 *
 * Created by Sam on 18/11/2015.
 */
public class EasterComponent extends JPanel {

    /**
     * Create a component that will act as the controller for the application
     *
     * @param easter  the easter object to use
     * @param min     the minimum value of the slider
     * @param max     the maximum value of the slider
     * @param initial the initial value of the slider
     */
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
