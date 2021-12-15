package Com.TSL.Utilities_for_MTG_Game_Simulator;


public class A_Deck_History
{
	private A_Deck deck;
	private int number_of_losses;
	private int number_of_wins;
	
	
	public A_Deck_History(A_Deck the_deck_to_use, int the_number_of_losses_to_use, int the_number_of_wins_to_use)
	{
		this.deck = the_deck_to_use;
		this.number_of_losses = the_number_of_losses_to_use;
		this.number_of_wins = the_number_of_wins_to_use;
	}
	
	
	public void is_told()
	{
		System.out.println(
			"The deck " + this.deck.provides_its_name() + " has " + this.number_of_losses + " losses and " + this.number_of_wins + " wins."
		);
	}
}
