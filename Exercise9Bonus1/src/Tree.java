import java.awt.geom.Point2D;

/**
 * Created by Sam on 30/11/2015.
 */
public class Tree extends Point2D.Double {

    private boolean infected;

    public Tree(double x, double y, boolean infected) {
        super(x, y);
        this.infected = infected;
    }

    public boolean isInfected() {
        return infected;
    }

    public void setInfected(boolean infected) {
        this.infected = infected;
    }

}
