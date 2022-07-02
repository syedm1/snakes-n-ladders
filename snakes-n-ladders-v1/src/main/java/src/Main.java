package src;

import src.Core.DiceSimulator;
import src.Interfaces.DiceInterface;

public class Main {
    public static void main(String args[]){
        DiceInterface dice = DiceSimulator.getInstance();
        int val = dice.rollDice();
        System.out.println("hello world: "+val);
    }
}
