package Com.TSL.Utilities_for_MTG_Game_Simulator;


import java.util.ArrayList;
import java.util.Stack;


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
    	
    	A_Deck the_deck_Large_and_in_Charge = (new A_Deck_Builder()).provides_Large_and_in_Charge();
    	System.out.println(
    		"The deck Large and in Charge has " + the_deck_Large_and_in_Charge.provides_its_number_of_cards() + " cards and is the following.\n" +
    		the_deck_Large_and_in_Charge + "\n"
    	);
    	
    	A_Deck_History the_deck_history_for_Large_and_in_Charge = new A_Deck_History(the_deck_Keep_the_Peace, 0, 0);
    	System.out.println(the_deck_history_for_Large_and_in_Charge + "\n");
    	
    	A_Stack the_stack = new A_Stack();
    	A_Dictionary_Of_Permanent_Names_And_Encapsulators_For_A_Method_To_Provide_An_Array_Of_Possible_Mana_Contributions the_dictionary_of_permanent_names_and_encapsulators_for_a_method_to_provide_an_array_of_possible_mana_contributions = new A_Dictionary_Of_Permanent_Names_And_Encapsulators_For_A_Method_To_Provide_An_Array_Of_Possible_Mana_Contributions();
    	A_Player the_first_player = new A_Player(the_deck_Keep_the_Peace, "Tom", the_stack, the_dictionary_of_permanent_names_and_encapsulators_for_a_method_to_provide_an_array_of_possible_mana_contributions);
    	A_Player the_second_player = new A_Player(the_deck_Large_and_in_Charge, "Scott", the_stack, the_dictionary_of_permanent_names_and_encapsulators_for_a_method_to_provide_an_array_of_possible_mana_contributions);
    	Two_Players the_two_players = new Two_Players(the_first_player, the_second_player);
    	the_two_players.play();
    }
}