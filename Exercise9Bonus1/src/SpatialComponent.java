import javax.swing.*;
import java.awt.*;

/**
 * Component to hold all of the views i.e. the network, sliders & labels and buttons
 * Created by Sam on 26/11/2015.
 */
public class SpatialComponent extends JPanel {

    /**
     * Create new component and add all the parts using BorderLayout and add the observers of the model
     *
     * @param sn
     */
    public SpatialComponent(SpatialNetwork sn) {
        super();

        SpatialModel model = new SpatialModel(sn);
        SpatialView view = new SpatialView(model);
        ThresholdPanel thresholdPanel = new ThresholdPanel(model);
        NumberPanel numberPanel = new NumberPanel(model);
        ButtonPanel buttonPanel = new ButtonPanel(model);

        model.addObserver(view);
        model.addObserver(thresholdPanel);
        model.addObserver(numberPanel);

        setLayout(new BorderLayout());
        add(numberPanel, BorderLayout.NORTH);
        add(thresholdPanel, BorderLayout.SOUTH);
        add(buttonPanel, BorderLayout.EAST);
        add(view, BorderLayout.CENTER);
    }

}