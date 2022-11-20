package avlyakulov.timur.controller;

import avlyakulov.timur.gameboard.GameBoard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameBoardController {
    GameBoard game = new GameBoard();

    public void run() {
        String answerStr;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter from 1-9");
            game.printGameBoard();
            while ((answerStr = reader.readLine()) != null) {
                System.out.println("Enter from 1-9");
                int answer = Integer.parseInt(answerStr);
                while (answer < 1 || answer > 9) {
                    System.out.println("You enter the wrong number not from this range");
                    System.out.println("Please enter the value one more");
                    answerStr = reader.readLine();
                    answer = Integer.parseInt(answerStr);
                }
                game.makeMove(answer, "player");
                String result = GameBoard.checkWinner();
                if (result.length() > 0) {
                    game.printGameBoard();
                    System.out.println(result);
                    break;
                }
                game.makeMove(answer, "computer");
                result = GameBoard.checkWinner();
                if (result.length() > 0) {
                    game.printGameBoard();
                    System.out.println(result);
                    break;
                }
                game.printGameBoard();
            }
        } catch (IOException | IllegalArgumentException e) {
            System.out.println("Your enter the wrong value " + e.getMessage());
        }
    }
}