import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by Sam on 29/11/2015.
 */
public class NumberPanel extends JPanel implements Observer {

    private JSlider slider;
    private SpatialModel model;

    public NumberPanel(SpatialModel model) {
        super();
        this.model = model;

        JLabel label = new JLabel("Number of Nodes:");
        slider = new JSlider(0, 200, model.getNumberPoints());
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

    @Override
    public void update(Observable o, Object arg) {
        slider.setValue(model.getNumberPoints());
    }
}
