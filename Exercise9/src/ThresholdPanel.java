import javax.swing.*;
import java.awt.*;

/**
 * Created by Sam on 26/11/2015.
 */
public class ThresholdPanel extends JPanel {

    public ThresholdPanel(SpatialNetwork sn) {
        super();

        SpatialModel model = new SpatialModel(sn);
        SpatialView view = new SpatialView(model);

        JLabel label = new JLabel("Threshold:");
        JSlider slider = new JSlider(0, 100, (int) (model.getThreshold() * 100));
        slider.addChangeListener(e -> model.setThreshold(slider.getValue() / 100));

        model.addObserver(view);

        setLayout(new BorderLayout());
        add(label, BorderLayout.WEST);
        add(slider, BorderLayout.CENTER);
    }

}
