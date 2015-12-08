import javax.swing.*;
import java.awt.*;

/**
 * Combines the ControlPanel and the BoardView
 */
public class JuliaComponent extends JPanel {

    /**
     * Combine the views
     *
     * @param j Julia object
     */
    public JuliaComponent(JuliaSet j) {
        super();

        // make model
        JuliaModel model = new JuliaModel(j);

        // make views
        JuliaView set = new JuliaView(model);
        ControlPanel controls = new ControlPanel(model);

        // make model observe view
        model.addObserver(set);

        setLayout(new BorderLayout());

        add(set, BorderLayout.CENTER);
        add(controls, BorderLayout.SOUTH);
    }
}
