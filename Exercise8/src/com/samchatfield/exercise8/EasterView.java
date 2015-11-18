package com.samchatfield.exercise8;

import javax.swing.*;
import java.time.Month;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by Sam on 18/11/2015.
 */
public class EasterView extends JLabel implements Observer {

    private EasterModel em;

    public EasterView(EasterModel em) {
        this.em = em;
        setText(formatDate(em.getDay(), em.getMonth(), em.getYear()));
    }

    public String formatDate(int day, int month, int year) {
        return "In the year " + year + " Easter was on " + day + " " + month;
    }

    public void update(Observable o, Object arg) {
        setText(formatDate(em.getDay(), em.getMonth(), em.getYear()));
    }

}
