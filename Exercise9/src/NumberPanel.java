import javax.swing.*;
import java.awt.*;

/**
 * Created by Sam on 29/11/2015.
 */
public class NumberPanel extends JPanel {

    public NumberPanel(SpatialModel model, SpatialView view) {
        super();

        JLabel label = new JLabel("Number of Nodes:");
        JSlider slider = new JSlider(0, 200, model.getNumberPoints());
        slider.addChangeListener(e -> model.setNumberPoints(slider.getValue()));

        slider.setPaintTicks(true);
        slider.setMajorTickSpacing(50);
        slider.setMinorTickSpacing(10);

        slider.setPaintLabels(true);
        slider.setLabelTable(slider.createStandardLabels(50));

        setLayout(new BorderLayout());
        add(label, BorderLayout.WEST);
        add(slider, BorderLayout.CENTER);
    }
}
