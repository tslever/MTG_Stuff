package Com.TSL.Utilities_for_MTG_Game_Simulator;


import java.util.ArrayList;
import java.util.Collections;


public class A_Deck
{
	
	private ArrayList<A_Card> list_of_cards;
	private String name;
	
	
	public A_Deck(ArrayList<A_Card> the_list_of_cards_to_use, String the_name_to_use) {
		
		this.list_of_cards = the_list_of_cards_to_use;
		this.name = the_name_to_use;
	}
	
	
	public A_Card provides_a_card() {
		return this.list_of_cards.remove(this.list_of_cards.size() - 1);
	}
	
	
	public String provides_its_name() {
		return this.name;
	}
	
	
	public int provides_its_number_of_cards() {
		return this.list_of_cards.size();
	}
	
	
	public void shuffles() {
		Collections.shuffle(list_of_cards);
	}
	
	
	@Override
	public String toString() {
		StringBuilder the_string_builder = new StringBuilder(this.name);
		for (int i = 0; i < this.list_of_cards.size(); i++) {
			the_string_builder.append("\n");
			the_string_builder.append(this.list_of_cards.get(i));
		}
		return the_string_builder.toString();
	}
}
