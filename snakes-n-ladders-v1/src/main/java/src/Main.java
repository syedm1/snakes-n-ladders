package src;

import src.Core.BoardGenerator;
import src.Core.DiceSimulator;
import src.Interfaces.BoardBuilderInterface;
import src.Interfaces.DiceInterface;

import static src.Utils.PrintToConsole;

public class Main {
    public static void main(String args[]){

        PrintToConsole("Loading rules....");

        Rules gameRules = new Rules();

        PrintToConsole("Initialising simulator....");

        GameSimulator simulator = GameSimulator.getInstance();

        DiceSimulator.getInstance().setMaxDiceValue(gameRules.dice_max_size);
        DiceInterface dice = DiceSimulator.getInstance();

        BoardBuilderInterface boardBuilder = new BoardGenerator();
        String[][] board = boardBuilder.generateBoard(gameRules.board_total_count, gameRules.board_width);

        simulator.setDiceInterface(dice);
        simulator.setBoard(board);

        PrintToConsole("Game settings loaded. Successfully.");


    }
}
