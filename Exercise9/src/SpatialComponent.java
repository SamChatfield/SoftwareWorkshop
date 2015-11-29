import javax.swing.*;
import java.awt.*;

/**
 * Created by Sam on 26/11/2015.
 */
public class SpatialComponent extends JPanel {

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