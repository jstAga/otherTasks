public class Game {

    public static String winner(String[] deckSteve, String[] deckJosh) {
        String cards[] = {"2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K", "A"};
        int rcSteve = 0;    // rc - round counter
        int rcJosh = 0;


        for (int i = 0; i < deckJosh.length; i++) {
            int steveScore = 0;
            int joshScore = 0;

            for (int j = 0; j < cards.length; j++) {
                if (deckSteve[i] == cards[j]) {
                    steveScore = j;
                }
                if (deckJosh[i] == cards[j]) {
                    joshScore = j;
                }
            }
            if (steveScore > joshScore) {
                rcSteve++;
            } else if (steveScore < joshScore) {
                rcJosh++;
            }
        }

        if (rcSteve > rcJosh) {
            return "Steve wins " + rcSteve + " to " + rcJosh;
        } else if (rcSteve < rcJosh) {
            return "Josh wins " + rcJosh + " to " + rcSteve;
        }
        return "Tie";
    }
}
