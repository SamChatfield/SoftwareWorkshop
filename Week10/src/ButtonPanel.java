import javax.swing.*;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by Sam on 01/12/2015.
 */
public class ButtonPanel extends JPanel implements Observer {

    private NCModel model;
    private JLabel winner;

    public ButtonPanel(NCModel model) {
        super();
        this.model = model;

        JButton newGame = new JButton("New Game");
        JButton exit = new JButton("Exit");
        winner = new JLabel("");

        newGame.addActionListener(e -> model.newGame());
        exit.addActionListener(e -> System.exit(0));

        add(newGame);
        add(winner);
        add(exit);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (!(model.whoWon() == NoughtsCrosses.BLANK)) {
            winner.setText((model.whoWon() == NoughtsCrosses.CROSS) ? "Cross wins!" : "Nought wins!");
        } else {
            winner.setText("");
        }
        repaint();
    }
}
