import javax.swing.*;

/**
 * Created by Sam on 02/12/2015.
 */
public class MineSweeperGUI {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Minesweeper");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // eg arg of 10 = 10x10 board
        MineSweeper ms = new MineSweeper(10);
        MineComponent mc = new MineComponent(ms);

        frame.add(mc);
        frame.setVisible(true);
    }

}
