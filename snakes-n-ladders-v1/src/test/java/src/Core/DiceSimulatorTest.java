package src.Core;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceSimulatorTest {
    DiceSimulator diceSimulator;

    @BeforeEach
    void setUp() {
        diceSimulator = DiceSimulator.getInstance();
    }

    @Test
    @DisplayName("Singleton instance should always be not null")
    void checkInstance() {
        assertNotNull(diceSimulator);
    }

    @Test
    @DisplayName("When rollDice is invoked check boundary ranges for dice outcomes")
    void checkRangeForDiceRollOutcome() {
        int high = 7;
        int low = 0;
        assertTrue(high > diceSimulator.rollDice(), "Error, dice outcome is too high");
        assertTrue(low  < diceSimulator.rollDice(), "Error, dice outcome is too low");
    }
}