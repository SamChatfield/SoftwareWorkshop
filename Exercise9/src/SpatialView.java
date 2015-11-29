import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by Sam on 26/11/2015.
 */
public class SpatialView extends JPanel implements Observer {

    private SpatialModel model;

    public SpatialView(SpatialModel model) {
        super();
        this.model = model;
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        int w = getWidth();
        int h = getHeight();

        g2d.clearRect(0, 0, w, h);
        double netSize = Math.min(w, h);
        for (Point2D.Double point : model.getPoints()) {
            double x = point.getX();
            double y = point.getY();
            Spot spot = new Spot(x * netSize, y * netSize, 0.01 * netSize);

            for (Point2D.Double destPoint : model.getPoints()) {
                double dx = destPoint.getX();
                double dy = destPoint.getY();
                if (model.areConnected(point, destPoint)) {
                    Line2D.Double line = new Line2D.Double(x * netSize, y * netSize, dx * netSize, dy * netSize);
                    g2d.setColor(Color.BLACK);
                    g2d.draw(line);
                }
            }
            g2d.setColor(Color.RED);
            g2d.fill(spot);
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        repaint();
    }

}