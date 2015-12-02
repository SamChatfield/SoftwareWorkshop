import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by Sam on 02/12/2015.
 */
public class BoardView extends JPanel implements Observer {

    private MineModel model;
    private JButton[][] cells;

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

    @Override
    public void update(Observable o, Object arg) {

    }

}
