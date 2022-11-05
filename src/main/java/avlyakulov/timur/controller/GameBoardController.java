package avlyakulov.timur.controller;

import avlyakulov.timur.gameboard.GameBoard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameBoardController {
    GameBoard game = new GameBoard();


    public void run() {
        String answerStr;
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter from 1-9");
            game.printGameBoard();
            while ((answerStr = reader.readLine()) != null) {
                int answer = Integer.parseInt(answerStr);
                game.makeMove(answer,"player");
                game.makeMove(,"computer");
                System.out.println("Enter from 1-9");
            }
        }
        catch (IOException e) {
            System.out.println("Your problem is " + e.getMessage());
        }
    }
}
