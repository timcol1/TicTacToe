package avlyakulov.timur.gameboard;

public class GameBoard {

    private static char[][] gameBoard;

    public GameBoard () {
        gameBoard = new char[][]{{' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
        };
    }

    public void printGameBoard() {
        for (char[] chars : gameBoard) {
            for (char c : chars) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public void makeMove(int position, String user) {
        char symbol = ' ';
        if (user.equals("player"))
            symbol = 'X';
        else symbol = 'O';

        switch (position) {
            case 1 -> gameBoard[0][0] = symbol;
            case 2 -> gameBoard[0][2] = symbol;
            case 3 -> gameBoard[0][4] = symbol;
            case 4 -> gameBoard[2][0] = symbol;
            case 5 -> gameBoard[2][2] = symbol;
            case 6 -> gameBoard[2][4] = symbol;
            case 7 -> gameBoard[4][0] = symbol;
            case 8 -> gameBoard[4][2] = symbol;
            case 9 -> gameBoard[4][4] = symbol;
        }
    }

}
