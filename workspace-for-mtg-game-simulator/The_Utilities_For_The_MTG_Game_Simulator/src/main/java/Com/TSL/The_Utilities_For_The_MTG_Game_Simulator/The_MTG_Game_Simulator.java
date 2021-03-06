package Com.TSL.The_Utilities_For_The_MTG_Game_Simulator;

public class The_MTG_Game_Simulator {
	
    public static void main(String[] args) {    	
    	a_deck The_Deck_Keep_The_Peace = (new a_deck_builder()).provides_Keep_The_Peace();
    	System.out.println(
    		"The deck Keep the Peace has " + The_Deck_Keep_The_Peace.provides_its_number_of_cards() + " cards and is the following.\n" +
    		The_Deck_Keep_The_Peace + "\n"
    	);
    	
    	a_deck_history The_Deck_History_For_Keep_the_Peace = new a_deck_history(The_Deck_Keep_The_Peace, 0, 0);
    	System.out.println(The_Deck_History_For_Keep_the_Peace + "\n");
    	
    	a_deck The_Deck_Large_And_In_Charge = (new a_deck_builder()).provides_Large_And_In_Charge();
    	System.out.println(
    		"The deck Large and in Charge has " + The_Deck_Large_And_In_Charge.provides_its_number_of_cards() + " cards and is the following.\n" +
    		The_Deck_Large_And_In_Charge + "\n"
    	);
    	
    	a_deck_history The_Deck_History_For_Large_and_in_Charge = new a_deck_history(The_Deck_Large_And_In_Charge, 0, 0);
    	System.out.println(The_Deck_History_For_Large_and_in_Charge + "\n");
    	
    	a_stack The_Stack = new a_stack();
    	a_player The_First_Player = new a_player(The_Deck_Keep_The_Peace, "Tom", The_Stack);
    	a_player The_Second_Player = new a_player(The_Deck_Large_And_In_Charge, "Scott", The_Stack);
    	a_pair_of_players The_Pair_Of_Players = new a_pair_of_players(The_First_Player, The_Second_Player);
    	The_Pair_Of_Players.play();
    }
}