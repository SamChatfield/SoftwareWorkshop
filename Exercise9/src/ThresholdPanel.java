import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by Sam on 26/11/2015.
 */
public class ThresholdPanel extends JPanel implements Observer {

    private JSlider slider;
    private SpatialModel model;

    public ThresholdPanel(SpatialModel model) {
        super();
        this.model = model;

        JLabel label = new JLabel("Threshold:");
        slider = new JSlider(0, 100, (int) (model.getThreshold() * 100));
        slider.addChangeListener(e -> model.setThreshold(0.01 * slider.getValue()));

        slider.setPaintTicks(true);
        slider.setMajorTickSpacing(10);
        slider.setMinorTickSpacing(1);

        slider.setPaintLabels(true);
        slider.setLabelTable(slider.createStandardLabels(10));

        setLayout(new BorderLayout());
        add(label, BorderLayout.WEST);
        add(slider, BorderLayout.CENTER);
    }

    @Override
    public void update(Observable o, Object arg) {
        slider.setValue((int) (model.getThreshold() * 100));
    }

}
