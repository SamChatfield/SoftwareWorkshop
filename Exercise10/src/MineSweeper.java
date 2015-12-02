import java.util.Random;

/**
 * Created by Sam on 01/12/2015.
 */
public class MineSweeper {

    public final int BLANK = 0;
    public final int MINE = 1;
    public final int EASY = 10;
    public final int NORMAL = 15;
    public final int HARD = 20;

    private int boardSize; // eg 10x10 would be boardSize = 10
    private int difficulty;
    private int[][] board;
    private boolean[][] revealed;
    private boolean playing;

    public MineSweeper(int boardSize) {
        this.boardSize = boardSize;
        difficulty = EASY;
        board = new int[boardSize][boardSize];
        revealed = new boolean[boardSize][boardSize];
        initBoard();
    }

    private void initBoard() {
        playing = true;
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                board[i][j] = BLANK;
                revealed[i][j] = false;
            }
        }
        genMines(difficulty);
    }

    private void genMines(int n) {
        Random rand = new Random();
        while (n > 0) {
            int i = rand.nextInt(boardSize);
            int j = rand.nextInt(boardSize);
            if (board[i][j] == BLANK) {
                board[i][j] = MINE;
                n--;
            }
        }
    }

    public void click(int i, int j) {
        if (!revealed[i][j]) {
            revealed[i][j] = true;
            if (board[i][j] == MINE) {
                playing = false;
                revealAll();
            }
        } else {
            throw new IllegalArgumentException("Board already revealed at (" + i + ", " + j + ")");
        }
    }

    private void revealAll() {
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                revealed[i][j] = true;
            }
        }
    }

    public int getLabel(int i, int j) {
        return 0;
    }

    public void newGame() {
        initBoard();
    }

    public int get(int i, int j) {
        return board[i][j];
    }

    public boolean isRevealed(int i, int j) {
        return revealed[i][j];
    }

    public boolean isPlaying() {
        return playing;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
        newGame();
    }
}
