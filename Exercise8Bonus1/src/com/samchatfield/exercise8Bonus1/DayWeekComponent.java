package com.samchatfield.exercise8Bonus1;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Sam on 18/11/2015.
 */
public class DayWeekComponent extends JPanel {

    public DayWeekComponent(DayWeek dayWeek) {
        super();

        DayWeekModel model = new DayWeekModel(dayWeek);
        DayWeekView view = new DayWeekView(model);
        DaySlider daySlider = new DaySlider(model);
        model.addObserver(view);
        model.addObserver(daySlider);

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

        System.out.println(yearSlider.getPreferredSize().toString());

        SliderListener listener = new SliderListener(model, daySlider, monthSlider, yearSlider);
        daySlider.addChangeListener(listener);
        monthSlider.addChangeListener(listener);
        yearSlider.addChangeListener(listener);

        add(new JLabel("Day:"));
        add(daySlider);
        add(new JLabel("Month:"));
        add(monthSlider);
        add(new JLabel("Year:"));
        add(yearSlider);
        add(view);
    }

}
