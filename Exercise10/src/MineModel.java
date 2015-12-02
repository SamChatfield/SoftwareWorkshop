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
    }

    public void newGame() {
        ms.newGame();
    }

    public int get(int i, int j) {
        return ms.get(i, j);
    }

    public boolean isRevealed(int i, int j) {
        return ms.isRevealed(i, j);
    }

    public boolean isPlaying() {
        return ms.isPlaying();
    }

    public void setDifficulty(int difficulty) {
        ms.setDifficulty(difficulty);
    }

}
