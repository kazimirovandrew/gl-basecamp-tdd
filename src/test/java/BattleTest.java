import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BattleTest {

    @Test
    public void givenStringWithMovesThenReturnOutcomeOfBattle(){
        Battle unit = new Battle();
        assertTrue("You won!".equals(unit.fight()) || "You died :(".equals(unit.fight()));
    }
}
