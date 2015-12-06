import java.util.Observable;

/**
 * Model wrapper for game logic in MineSweeper
 *
 * Created by Sam on 02/12/2015.
 */
public class MineModel extends Observable {

    private MineSweeper ms;

    /**
     * Create new model from MineSweeper logic object and call Observable's constructor
     *
     * @param ms
     */
    public MineModel(MineSweeper ms) {
        super();
        this.ms = ms;
    }

    /**
     * Called when player clicks a cell and notify observers to update view
     * @param i i value of clicked cell
     * @param j j value of clicked cell
     */
    public void click(int i, int j) {
        ms.click(i, j);
        setChanged();
        notifyObservers();
    }

    /**
     * Start a new game and call notify observers to update view
     */
    public void newGame() {
        ms.newGame();
        setChanged();
        notifyObservers();
    }

    /**
     * Reveal the mines and notify observers to update the view
     */
    public void revealMines() {
        ms.revealMines();
        setChanged();
        notifyObservers();
    }

    /**
     * Get label of cell i,j to show on button
     * @param i i value of cell
     * @param j j value of cell
     * @return the label to show
     */
    public String getLabel(int i, int j) {
        return ms.getLabel(i, j);
    }

    /**
     * Get value BLANK or MINE of cell i,j
     * @param i i value of cell
     * @param j j value of cell
     * @return value of cell BLANK or MINE
     */
    public int get(int i, int j) {
        return ms.get(i, j);
    }

    /**
     * Return difficulty level, number of mines
     * @return difficulty level, number of mines
     */
    public int getDifficulty() {
        return ms.getDifficulty();
    }

    /**
     * Check if cell i,j has been revealed
     * @param i i value of cell to check
     * @param j j value of cell to check
     * @return has cell i,j been revealed?
     */
    public boolean isRevealed(int i, int j) {
        return ms.isRevealed(i, j);
    }

    /**
     * Check if game is still playing
     * @return is game still playing?
     */
    public boolean isPlaying() {
        return ms.isPlaying();
    }

    /**
     * Check if the player has won the game
     * @return has the player won?
     */
    public boolean hasPlayerWon() {
        return ms.hasPlayerWon();
    }

    /**
     * Check if reveal has just been pressed. Used to stop win or loss popup showing when reveal mines is clicked
     * @return has reveal just been pressed?
     */
    public boolean isRevealPressed() {
        return ms.isRevealPressed();
    }

    /**
     * Return board dimension
     * @return board dimension
     */
    public int getBoardSize() {
        return ms.getBoardSize();
    }

    /**
     * Change the difficulty level
     * @param difficulty new difficulty level
     */
    public void setDifficulty(int difficulty) {
        ms.setDifficulty(difficulty);
        setChanged();
        notifyObservers();
    }

    /**
     * Change boolean value of reveal having just been pressed
     *
     * @param revealPressed new boolean value of reveal having just been pressed
     */
    public void setRevealPressed(boolean revealPressed) {
        ms.setRevealPressed(revealPressed);
    }

}
