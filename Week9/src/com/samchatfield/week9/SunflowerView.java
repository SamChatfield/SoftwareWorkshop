package com.samchatfield.week9;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by Sam on 24/11/2015.
 */
public class SunflowerView extends JPanel implements Observer {

    private SunflowerModel model;

    public SunflowerView(SunflowerModel model) {
        super();
        this.model = model;
    }

    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        int width = getWidth();
        int height = getHeight();

        g2d.clearRect(0, 0, width, height);
        double diameter = Math.min(width, height);

        g2d.setColor(Color.ORANGE);
        ArrayList<Point2D.Double> seeds = model.getSeeds();

        for (Point2D.Double seed : seeds) {
            double x = seed.getX();
            double y = seed.getY();
            Spot spot = new Spot(x * diameter, y * diameter, 0.01 * diameter);
            g2d.fill(spot);
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        repaint();
    }
}
