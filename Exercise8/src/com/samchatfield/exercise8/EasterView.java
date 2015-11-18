package com.samchatfield.exercise8;

import javax.swing.*;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Observable;
import java.util.Observer;

/**
 * The view part of the MVC application design for this program which displays to the user the output resulting from their input
 *
 * Created by Sam on 18/11/2015.
 */
public class EasterView extends JLabel implements Observer {

    private EasterModel em;

    /**
     * Create a new view with the given EasterModel object
     *
     * @param em the EasterModel object
     */
    public EasterView(EasterModel em) {
        this.em = em;
        setText(formatDate(em.getDay(), em.getMonth(), em.getYear()));
    }

    /**
     * A method to return the formatted date from the integer values returned from the algorithm
     * @param day day
     * @param month month
     * @param year year
     * @return a string representing the date in a nicely formatted manner
     */
    public String formatDate(int day, int month, int year) {
        return "In the year " + year
                + ", Easter was on " + day +
                " " + Month.of(month).getDisplayName(TextStyle.FULL, Locale.ENGLISH);
    }

    /**
     * An overridden method from the Observer interface which will set the text of the label that this view represents when notifyObservers is called from the observables of this class
     * @param o the observable for this observer
     * @param arg the object
     */
    public void update(Observable o, Object arg) {
        setText(formatDate(em.getDay(), em.getMonth(), em.getYear()));
    }

}
