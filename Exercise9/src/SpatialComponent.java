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
        ThresholdPanel thresholdPanel = new ThresholdPanel(model, view);

        setLayout(new BorderLayout());
        add(thresholdPanel, BorderLayout.SOUTH);
        add(view, BorderLayout.CENTER);
    }

}