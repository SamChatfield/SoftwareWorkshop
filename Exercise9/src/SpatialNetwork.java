import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Sam on 26/11/2015.
 */
public class SpatialNetwork {

    private int numberPoints;
    private double threshold;
    private ArrayList<Point2D.Double> points;

    public SpatialNetwork(int numberPoints, double threshold) {
        this.numberPoints = numberPoints;
        this.threshold = threshold;
        points = new ArrayList<>();
        initPoints();
    }

    public void initPoints() {
        Random rand = new Random();
        points.clear();
        for (int i = 0; i < 200; i++) {
            points.add(new Point2D.Double(rand.nextDouble(), rand.nextDouble()));
        }
    }

    public boolean areConnected(double ox, double oy, double dx, double dy) {
        return Math.sqrt(Math.pow(dx - ox, 2) + Math.pow(dy - oy, 2)) < threshold;
    }

    public int getNumberPoints() {
        return numberPoints;
    }

    public double getThreshold() {
        return threshold;
    }

    public ArrayList<Point2D.Double> getPoints() {
        return points;
    }

    public void setNumberPoints(int numberPoints) {
        this.numberPoints = numberPoints;
    }

    public void setThreshold(double threshold) {
        this.threshold = threshold;
    }

}
