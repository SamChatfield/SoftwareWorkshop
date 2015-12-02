/**
 * Created by Sam on 01/12/2015.
 */
public class MineSweeper {

    public final int MINE = -1;
    public final int EASY = 10;
    public final int NORMAL = 15;
    public final int HARD = 20;

    private int boardSize; // eg 10x10 would be boardSize = 10
    private int difficulty;
    private int[][] board;

    public MineSweeper(int boardSize) {
        this.boardSize = boardSize;
        difficulty = NORMAL;
        board = new int[boardSize + 2][boardSize + 2];
    }

    public void initBoard() {
        for (int i = 0; i < boardSize + 2; i++) {
            for (int j = 0; j < boardSize + 2; j++) {
                board[i][j] = 0;
            }
        }
    }

    private void genMines() {
        for (int i = 0; i < difficulty; i++) {

        }
    }

    public void calcNumber() {

    }

    public void newGame() {
        initBoard();
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }
}
