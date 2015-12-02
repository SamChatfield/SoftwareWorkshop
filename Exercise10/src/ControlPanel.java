import javax.swing.*;

/**
 * Created by Sam on 02/12/2015.
 */
public class ControlPanel extends JPanel {

    public ControlPanel(MineModel model) {
        super();

        JButton exit = new JButton("Exit");
        JButton restart = new JButton("Restart");
        JButton revealMines = new JButton("Reveal Mines");

        exit.addActionListener(e -> System.exit(0));
        restart.addActionListener(e -> {
            model.newGame();
            model.setRestarted(true);
        });
        revealMines.addActionListener(e -> model.revealMines());

        ButtonGroup diffGroup = new ButtonGroup();
        JRadioButton easy = new JRadioButton("Easy");
        JRadioButton normal = new JRadioButton("Normal");
        JRadioButton hard = new JRadioButton("Hard");
        diffGroup.add(easy);
        diffGroup.add(normal);
        diffGroup.add(hard);

        if (model.getDifficulty() == MineSweeper.EASY)
            easy.setSelected(true);
        else if (model.getDifficulty() == MineSweeper.NORMAL)
            normal.setSelected(true);
        else
            hard.setEnabled(true);

        easy.addActionListener(e -> model.setDifficulty(MineSweeper.EASY));
        normal.addActionListener(e -> model.setDifficulty(MineSweeper.NORMAL));
        hard.addActionListener(e -> model.setDifficulty(MineSweeper.HARD));

        add(easy);
        add(normal);
        add(hard);
        add(revealMines);
        add(restart);
        add(exit);
    }

}
