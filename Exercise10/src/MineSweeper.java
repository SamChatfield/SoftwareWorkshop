import java.util.Random;

/**
 * Created by Sam on 01/12/2015.
 */
public class MineSweeper {

    public static final int BLANK = 0;
    public static final int MINE = 1;
    public static final int EASY = 10;
    public static final int NORMAL = 15;
    public static final int HARD = 20;

    private int boardSize; // eg 10x10 would be boardSize = 10
    private int difficulty;
    private int[][] board;
    private boolean[][] revealed;
    private boolean playerWon, playing, restarted;

    public MineSweeper(int boardSize, int difficulty) {
        this.boardSize = boardSize;
        this.difficulty = difficulty;
        board = new int[boardSize][boardSize];
        revealed = new boolean[boardSize][boardSize];
        initBoard();
    }

    private void initBoard() {
        System.out.println("initBoard");
        playing = true;
        playerWon = false;
        restarted = false;
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                board[i][j] = BLANK;
                revealed[i][j] = false;
            }
        }
        genMines(difficulty);
    }

    private void genMines(int n) {
        System.out.println("genMines");
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
        System.out.println("click");
        if (!revealed[i][j]) {
            revealed[i][j] = true;
            if (board[i][j] == MINE) { // Player lost
                playing = false;
                revealAll();
            } else { // Player still going
                checkWin();
            }
        } else {
            throw new IllegalArgumentException("Board already revealed at (" + i + ", " + j + ")");
            }
    }

    private void revealAll() {
        System.out.println("revealAll");
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                revealed[i][j] = true;
            }
        }
    }

    public void revealMines() {
        System.out.println("revealMines");
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                revealed[i][j] = get(i, j) == MINE;
            }
        }
        playing = false;
    }

    private void checkWin() {
        System.out.println("checkWin");
        int remain = (boardSize * boardSize) - difficulty;
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                if (isRevealed(i, j) && get(i, j) == BLANK) {
                    remain--;
                }
            }
        }
        System.out.println("remain: " + remain);
        if (remain == 0) {
            playerWon = true;
            playing = false;
            revealAll();
        }
    }

    public String getLabel(int i, int j) {
        System.out.println("getLabel");
        if (get(i, j) == MINE) {
            return "XX";
        } else {
            int label = 0;
            for (int x = -1; x <= 1; x++) {
                for (int y = -1; y <= 1; y++) {
                    // Catch case where i+x or j+y is outside array and simply continue looping since no mines outside minefield
                    try {
                        label += get(i + x, j + y);
                    } catch (ArrayIndexOutOfBoundsException e) {
                    }
                }
            }
            return (label == 0) ? "" : Integer.toString(label);
        }
    }

    public void newGame() {
        System.out.println("newGame");
        initBoard();
    }

    public int get(int i, int j) {
        return board[i][j];
    }

    public int getDifficulty() {
        return difficulty;
    }

    public boolean isRevealed(int i, int j) {
        return revealed[i][j];
    }

    public boolean isPlaying() {
        return playing;
    }

    public boolean hasPlayerWon() {
        return playerWon;
    }

    public boolean hasRestarted() {
        return restarted;
    }

    public int getBoardSize() {
        return boardSize;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
        newGame();
    }

    public void setRestarted(boolean restarted) {
        this.restarted = restarted;
    }
}
