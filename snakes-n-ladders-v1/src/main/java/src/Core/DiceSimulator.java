package src.Core;

import src.Interfaces.DiceInterface;
import static src.Utils.RandomIntGeneratorInGivenRange;


public class DiceSimulator implements DiceInterface {
    private static DiceSimulator uniqueInstance;
    private int maxDiceValue = 6;

    public static DiceSimulator getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new DiceSimulator();
        }
        return uniqueInstance;
    }

    public void setMaxDiceValue(int maxDiceValue) {
        this.maxDiceValue = maxDiceValue;
    }

    @Override
    public int rollDice() {
        return RandomIntGeneratorInGivenRange(MIN_DICE_VALUE, maxDiceValue);
    }
}
