import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BattleTest {
    private static Battle unit;

    @BeforeClass
    public static void init() {
        unit = new Battle();
    }

    @Test
    public void givenStringWithMovesThenReturnOutcomeOfBattle(){
        assertEquals("You won!", unit.fight("!!!!!123qwe"));
        assertEquals("You died :(", unit.fight("??12?3q?we!"));
        assertEquals("You died :(", unit.fight("*1!!2?3q?we!"));
        assertEquals("You died :(", unit.fight("kjha*!ask&&!"));
        assertEquals("You won!", unit.fight("!!??ajsdhbc!!!!!"));
    }

    @Test
    public void whenPassIllegalArgumentThenUseDefaultStringOfMovesAndReturnWinningOutcome(){
        assertEquals("You won!", unit.fight("123qwe"));
        assertEquals("You won!", unit.fight(null));
    }
}
