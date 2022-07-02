package src.Core;

import src.Interfaces.DiceInterface;

import java.util.Random;

public class DiceSimulator implements DiceInterface {
    private static DiceSimulator uniqueInstance;
    private static final int MIN_DICE_VALUE = 1;
    private static final int MAX_DICE_VALUE = 6;
    Random random = new Random();

    public static DiceSimulator getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new DiceSimulator();
        }
        return uniqueInstance;
    }
    @Override
    public int rollDice() {
        return random.nextInt(MIN_DICE_VALUE, MAX_DICE_VALUE);
    }
}
