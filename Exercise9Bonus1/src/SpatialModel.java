import java.util.ArrayList;
import java.util.Observable;

/**
 * Model encapsulating the program logic in SpatialNetwork
 * Created by Sam on 26/11/2015.
 */
public class SpatialModel extends Observable {

    private SpatialNetwork sn;

    /**
     * Create new model using given SpatialNetwork logic object
     *
     * @param sn spatial network
     */
    public SpatialModel(SpatialNetwork sn) {
        super();
        this.sn = sn;
    }

    /**
     * Call SpatialNetwork.initTrees for possibility of reset button regenerating the nodes
     */
    public void initTrees() {
        sn.initTrees();
    }

    public void simulateDay() {
        sn.simulateDay();
    }

    /**
     * Return number of points
     *
     * @return number of points
     */
    public int getNumberTrees() {
        return sn.getNumberTrees();
    }

    /**
     * Return threshold
     *
     * @return threshold
     */
    public double getThreshold() {
        return sn.getThreshold();
    }

    /**
     * Return list of points
     *
     * @return
     */
    public ArrayList<Tree> getTrees() {
        return sn.getTrees();
    }

    /**
     * Check if two points are connected given their x and y coords
     *
     * @param ox origin x coord
     * @param oy origin y coord
     * @param dx destination x coord
     * @param dy destination y coord
     * @return true if connected false if not
     */
    public boolean areConnected(double ox, double oy, double dx, double dy) {
        return sn.areConnected(ox, oy, dx, dy);
    }

    /**
     * Change number of points and notifyObservers
     *
     * @param numberTrees new number of points
     */
    public void setNumberTrees(int numberTrees) {
        sn.setNumberTrees(numberTrees);
        setChanged();
        notifyObservers();
    }

    /**
     * Change threshold and notifyObservers
     *
     * @param threshold new threshold
     */
    public void setThreshold(double threshold) {
        sn.setThreshold(threshold);
        setChanged();
        notifyObservers();
    }

}
