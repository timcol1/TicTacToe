package avlyakulov.timur.gameboard;

public class GameBoard {
    public char[][] createGameBoard() {
        return new char[][]{{' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
        };
    }

    public void printGameBoard(char[][] gameBoard) {
        for (char[] chars : gameBoard) {
            for (char c : chars) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
