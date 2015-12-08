import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

public class JuliaView extends JPanel implements Observer {
    private JuliaModel model;

    public JuliaView(JuliaModel model) {
        super();
        this.model = model;
    }

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        int frameHeight = getHeight();
        int frameWidth = getWidth();

        g2.clearRect(0, 0, frameWidth, frameHeight);
        double diameter = Math.min(frameHeight, frameWidth);

        // set colour to black
        g2.setColor(Color.BLACK);

        // iterate through pixels
        for (int i = 0; i < diameter; i++) {
            for (int j = 0; j < diameter; j++) {
                if (model.isInSet((i / (diameter / 4)) - 2, (j / (diameter / 4)) - 2)) {
                    g2.draw(new Rectangle.Double(i, j, 1, 1));
                }
            }
        }
    }

    public void update(Observable obs, Object obj) {
        repaint();
    }
}
