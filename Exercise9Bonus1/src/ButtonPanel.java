import javax.swing.*;
import java.awt.*;

/**
 * Panel to contain the reset and exit buttons
 * Created by Sam on 29/11/2015.
 */
public class ButtonPanel extends JPanel {

    /**
     * Create the panel to hold the buttons using GridLayout to lay them out and lambda expressions to create the listeners
     *
     * @param model
     */
    public ButtonPanel(SpatialModel model) {
        super();

        JButton reset = new JButton("Reset");
        JButton simDay = new JButton("Day+1");
        JButton exit = new JButton("Exit");

        reset.addActionListener(e -> {
            model.setNumberTrees(100);
            model.setThreshold(0.2);
            model.initTrees();
        });
        simDay.addActionListener(e -> model.simulateDay());
        exit.addActionListener(e -> System.exit(0));

        setLayout(new GridLayout(10, 1));
        add(reset);
        add(simDay);
        add(exit);
    }

}
