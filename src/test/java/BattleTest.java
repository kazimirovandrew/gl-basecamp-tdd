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
        assertTrue("You won!".equals(unit.fight("123!")) || "You died :(".equals(unit.fight("123!")));
    }

    @Test(expected = IllegalArgumentException.class)
    public void givenEmptyStringThenReturnIllegalArgumentException(){
        unit.fight("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void givenStringWithoutSpecialSymbolsThenReturnIllegalArgumentException(){
        unit.fight("123qwe");
    }

    @Test(expected = NullPointerException.class)
    public void givenNullStringThenReturnIllegalArgumentException(){
        unit.fight(null);
    }


}
