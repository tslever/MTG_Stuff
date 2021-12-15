package Com.TSL.Utilities_for_MTG_Game_Simulator;


public class A_Player
{
	
	/** Rule 103.4:
	 * Each player draws a number of cards equal to their starting hand size, which is normally seven.
	 */
	
	private static int STARTING_HAND_SIZE = 7;
	
	private A_Deck deck;
	private An_Exile exile;
	private A_Graveyard graveyard;
	private A_Hand hand;
	private boolean is_the_active_player;
	private int life;
	private String name;
	private A_Part_Of_The_Battlefield part_of_the_battlefield;
	
	
	/** Rule 103.3:
	 * Each player begins the game with a starting life total of 20.
	 */
	
	public A_Player(A_Deck the_deck_to_use, String the_name_to_use)
	{
		this.deck = the_deck_to_use;
		this.exile = new An_Exile();
		this.graveyard = new A_Graveyard();
		this.hand = new A_Hand();
		this.is_the_active_player = false;
		this.life = 20;
		this.name = the_name_to_use;
		this.part_of_the_battlefield = new A_Part_Of_The_Battlefield();
	}
	
	
	public void becomes_the_active_player() {
		this.is_the_active_player = true;
	}
	
	
	public void draws() {
		this.hand.receives(this.deck.provides_a_card());
	}
	
	
	/** Rule 103.4:
	 * Each player draws a number of cards equal to their starting hand size, which is normally seven.
	 */
	
	public void draws_a_hand() {
		for (int i = 0; i < STARTING_HAND_SIZE; i++) {
			this.draws();
		}
		System.out.println(
			"After drawing, the deck of " + this.name + " has " + this.deck.provides_its_number_of_cards() + " cards and contains the following.\n" +
			this.deck + "\n"
		);
		System.out.println(
			"After drawing, the hand of " + this.name + " has " + this.hand.provides_its_number_of_cards() + " cards and contains the following.\n" +
			this.hand + "\n"
		);
	}
	
	
	public String provides_her_name() {
		return this.name;
	}
	
	
	public void shuffles_her_deck() {
		this.deck.shuffles();
		System.out.println(
			"The deck of " + this.name + " after shuffling has " + this.deck.provides_its_number_of_cards() + " cards and is the following.\n" +
			this.deck + "\n"
		);
	}
}
