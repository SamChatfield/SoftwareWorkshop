package com.samchatfield.week9;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Sam on 24/11/2015.
 */
public class SunflowerComponent extends JPanel {

    public SunflowerComponent(Sunflower sunflower, int min, int max, int value) {
        super();

        SunflowerModel model = new SunflowerModel(sunflower);
        SunflowerView view = new SunflowerView(model);

        JButton reset = new JButton("Reset");
        reset.addActionListener(e -> model.setAngle(0.01 * value));
//        reset.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                model.setAngle(0.01 * value);
//            }
//        });

        SliderControl slider = new SliderControl(model, min, max, value);
        slider.addChangeListener(e -> model.setAngle(0.01 * slider.getValue()));
//        slider.addChangeListener(new ChangeListener() {
//            @Override
//            public void stateChanged(ChangeEvent e) {
//                model.setAngle(slider.getValue() * 0.01);
//            }
//        });

        model.addObserver(view);
        model.addObserver(slider);

        setLayout(new BorderLayout());
        add(view, BorderLayout.CENTER);
        add(slider, BorderLayout.SOUTH);
        add(reset, BorderLayout.EAST);
    }

}
