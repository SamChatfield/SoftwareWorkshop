import javax.swing.*;
import java.awt.*;

/**
 * Created by Sam on 26/11/2015.
 */
public class ThresholdPanel extends JPanel {

    public ThresholdPanel(SpatialModel model, SpatialView view) {
        super();

        JLabel label = new JLabel("Threshold:");
        JSlider slider = new JSlider(0, 100, (int) (model.getThreshold() * 100));
        slider.addChangeListener(e -> model.setThreshold(0.01 * slider.getValue()));

        slider.setPaintTicks(true);
        slider.setMajorTickSpacing(10);
        slider.setMinorTickSpacing(1);

        slider.setPaintLabels(true);
        slider.setLabelTable(slider.createStandardLabels(10));

        model.addObserver(view);

        setLayout(new BorderLayout());
        add(label, BorderLayout.WEST);
        add(slider, BorderLayout.CENTER);
    }

}
