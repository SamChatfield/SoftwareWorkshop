import java.util.Observable;

/**
 * Created by Sam on 02/12/2015.
 */
public class MineModel extends Observable {

    private MineSweeper ms;

    public MineModel(MineSweeper ms) {
        super();
        this.ms = ms;
    }

    public void click(int i, int j) {
        ms.click(i, j);
        setChanged();
        notifyObservers();
    }

    public void newGame() {
        ms.newGame();
        setChanged();
        notifyObservers();
    }

    public void revealMines() {
        ms.revealMines();
        setChanged();
        notifyObservers();
    }

    public String getLabel(int i, int j) {
        return ms.getLabel(i, j);
    }

    public int get(int i, int j) {
        return ms.get(i, j);
    }

    public int getDifficulty() {
        return ms.getDifficulty();
    }

    public boolean isRevealed(int i, int j) {
        return ms.isRevealed(i, j);
    }

    public boolean isPlaying() {
        return ms.isPlaying();
    }

    public boolean hasPlayerWon() {
        return ms.hasPlayerWon();
    }

    public boolean isRevealPressed() {
        return ms.isRevealPressed();
    }

    public int getBoardSize() {
        return ms.getBoardSize();
    }

    public void setDifficulty(int difficulty) {
        ms.setDifficulty(difficulty);
        setChanged();
        notifyObservers();
    }

    public void setRestarted(boolean restarted) {
        ms.setRevealPressed(restarted);
    }

}
