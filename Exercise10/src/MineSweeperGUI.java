import javax.swing.*;

/**
 * The overall window for the game containing the JFrame onto which the overall component is added. Create the game logic and component
 *
 * Created by Sam on 02/12/2015.
 */
public class MineSweeperGUI {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Minesweeper");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // eg arg of 10 = 10x10 board
        MineSweeper ms = new MineSweeper(10, MineSweeper.EASY);
        MineComponent mc = new MineComponent(ms);

        frame.add(mc);
        frame.setVisible(true);
    }

}
