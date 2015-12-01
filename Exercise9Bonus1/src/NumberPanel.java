import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

/**
 * Panel to hold the label and slider associated with the number of nodes in the network which is both a controller and a view
 * Created by Sam on 29/11/2015.
 */
public class NumberPanel extends JPanel implements Observer {

    private JSlider slider;
    private SpatialModel model;

    /**
     * Create the panel and add the label and slider using BorderLayout and a lambda expression to add the listener to the slider
     *
     * @param model
     */
    public NumberPanel(SpatialModel model) {
        super();
        this.model = model;

        JLabel label = new JLabel("Number of Nodes:");
        slider = new JSlider(0, 200, model.getNumberTrees());
        slider.addChangeListener(e -> model.setNumberTrees(slider.getValue()));

        slider.setPaintTicks(true);
        slider.setMajorTickSpacing(50);
        slider.setMinorTickSpacing(10);

        slider.setPaintLabels(true);
        slider.setLabelTable(slider.createStandardLabels(50));

        setLayout(new BorderLayout());
        add(label, BorderLayout.WEST);
        add(slider, BorderLayout.CENTER);
    }

    /**
     * Update method to be called when this class's observable calls notifyObservers i.e. when the reset button is pressed to reset the slider's value to match the new number of points
     *
     * @param o   Observable
     * @param arg Object
     */
    @Override
    public void update(Observable o, Object arg) {
        slider.setValue(model.getNumberTrees());
    }
}
