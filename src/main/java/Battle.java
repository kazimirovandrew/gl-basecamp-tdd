public class Battle {

    public String fight(String stringOfMoves) {

        String fightOutcome = null;

        try{
            if(stringOfMoves == null){
                throw new NullPointerException("String of moves is null");
            }
            else if(stringOfMoves.indexOf('!') == -1 && stringOfMoves.indexOf('?') == -1 && stringOfMoves.indexOf('*') == -1){
                throw new IllegalArgumentException("String of moves = '" + stringOfMoves + "'");
            }
            else{
                fightOutcome = "You died :(";
            }
        }
        catch (RuntimeException ex){
            fightOutcome = "You won!";
            ex.printStackTrace();
        }

        return fightOutcome;
    }
}
