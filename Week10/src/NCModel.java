import java.util.Observable;

/**
 * Created by Sam on 01/12/2015.
 */
public class NCModel extends Observable {

    private NoughtsCrosses nc;

    public NCModel(NoughtsCrosses nc) {
        super();
        this.nc = nc;
    }

    public int get(int i, int j) {
        return nc.get(i, j);
    }

    public boolean isCrossTurn() {
        return nc.isCrossTurn();
    }

    public void turn(int i, int j) {
        nc.turn(i, j);
        setChanged();
        notifyObservers();
    }

    public int whoWon() {
        return nc.whoWon();
    }

    public void newGame() {
        nc.newGame();
        setChanged();
        notifyObservers();
    }

}
