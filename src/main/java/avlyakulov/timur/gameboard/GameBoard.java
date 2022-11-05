package avlyakulov.timur.gameboard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GameBoard {

    private static char[][] gameBoard;
    public static ArrayList<Integer> playerPositions = new ArrayList<>();
    public static ArrayList<Integer> computerPositions = new ArrayList<>();

    public GameBoard() {
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
        printGameBoard();
    }

    public static String checkWinner() {
        List<Integer> topRow = Arrays.asList(1, 2, 3);
        List<Integer> midRow = Arrays.asList(4, 5, 6);
        List<Integer> botRow = Arrays.asList(7, 8, 9);
        List<Integer> firstColumn = Arrays.asList(1, 4, 7);
        List<Integer> secondColumn = Arrays.asList(2, 5, 8);
        List<Integer> thirdColumn = Arrays.asList(3, 6, 9);
        List<Integer> leftDiagonal = Arrays.asList(1, 5, 9);
        List<Integer> rightDiagonal = Arrays.asList(3, 5, 7);

        List<List> win = new ArrayList<>();
        win.add(topRow);
        win.add(midRow);
        win.add(botRow);
        win.add(firstColumn);
        win.add(secondColumn);
        win.add(thirdColumn);
        win.add(leftDiagonal);
        win.add(rightDiagonal);

        for (List l : win) {
            if (playerPositions.containsAll(l))
                return "Congratulations you won";
            else if (computerPositions.containsAll(l)) 
                return "Computer won this game";
            else if (playerPositions.size() + computerPositions.size() == 5)
                return "It is draw, good luck next time";
        }
        return "";
    }
}