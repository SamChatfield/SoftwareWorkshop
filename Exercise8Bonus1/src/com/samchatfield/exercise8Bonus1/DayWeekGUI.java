package com.samchatfield.exercise8Bonus1;

import javax.swing.*;

/**
 * Created by Sam on 18/11/2015.
 */
public class DayWeekGUI {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Day of Week Calculator");
        frame.setSize(500, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        DayWeek dayWeek = new DayWeek(18, 11, 2015);
        DayWeekComponent dayWeekComponent = new DayWeekComponent(dayWeek);

        frame.add(dayWeekComponent);
        frame.setVisible(true);
    }

}
