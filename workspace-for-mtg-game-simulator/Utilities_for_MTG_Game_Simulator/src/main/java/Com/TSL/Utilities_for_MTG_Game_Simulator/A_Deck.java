package Com.TSL.Utilities_for_MTG_Game_Simulator;


import java.util.ArrayList;


public class A_Deck
{
	
	private ArrayList<A_Card> list_of_cards;
	private String name;
	
	
	public A_Deck(ArrayList<A_Card> the_list_of_cards_to_use, String the_name_to_use)
	{
		this.list_of_cards = the_list_of_cards_to_use;
		this.name = the_name_to_use;
	}
	
	
	public String provides_its_name()
	{
		return this.name;
	}
	
}
