package avlyakulov.timur;

import avlyakulov.timur.gameboard.GameBoard;

public class Main {
    public static void main(String[] args) {
        GameBoard gameBoard = new GameBoard();
        gameBoard.printGameBoard(gameBoard.createGameBoard());
    }
}