import javax.swing.*;

public class ControlPanel extends JPanel {
    private JSlider aSlider;
    private JSlider bSlider;

    /**
     * Contains all the buttons that will be on screen
     *
     * @param model MineModel object
     */
    public ControlPanel(JuliaModel model) {
        super();
        aSlider = new JSlider(-100, 100, (int) (model.getA() * 100));
        aSlider.setPaintTicks(true);
        aSlider.setMajorTickSpacing(50);
        aSlider.setPaintLabels(true);
        aSlider.setLabelTable(aSlider.createStandardLabels(50));
        aSlider.addChangeListener(e -> model.setA((double) aSlider.getValue() / 100));

        bSlider = new JSlider(-100, 100, (int) (model.getB() * 100));
        bSlider.setPaintTicks(true);
        bSlider.setMajorTickSpacing(50);
        bSlider.setPaintLabels(true);
        bSlider.setLabelTable(bSlider.createStandardLabels(50));
        bSlider.addChangeListener(e -> model.setB((double) bSlider.getValue() / 100));

        add(aSlider);
        add(bSlider);
    }
}
