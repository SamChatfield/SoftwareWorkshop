import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Random;

/**
 * Class containing the logic of the network
 * Created by Sam on 26/11/2015.
 */
public class SpatialNetwork {

    private int numberPoints;
    private double threshold;
    private ArrayList<Point2D.Double> points;

    /**
     * Create new network with the given number of points and given threshold
     *
     * @param numberPoints number of nodes in the network
     * @param threshold    threshold under which points are said to be connected
     */
    public SpatialNetwork(int numberPoints, double threshold) {
        this.numberPoints = numberPoints;
        this.threshold = threshold;
        points = new ArrayList<>();
        initPoints();
    }

    /**
     * Initialise the node positions
     */
    public void initPoints() {
        Random rand = new Random();
        points.clear();
        for (int i = 0; i < 200; i++) {
            points.add(new Point2D.Double(rand.nextDouble(), rand.nextDouble()));
        }
    }

    /**
     * Check if two points are closer together than the threshold and thus connected
     * @param ox origin x coord
     * @param oy origin y coord
     * @param dx destination x coord
     * @param dy destination y coord
     * @return true if connected false if not
     */
    public boolean areConnected(double ox, double oy, double dx, double dy) {
        return Math.sqrt(Math.pow(dx - ox, 2) + Math.pow(dy - oy, 2)) < threshold;
    }

    /**
     * Return number of nodes
     * @return number of nodes
     */
    public int getNumberPoints() {
        return numberPoints;
    }

    /**
     * Return current threshold
     * @return threshold
     */
    public double getThreshold() {
        return threshold;
    }

    /**
     * Return list of nodes
     * @return list of nodes
     */
    public ArrayList<Point2D.Double> getPoints() {
        return points;
    }

    /**
     * Set the number of nodes
     * @param numberPoints new number of nodes
     */
    public void setNumberPoints(int numberPoints) {
        this.numberPoints = numberPoints;
    }

    /**
     * Set the threshold
     * @param threshold new threshold
     */
    public void setThreshold(double threshold) {
        this.threshold = threshold;
    }

}
