import java.awt.geom.Ellipse2D;

/**
 * Subclass of Ellipse2D.Double used specifically for perfect circles
 * Created by Sam on 24/11/2015.
 */
public class Spot extends Ellipse2D.Double {

    /**
     * Create new circle with given x and y coord and given radius
     *
     * @param x x coord
     * @param y y coord
     * @param r radius
     */
    public Spot(double x, double y, double r) {
        super(x - r, y - r, 2 * r, 2 * r);
    }

}
