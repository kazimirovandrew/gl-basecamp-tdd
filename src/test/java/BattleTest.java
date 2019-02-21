import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BattleTest {
    private static Battle unit;

    @BeforeClass
    public static void init() {
        unit = new Battle();
    }

    @Test
    public void givenStringWithMovesThenReturnOutcomeOfBattle(){
        assertTrue("You won!".equals(unit.fight()) || "You died :(".equals(unit.fight()));
    }

    @Test
    public void givenEmptyStringFromConsoleThenReturnDefaultStringOfMoves(){
        assertEquals("!default!move!", unit.readFromConsole());
    }
}
