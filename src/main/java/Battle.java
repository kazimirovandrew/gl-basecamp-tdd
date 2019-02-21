public class Battle {

    public String fight(String stringOfMoves) {

        int numberOfHeads = 3;
        int numberOfChoppedHeads = 0;
        String fightOutcome = "You died :(";

        try{
            if(stringOfMoves == null){
                throw new NullPointerException("String of moves is null");
            }
            else if(stringOfMoves.indexOf('!') == -1 && stringOfMoves.indexOf('?') == -1 && stringOfMoves.indexOf('*') == -1){
                throw new IllegalArgumentException("String of moves = '" + stringOfMoves + "'");
            }
            else{

                for(char move : stringOfMoves.toCharArray()){
                    if(move == '!') {
                        numberOfChoppedHeads++;
                        numberOfHeads--;

                        if(numberOfHeads == 0){
                            fightOutcome = "You won!";
                            break;
                        }
                    }
                    else if(move == '?' && numberOfChoppedHeads > 0 ) {
                        numberOfHeads += 2;
                        numberOfChoppedHeads--;
                    }
                    else if(move == '*') {
                        numberOfHeads += numberOfChoppedHeads * 2;
                        numberOfChoppedHeads = 0;
                    }
                }
            }
        }
        catch (RuntimeException ex){
            fightOutcome = "You won!";
            ex.printStackTrace();
        }

        return fightOutcome;
    }
}
