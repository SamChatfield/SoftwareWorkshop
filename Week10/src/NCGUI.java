import javax.swing.*;

/**
 * Created by Sam on 01/12/2015.
 */
public class NCGUI {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        NoughtsCrosses nc = new NoughtsCrosses();
        NCComponent ncComponent = new NCComponent(nc);

        frame.add(ncComponent);
        frame.setVisible(true);
    }

}
