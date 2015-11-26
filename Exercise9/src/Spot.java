import java.awt.geom.Ellipse2D;

/**
 * Created by Sam on 24/11/2015.
 */
public class Spot extends Ellipse2D.Double {

    public Spot(double x, double y, double r) {
        super(x - r, y - r, 2 * r, 2 * r);
    }

}
