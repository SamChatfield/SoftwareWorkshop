import javax.swing.*;

/**
 * JPanel containing the remaining controllers of the game other than the board itself containing the controls stipulated in the question
 *
 * Created by Sam on 02/12/2015.
 */
public class ControlPanel extends JPanel {

    /**
     * Create new JPanel using the given model object and the default FlowLayout, create the buttons and add their functionality using lambda expressions.
     * Create the ButtonGroup that holds and controls the JRadioButtons that control the game difficulty. Decide which radio button should start selected as per the difficulty level that was used to create the game object.
     * Add the controls to the FlowLayout in left-right order
     *
     * @param model model
     */
    public ControlPanel(MineModel model) {
        super();

        JButton exit = new JButton("Exit");
        JButton restart = new JButton("Restart");
        JButton revealMines = new JButton("Reveal Mines");

        exit.addActionListener(e -> System.exit(0));
        restart.addActionListener(e -> model.newGame());
        revealMines.addActionListener(e -> {
            model.revealMines();
            model.setRevealPressed(true);
        });

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
