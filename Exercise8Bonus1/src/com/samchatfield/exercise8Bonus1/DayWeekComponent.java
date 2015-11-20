package com.samchatfield.exercise8Bonus1;

import javax.swing.*;
import java.awt.*;

/**
 * Initialise the components that will appear on the frame, link the model and the view, add listeners to the sliders, this is the controller in the MVC design
 *
 * Created by Sam on 18/11/2015.
 */
public class DayWeekComponent extends JPanel {

    /**
     * Create component acting as controller in the MVC design, link model and view together
     *
     * @param dayWeek DayWeek logic object
     */
    public DayWeekComponent(DayWeek dayWeek) {
        super();

        DayWeekModel model = new DayWeekModel(dayWeek);
        DayWeekView view = new DayWeekView(model);
        JulianView julianView = new JulianView(model);
        DaySliderView daySliderView = new DaySliderView(model);

        model.addObserver(view);
        model.addObserver(julianView);
        model.addObserver(daySliderView);

        JSlider monthSlider = new JSlider(1, 12, model.getMonth());
        monthSlider.setPaintTicks(true);
        monthSlider.setMajorTickSpacing(2);
        monthSlider.setMinorTickSpacing(1);
        monthSlider.setPaintLabels(true);
        monthSlider.setLabelTable(monthSlider.createStandardLabels(2));

        JSlider yearSlider = new JSlider(0, 3000, model.getYear());
        yearSlider.setPreferredSize(new Dimension((int) (2 * monthSlider.getPreferredSize().getWidth()), (int) monthSlider.getPreferredSize().getHeight()));
        yearSlider.setPaintTicks(true);
        yearSlider.setMajorTickSpacing((500));
        yearSlider.setMinorTickSpacing(100);
        yearSlider.setPaintLabels(true);
        yearSlider.setLabelTable(yearSlider.createStandardLabels(1000));

        SliderListener listener = new SliderListener(model, daySliderView, monthSlider, yearSlider);
        daySliderView.addChangeListener(listener);
        monthSlider.addChangeListener(listener);
        yearSlider.addChangeListener(listener);

        add(new JLabel("Day:"));
        add(daySliderView);
        add(new JLabel("Month:"));
        add(monthSlider);
        add(new JLabel("Year:"));
        add(yearSlider);
        add(view);
        add(julianView);
    }

}
