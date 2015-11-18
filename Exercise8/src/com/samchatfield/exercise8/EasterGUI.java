package com.samchatfield.exercise8;

import javax.swing.JFrame;

/**
 * Created by Sam on 18/11/2015.
 */
public class EasterGUI {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Easter Calculator");
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        Easter easter = new Easter(1961);
        EasterComponent ec = new EasterComponent(easter, 1800, 2200, easter.getYear());
        frame.add(ec);
        frame.setVisible(true);
    }

}
