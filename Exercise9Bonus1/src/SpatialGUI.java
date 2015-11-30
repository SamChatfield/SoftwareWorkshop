import javax.swing.*;

/**
 * Class creating the JFrame which contains the rest of the program
 * Created by Sam on 26/11/2015.
 */
public class SpatialGUI {

    /**
     * Create the JFrame as 500x550 and create instances of the program logic and the component and add it to the frame
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Spatial Network");
        frame.setSize(500, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SpatialNetwork sn = new SpatialNetwork(100, 0.2);
        SpatialComponent sc = new SpatialComponent(sn);

        frame.add(sc);
        frame.setVisible(true);
    }

}
