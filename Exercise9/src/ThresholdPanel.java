import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

/**
 * Panel containing label and slider which is both a controller and a view in the MVC design pattern
 * Created by Sam on 26/11/2015.
 */
public class ThresholdPanel extends JPanel implements Observer {

    private JSlider slider;
    private SpatialModel model;

    /**
     * Create new panel using given model using a lambda expression for the slider's listener and BorderLayout to lay the label and slider out
     *
     * @param model model
     */
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

    /**
     * Called when observable calls notifyObservers to keep slider value up to date with current threshold
     * @param o Observable
     * @param arg Object
     */
    @Override
    public void update(Observable o, Object arg) {
        slider.setValue((int) (model.getThreshold() * 100));
    }

}
