import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;
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
        for (int i = 0; i < model.getNumberPoints(); i++) {
            double x = model.getPoints().get(i).getX();
            double y = model.getPoints().get(i).getY();
            Spot spot = new Spot(x * netSize, y * netSize, 0.01 * netSize);

            for (int j = 0; j < model.getNumberPoints(); j++) {
                double jx = model.getPoints().get(j).getX();
                double jy = model.getPoints().get(j).getY();
                if (model.areConnected(x, y, jx, jy)) {
                    Line2D.Double line = new Line2D.Double(x * netSize, y * netSize, jx * netSize, jy * netSize);
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