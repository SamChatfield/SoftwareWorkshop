import javax.swing.*;

public class ControlPanel extends JPanel {
    private JuliaModel model;
    private JSlider aSlider;
    private JSlider bSlider;

    /**
     * Contains all the buttons that will be on screen
     *
     * @param model MineModel object
     */
    public ControlPanel(JuliaModel model, int min, int max, int initial) {
        super();
        this.model = model;
        aSlider = new JSlider(min, max, initial);
        aSlider.setPaintTicks(true);
        aSlider.setMajorTickSpacing((max - min) / 5);
        aSlider.setPaintLabels(true);
        aSlider.setLabelTable(aSlider.createStandardLabels((max - min) / 5));
        aSlider.addChangeListener(e -> model.setA(aSlider.getValue() / ((max - min) / 2) - 1));

        bSlider = new JSlider(min, max, initial);
        bSlider.setPaintTicks(true);
        bSlider.setMajorTickSpacing((max - min) / 5);
        bSlider.setPaintLabels(true);
        bSlider.setLabelTable(bSlider.createStandardLabels((max - min) / 5));
        bSlider.addChangeListener(e -> model.setB(bSlider.getValue() / ((max - min) / 2) - 1));


        add(aSlider);
        add(bSlider);
    }
}
