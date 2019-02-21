public class Battle {

    public String fight(String stringOfMoves) {

        if(stringOfMoves == null){
            throw new NullPointerException("String of moves is null");
        }
        else if(stringOfMoves.indexOf('!') == -1 && stringOfMoves.indexOf('?') == -1 && stringOfMoves.indexOf('*') == -1){
            throw new IllegalArgumentException("String of moves = '" + stringOfMoves + "'");
        }

        return "You won!";
    }
}
