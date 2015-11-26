import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Observable;

/**
 * Created by Sam on 26/11/2015.
 */
public class SpatialModel extends Observable {

    private SpatialNetwork sn;

    public SpatialModel(SpatialNetwork sn) {
        super();
        this.sn = sn;
    }

    public int getNumberPoints() {
        return sn.getNumberPoints();
    }

    public double getThreshold() {
        return sn.getThreshold();
    }

    public ArrayList<Point2D.Double> getPoints() {
        return sn.getPoints();
    }

    public void setNumberPoints(int numberPoints) {
        sn.setNumberPoints(numberPoints);
        setChanged();
        notifyObservers();
    }

    public void setThreshold(int threshold) {
        sn.setThreshold(threshold);
        setChanged();
        notifyObservers();
    }

}
