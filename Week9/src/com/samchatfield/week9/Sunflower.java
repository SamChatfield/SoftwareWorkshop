package com.samchatfield.week9;

import java.awt.geom.Point2D;
import java.util.ArrayList;

/**
 * Created by Sam on 24/11/2015.
 */
public class Sunflower {

    private int numberSeeds;
    private double angle;
    private ArrayList<Point2D.Double> seeds;

    public Sunflower(int numberSeeds, double angle) {
        this.numberSeeds = numberSeeds;
        this.angle = angle;
        seeds = new ArrayList<>();
        calculateSeeds();
    }

    public void calculateSeeds() {
        seeds.clear();
        for (int i = 0; i < numberSeeds; i++) {
            double x = 0.5 + Math.sqrt(i) * Math.cos(angle * i) / 60.0;
            double y = 0.5 - Math.sqrt(i) * Math.sin(angle * i) / 60.0;
            seeds.add(new Point2D.Double(x, y));
        }
    }

    public ArrayList<Point2D.Double> getSeeds() {
        return seeds;
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
        calculateSeeds();
    }

}
