package src;

import src.Core.BoardGenerator;
import src.Core.DiceSimulator;
import src.Interfaces.BoardBuilderInterface;
import src.Interfaces.DiceInterface;

import static src.Utils.PrintToConsole;

public class Main {
    public static void main(String args[]){
        Rules gameRules = new Rules();

        DiceSimulator.getInstance().setMaxDiceValue(gameRules.dice_max_size);
        DiceInterface dice = DiceSimulator.getInstance();


        BoardBuilderInterface boardGenerator = new BoardGenerator();
        String[][] board = boardGenerator.generateBoard(gameRules.board_total_count,gameRules.board_width);

        SnakeCharmer _charmer = new SnakeCharmer();
        _charmer.generateSnakeConfig();
        PrintToConsole("jumanji");
    }
}
