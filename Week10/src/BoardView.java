import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by Sam on 01/12/2015.
 */
public class BoardView extends JPanel implements Observer {

    private NCModel model;
    private JButton[][] tiles;

    public BoardView(NCModel model) {
        super();
        this.model = model;

        tiles = new JButton[3][3];
        setLayout(new GridLayout(3, 3));

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                final int fi = i;
                final int fj = j;
                tiles[i][j] = new JButton();
                tiles[i][j].addActionListener(e -> model.turn(fi, fj));
                add(tiles[i][j]);
            }
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (model.get(i, j) == NoughtsCrosses.NOUGHT) {
                    tiles[i][j].setText("O");
                    tiles[i][j].setEnabled(false);
                } else if (model.get(i, j) == NoughtsCrosses.CROSS) {
                    tiles[i][j].setText("X");
                    tiles[i][j].setEnabled(false);
                } else {
                    tiles[i][j].setText(" ");
                    tiles[i][j].setEnabled(model.whoWon() == NoughtsCrosses.BLANK);
                }
            }
        }
        repaint();
    }
}
