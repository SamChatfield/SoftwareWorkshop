import javax.swing.*;
import java.awt.*;

/**
 * Created by Sam on 02/12/2015.
 */
public class MineComponent extends JPanel {

    public MineComponent(MineSweeper ms) {
        super();

        MineModel model = new MineModel(ms);
        BoardView view = new BoardView(model);
        // TODO Control panel

        model.addObserver(view);

        setLayout(new BorderLayout());
        add(view, BorderLayout.CENTER);
        // TODO add Control panel SOUTH
    }

}
