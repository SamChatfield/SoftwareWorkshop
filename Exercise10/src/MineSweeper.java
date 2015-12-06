import java.util.Random;

/**
 * Logic class for the mine sweeper exercise. Contains all necessary methods to play the game. Packaged by the model.
 *
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
    private boolean playerWon, playing, revealPressed;

    /**
     * Create new game with given board size (i.e. input of 10 will produce 10x10 board) and difficulty as stipulated by the question
     *
     * @param boardSize  size of the board - boardSize x boardSize
     * @param difficulty difficulty (or the number of mines)
     */
    public MineSweeper(int boardSize, int difficulty) {
        this.boardSize = boardSize;
        this.difficulty = difficulty;
        board = new int[boardSize][boardSize];
        revealed = new boolean[boardSize][boardSize];
        initBoard();
    }

    /**
     * Set up the board and necessary booleans for tracking the game
     */
    private void initBoard() {
        playing = true;
        playerWon = false;
        revealPressed = false;
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                board[i][j] = BLANK;
                revealed[i][j] = false;
            }
        }
        genMines(difficulty);
    }

    /**
     * Generate given number of mines
     * @param n number of mines given by the difficulty
     */
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

    /**
     * Called when player clicks on a cell. Check that that cell hasn't been revealed, if mine stop playing else keep going
     * @param i i value of cell
     * @param j j value of cell
     */
    public void click(int i, int j) {
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

    /**
     * Count number of mines adjacent to the current cell, make sure the cell being checked for containing a mine doesn't fall outside of the bounds of the array, i.e. catch any exception thrown and do nothing as this is the intended behaviour
     * @param i i value of current cell
     * @param j j value of current cell
     * @return number of mines adjacent to current cell
     */
    private int countAdjMines(int i, int j) {
        int mines = 0;
        for (int x = -1; x <= 1; x++) {
            for (int y = -1; y <= 1; y++) {
                // Catch case where i+x or j+y is outside array and simply continue looping since no mines outside minefield
                try {
                    mines += get(i + x, j + y);
                } catch (ArrayIndexOutOfBoundsException e) {
                }
            }
        }
        return mines;
    }

    /**
     * Return the label to be shown if a cell is revealed, XX if mine, or the number of adjacent mines if blank
     * @param i i value of cell to compute label for
     * @param j j value of cell to compute label for
     * @return label shown on the JButton
     */
    public String getLabel(int i, int j) {
        if (get(i, j) == MINE) {
            return "XX";
        }
        int mines = countAdjMines(i, j);
        return (mines == 0) ? "" : Integer.toString(mines);
    }

    /**
     * Reveal all cells
     */
    private void revealAll() {
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                revealed[i][j] = true;
            }
        }
    }

    /**
     * Reveal mines
     */
    public void revealMines() {
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                revealed[i][j] = get(i, j) == MINE;
            }
        }
        playing = false;
        revealPressed = true;
    }

    /**
     * Check if the player has won by checking the number of remaining blank spaces, if no blank spaces player has won then set the playerWon boolean to true and stop playing and reveal all cells
     */
    private void checkWin() {
        int remain = (boardSize * boardSize) - difficulty;
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                if (isRevealed(i, j) && get(i, j) == BLANK) {
                    remain--;
                }
            }
        }
        if (remain == 0) {
            playerWon = true;
            playing = false;
            revealAll();
        }
    }

    /**
     * Start a new game by reinitialising the board, public wrapper for private initBoard method
     */
    public void newGame() {
        initBoard();
    }

    /**
     * Get value of the cell i,j
     * @param i i value of cell
     * @param j j value of cell
     * @return value of cell, BLANK or MINE
     */
    public int get(int i, int j) {
        return board[i][j];
    }

    /**
     * Return the difficulty level, the number of mines
     * @return difficulty level, number of mines
     */
    public int getDifficulty() {
        return difficulty;
    }

    /**
     * Check if cell i,j has been revealed
     * @param i i value of cell to check
     * @param j j value of cell to check
     * @return true if revealed, false if not
     */
    public boolean isRevealed(int i, int j) {
        return revealed[i][j];
    }

    /**
     * Check if game is still playing
     * @return is game playing
     */
    public boolean isPlaying() {
        return playing;
    }

    /**
     * Has the player won the game
     * @return if player has won the game
     */
    public boolean hasPlayerWon() {
        return playerWon;
    }

    /**
     * Has reveal mines been pressed? Used to make sure popup window for win or loss doesn't show when reveal mines is pressed
     * @return
     */
    public boolean isRevealPressed() {
        return revealPressed;
    }

    /**
     * Return board dimension
     * @return
     */
    public int getBoardSize() {
        return boardSize;
    }

    /**
     * Change the difficulty level, number of mines
     * @param difficulty new difficulty
     */
    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
        newGame();
    }

    /**
     * Change if reveal mines has been pressed
     * @param revealPressed new boolean value of if reveal has been pressed
     */
    public void setRevealPressed(boolean revealPressed) {
        this.revealPressed = revealPressed;
    }
}
