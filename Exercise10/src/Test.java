/**
 * Test class for before GUI implemented. Test methods created up until that point. See individual comments below
 *
 * Created by Sam on 02/12/2015.
 */
public class Test {

    public static void main(String[] args) {
        Test test = new Test();
    }

    public Test() {
        int boardSize = 10;

        MineSweeper ms = new MineSweeper(boardSize, MineSweeper.EASY);
        MineModel model = new MineModel(ms);

        // Test constructor of board with mines
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                System.out.print(model.get(i, j) + " ");
            }
            System.out.println();
        }

        System.out.println();

        // Test constructor for 2D array of revealed tiles
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                System.out.print(model.isRevealed(i, j) + " ");
            }
            System.out.println();
        }

        System.out.println();

        // Test get method on some arbitrary positions (run it enough times and a 1 will appear)
        System.out.println(model.get(2, 9));
        System.out.println(model.get(7, 6));
        System.out.println(model.get(5, 4));

        System.out.println();

        // Test setDifficulty and thus newGame
        model.setDifficulty(MineSweeper.HARD);

        // Reprint after changing difficulty to hard (20 mines)
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                System.out.print(model.get(i, j) + " ");
            }
            System.out.println();
        }
    }

}
