import java.awt.geom.Point2D;

/**
 * Created by Sam on 30/11/2015.
 */
public class Tree extends Point2D.Double {

    private boolean infected, showing;

    public Tree(double x, double y, boolean infected) {
        super(x, y);
        this.infected = infected;
    }

    public boolean isInfected() {
        return infected;
    }

    public boolean isShowing() {
        return showing;
    }

    public void setInfected(boolean infected) {
        this.infected = infected;
    }

    public void setShowing(boolean showing) {
        this.showing = showing;
    }

}