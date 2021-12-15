package Com.TSL.Utilities_for_MTG_Game_Simulator;


import java.util.ArrayList;


/**
 * Hello world!
 *
 */

public class MTG_Game_Simulator {
	
    public static void main(String[] args) {
    	
    	A_Deck the_deck_Keep_the_Peace = (new A_Deck_Builder()).provides_Keep_the_Peace();
    	System.out.println(
    		"The deck Keep the Peace has " + the_deck_Keep_the_Peace.provides_its_number_of_cards() + " cards and is the following.\n" +
    		the_deck_Keep_the_Peace + "\n"
    	);
    	
    	A_Deck_History the_deck_history_for_Keep_the_Peace = new A_Deck_History(the_deck_Keep_the_Peace, 0, 0);
    	System.out.println(the_deck_history_for_Keep_the_Peace + "\n");
    	
    	A_Player the_first_player = new A_Player(the_deck_Keep_the_Peace, "Tom");
    	A_Player the_second_player = new A_Player(the_deck_Keep_the_Peace, "Tom");
    	Two_Players the_two_players = new Two_Players(the_first_player, the_second_player);
    	the_two_players.play();
    }
}