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
//    private Hashtable<Point2D.Double[], Double> distances;

    public SpatialNetwork(int numberPoints, double threshold) {
        this.numberPoints = numberPoints;
        this.threshold = threshold;
        points = new ArrayList<>();
        addPoints(numberPoints);
    }

    public void addPoints(int n) {
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            points.add(new Point2D.Double(rand.nextDouble(), rand.nextDouble()));
        }
    }

    public void removePoints(int n) {
        for (int i = 0; i < n; i++) {
            points.remove(i);
        }
    }

    public void updatePoints() {
        if (points.size() > numberPoints)
            removePoints(points.size() - numberPoints);
        else if (points.size() < numberPoints) {
            addPoints(numberPoints - points.size());
        }
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
        updatePoints();
    }

    public void setThreshold(int threshold) {
        this.threshold = threshold;
    }

    // TODO REMOVE AFTER TESTING
    public String toString() {
        String acc = "Network of " + points.size() + " points\n";
        for (Point2D.Double point : points) {
            acc = acc + "[" + point.getX() + ", " + point.getY() + "]\n";
        }
        return acc;
    }

}
