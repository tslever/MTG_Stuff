package Com.TSL.Utilities_for_MTG_Game_Simulator;



public class Two_Players {
	
	private A_Player first_player;
	private A_Player second_player;
	private A_Stack stack;
	
	
	public Two_Players(A_Player the_first_player_to_use, A_Player the_second_player_to_use) {
		
		this.first_player = the_first_player_to_use;
		this.second_player = the_second_player_to_use;
		this.stack = new A_Stack();
	}
	
	
	/** Rule 103.1:
	 * At the start of the game, the players determine which one of them will choose who takes the first turn. In the first game of a match (including a
	 * single-game match), the players may use any mutually agreeable method (flipping a coin, rolling dice, etc.) to do so.
	 */
	
	public void decide_the_starting_player() {
		
		if (A_Coin_Flip.random_value() == A_Coin_Flip.HEADS) {
			this.first_player.becomes_the_active_player();
			System.out.println(this.first_player.provides_her_name() + ", Player 1, is the starting player.\n");
		}
		else {
			this.second_player.becomes_the_active_player();
			System.out.println(this.second_player.provides_her_name() + ", Player 2, is the starting player.\n");
		}
		
	}
	
	
	public void draw_hands() {
		this.first_player.draws_a_hand();
		this.second_player.draws_a_hand();
	}
	
	
	public void play() {
		this.decide_the_starting_player();
		this.shuffle_their_decks();
		this.draw_hands();
	}
	
	
	/** Rule 103.2:
	 * After the starting player has been determined, each player shuffles their deck so that the cards are in a random order.
	 */
	
	public void shuffle_their_decks() {
		this.first_player.shuffles_her_deck();
		this.second_player.shuffles_her_deck();
	}

}