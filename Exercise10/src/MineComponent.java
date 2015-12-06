import javax.swing.*;
import java.awt.*;

/**
 * The overall JPanel of the JFrame that contains the board and controls panels
 *
 * Created by Sam on 02/12/2015.
 */
public class MineComponent extends JPanel {

    /**
     * Create a new JPanel with a BorderLayout, create instances of the model an the views and add the view (BoardView) as the model's observer
     *
     * @param ms MineSweeper game logic object
     */
    public MineComponent(MineSweeper ms) {
        super();

        MineModel model = new MineModel(ms);
        BoardView view = new BoardView(model);
        ControlPanel controlPanel = new ControlPanel(model);

        model.addObserver(view);

        setLayout(new BorderLayout());
        add(view, BorderLayout.CENTER);
        add(controlPanel, BorderLayout.SOUTH);
    }

}
