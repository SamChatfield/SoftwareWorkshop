import javax.swing.*;

/**
 * Make the frame
 */
public class JuliaGUI {
    public static void main(String[] args) {
        double a = 0.31;
        double b = 0.55;
        int maxIt = 500;

        JuliaSet j = new JuliaSet(a, b, maxIt);
        JuliaComponent comp = new JuliaComponent(j);

        JFrame frame = new JFrame("Julia Set Viewer");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(comp);

        frame.setVisible(true);
    }
}
