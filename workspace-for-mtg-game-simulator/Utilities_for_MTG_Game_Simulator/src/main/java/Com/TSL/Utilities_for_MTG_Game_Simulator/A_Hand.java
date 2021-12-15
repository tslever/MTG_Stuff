package Com.TSL.Utilities_for_MTG_Game_Simulator;


import java.util.ArrayList;


public class A_Hand {

	private ArrayList<A_Card> list_of_cards;
	
	public A_Hand() {
		this.list_of_cards = new ArrayList<A_Card>();
	}
	
	public void receives(A_Card the_card) {
		this.list_of_cards.add(the_card);
	}
	
	public int provides_its_number_of_cards() {
		return this.list_of_cards.size();
	}
	
	@Override
	public String toString() {
		StringBuilder the_string_builder = new StringBuilder();
		for (int i = 0; i < this.list_of_cards.size() - 1; i++) {
			the_string_builder.append(this.list_of_cards.get(i));
			the_string_builder.append("\n");
		}
		the_string_builder.append(this.list_of_cards.get(this.list_of_cards.size() - 1));
		return the_string_builder.toString();
	}
	
}
