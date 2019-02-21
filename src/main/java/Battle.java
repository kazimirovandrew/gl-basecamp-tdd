public class Battle {

    public String fight(String stringOfMoves) {

        if(stringOfMoves.isEmpty()){
            throw new IllegalArgumentException("String of moves = '" + stringOfMoves + "'");
        }

        return "You won!";
    }
}
