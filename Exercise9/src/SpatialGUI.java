import javax.swing.*;

/**
 * Created by Sam on 26/11/2015.
 */
public class SpatialGUI {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Spatial Network");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SpatialNetwork sn = new SpatialNetwork(100, 0.2);
        SpatialComponent sc = new SpatialComponent(sn);

        frame.add(sc);
        frame.setVisible(true);
    }

}
