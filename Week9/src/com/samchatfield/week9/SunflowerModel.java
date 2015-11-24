package com.samchatfield.week9;

import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Observable;

/**
 * Created by Sam on 24/11/2015.
 */
public class SunflowerModel extends Observable {

    private Sunflower sunflower;

    public SunflowerModel(Sunflower sunflower) {
        super();
        this.sunflower = sunflower;
    }

    public ArrayList<Point2D.Double> getSeeds() {
        return sunflower.getSeeds();
    }

    public double getAngle() {
        return sunflower.getAngle();
    }

    public void setAngle(double angle) {
        sunflower.setAngle(angle);
        setChanged();
        notifyObservers();
    }

}
