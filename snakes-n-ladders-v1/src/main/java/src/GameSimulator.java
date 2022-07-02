package src;

import src.Core.BoardGenerator;
import src.Core.DiceSimulator;
import src.Interfaces.BoardBuilderInterface;
import src.Interfaces.DiceInterface;

public class GameSimulator {

    DiceInterface diceInterface;
    String[][] _board;
    private static GameSimulator uniqueInstance;

    public static GameSimulator getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new GameSimulator();
        }
        return uniqueInstance;
    }

    public void setDiceInterface(DiceInterface diceInterface) {
        this.diceInterface = diceInterface;
    }

    public void setBoard(String[][] board ) {
        this._board = board;
    }

    public void emulate(){
        generateNewSnakeConfig();
    }

    public void generateNewSnakeConfig(){
        SnakeCharmer _charmer = new SnakeCharmer();
        _charmer.generateSnakeConfig();
    }
}
