package com.samchatfield.week9;

import javax.swing.*;

/**
 * Created by Sam on 24/11/2015.
 */
public class SunflowerGUI {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Day of Week Calculator");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Sunflower sunflower = new Sunflower(800, 2.4);
        SunflowerComponent sunflowerComponent = new SunflowerComponent(sunflower, 0, (int) (Math.PI * 100), 50);

        frame.add(sunflowerComponent);
        frame.setVisible(true);
    }

}
