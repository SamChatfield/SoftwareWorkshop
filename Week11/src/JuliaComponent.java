import javax.swing.*;
import java.awt.*;

/**
 * Combines the ControlPanel and the BoardView
 */
public class JuliaComponent extends JPanel {

    private int min;
    private int max;
    private int initial;

    /**
     * Combine the views
     *
     * @param j Julia object
     */
    public JuliaComponent(JuliaSet j, int min, int max, int initial) {
        super();

        // make model
        JuliaModel model = new JuliaModel(j);

        // make views
        JuliaView set = new JuliaView(model);
        ControlPanel controls = new ControlPanel(model, min, max, initial);

        // make model observe view
        model.addObserver(set);

        setLayout(new BorderLayout());

        add(set, BorderLayout.CENTER);
        add(controls, BorderLayout.SOUTH);
    }
}
