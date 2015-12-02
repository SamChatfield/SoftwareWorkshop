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
        ControlPanel controlPanel = new ControlPanel(model);

        model.addObserver(view);

        setLayout(new BorderLayout());
        add(view, BorderLayout.CENTER);
        add(controlPanel, BorderLayout.SOUTH);
    }

}
