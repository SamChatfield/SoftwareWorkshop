import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

/**
 * A view and controller part of the MVC design, the panel that shows the cells of the game and the buttons that allow you to reveal a cell
 *
 * Created by Sam on 02/12/2015.
 */
public class BoardView extends JPanel implements Observer {

    private MineModel model;
    private JButton[][] cells;

    /**
     * Create new panel of buttons equal to the size of the actual board in the game logic using the model, put them in a grid layout and add the listeners for the clicks of the buttons
     *
     * @param model model
     */
    public BoardView(MineModel model) {
        super();
        this.model = model;

        int size = model.getBoardSize();
        cells = new JButton[size][size];
        setLayout(new GridLayout(size, size));

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                final int fi = i;
                final int fj = j;
                cells[i][j] = new JButton();
                cells[i][j].addActionListener(e -> model.click(fi, fj));
                add(cells[i][j]);
            }
        }
    }

    /**
     * Called when notifyObservers is called in the model observable to update the view, the current state of how the board looks on screen.
     * Contains the logic to reveal cells, disable cells if they are revealed, query the labels of cells, query if the game has been won and create popups accordingly
     * @param o Observable
     * @param arg Object
     */
    @Override
    public void update(Observable o, Object arg) {
        int size = model.getBoardSize();

        // Paint labels
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (model.isRevealed(i, j)) {
                    if (cells[i][j].isEnabled()) {
                        cells[i][j].setText(model.getLabel(i, j));
                        cells[i][j].setEnabled(false);
                    }
                } else if (!model.isPlaying()) {
                    cells[i][j].setEnabled(false);
                } else {
                    cells[i][j].setEnabled(true);
                    cells[i][j].setText("");
                }
            }
        }

        // Check for win or loss
        if (!model.isPlaying() && !model.hasPlayerWon() && !model.isRevealPressed()) {
            JOptionPane.showMessageDialog(this, "You lose!\nPress restart to try again.");
        } else if (model.hasPlayerWon() && !model.isPlaying() && !model.isRevealPressed()) {
            JOptionPane.showMessageDialog(this, "Congratulations, you win!\nPress restart to play again.");
        }

        repaint();
    }

}
