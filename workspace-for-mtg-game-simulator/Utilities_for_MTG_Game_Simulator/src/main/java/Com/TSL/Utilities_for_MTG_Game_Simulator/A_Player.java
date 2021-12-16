package Com.TSL.Utilities_for_MTG_Game_Simulator;


import java.util.ArrayList;
import org.apache.commons.math3.random.RandomDataGenerator;


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
	private boolean has_priority;
	private int index_of_the_present_turn;
	private int life;
	private ArrayList<A_Permanent> list_of_permanents_that_should_be_untapped;
	private String name;
	private A_Part_Of_The_Battlefield part_of_the_battlefield;
	private boolean was_starting_player;
	
	
	/** Rule 103.3:
	 * Each player begins the game with a starting life total of 20.
	 */
	
	public A_Player(A_Deck the_deck_to_use, String the_name_to_use)
	{
		this.deck = the_deck_to_use;
		this.exile = new An_Exile();
		this.graveyard = new A_Graveyard();
		this.hand = new A_Hand();
		this.has_priority = false;
		this.index_of_the_present_turn = 0;
		this.life = 20;
		this.list_of_permanents_that_should_be_untapped = new ArrayList<A_Permanent>();
		this.name = the_name_to_use;
		this.part_of_the_battlefield = new A_Part_Of_The_Battlefield();
		this.was_starting_player = false;
	}
	
	
	public void becomes_the_starting_player() {
		this.was_starting_player = true;
	}
	
	
	public void completes_her_beginning_phase() {
		
		System.out.println(this.name + " is completing their beginning phase.");
		
		// Rule 500.5: When a phase or step begins, any effects scheduled to last "until" that phase or step expire.
		// Rule 500.6: When a phase or step begins, any abilities that trigger "at the beginning of" that phase or step trigger. They are put on the stack the next time a player would receive priority. (See rule 117, "Timing and Priority.")
		
		// Rule 501.1: The beginning phase consists of three steps, in this order: untap, upkeep, and draw.
		this.completes_her_untap_step();
		
		this.completes_her_upkeep_step();
		
		// Rule 103.7a: In a two-player game, the player who plays first skips the draw step (see rule 504, "Draw Step") of their first turn.
		if ((this.was_starting_player) && (this.index_of_the_present_turn == 0)) {
			System.out.println("    Because " + this.name + " is the starting player and this is the first turn, the draw step is skipped.");
		}
		else {
			this.completes_her_draw_step();
		}

		// Rule 500.2: A phase or step in which players receive priority ends when the stack is empty and all players pass in succession.
		// Rule 500.4: When a step or phase ends, any unused mana left in a player's mana pool empties. This turn-based action doesn't use the stack.
		// Rule 500.5: When a phase or step ends, any effects scheduled to last "until end of" that phase or step expire.
	}
	
	
	public void completes_her_combat_phase() {
		
		System.out.println(this.name + " is completing their combat phase.");
		
		// Rule 500.5: When a phase or step begins, any effects scheduled to last "until" that phase or step expire.
		// Rule 500.6: When a phase or step begins, any abilities that trigger "at the beginning of" that phase or step trigger. They are put on the stack the next time a player would receive priority. (See rule 117, "Timing and Priority.")
		
		// Rule 500.2: A phase or step in which players receive priority ends when the stack is empty and all players pass in succession.
		// Rule 500.4: When a step or phase ends, any unused mana left in a player's mana pool empties. This turn-based action doesn't use the stack.
		// Rule 500.5: When a phase or step ends, any effects scheduled to last "until end of" that phase or step expire... Effects that last "until end of combat" expire at the end of the combat phase.
	}
	
	
    public void completes_her_draw_step() {
		
		System.out.println("    " + this.name + " is completing their draw step.");
		
		// Rule 500.5: When a phase or step begins, any effects scheduled to last "until" that phase or step expire.
		// Rule 500.6: When a phase or step begins, any abilities that trigger "at the beginning of" that phase or step trigger. They are put on the stack the next time a player would receive priority. (See rule 117, "Timing and Priority.")
		
		// Rule 504.1: First, the active player draws a card. This turn-based action doesn't use the stack.
		this.draws();
		
		// Rule 504.2: Second, the active player gets priority. (See rule 117, "Timing and Priority.")
		this.has_priority = true;
		
		// Rule 500.2: A phase or step in which players receive priority ends when the stack is empty and all players pass in succession.
		// Rule 500.4: When a step or phase ends, any unused mana left in a player's mana pool empties. This turn-based action doesn't use the stack.
		// Rule 500.5: When a phase or step ends, any effects scheduled to last "until end of" that phase or step expire.
		
		this.has_priority = false;
	}
	
	
	public void completes_her_end_phase() {
		
		System.out.println(this.name + " is completing their end phase.");
		
		// Rule 500.5: When a phase or step begins, any effects scheduled to last "until" that phase or step expire.
		// Rule 500.6: When a phase or step begins, any abilities that trigger "at the beginning of" that phase or step trigger. They are put on the stack the next time a player would receive priority. (See rule 117, "Timing and Priority.")
		
		// Rule 500.2: A phase or step in which players receive priority ends when the stack is empty and all players pass in succession.
		// Rule 500.4: When a step or phase ends, any unused mana left in a player's mana pool empties. This turn-based action doesn't use the stack.
		// Rule 500.5: When a phase or step ends, any effects scheduled to last "until end of" that phase or step expire... Effects that last "until end of combat" expire at the end of the combat phase.
		
	}
	
	
	public void completes_her_precombat_main_phase() {
		
		System.out.println(this.name + " is completing their precombat main phase.");
		
		// Rule 500.5: When a phase or step begins, any effects scheduled to last "until" that phase or step expire.
		// Rule 500.6: When a phase or step begins, any abilities that trigger "at the beginning of" that phase or step trigger. They are put on the stack the next time a player would receive priority. (See rule 117, "Timing and Priority.")
		
		// Rule 505.4: Second, if the active player controls one or more Saga enchantments and it's the active player's precombat main phase, the active player puts a lore counter on each Saga they control. (See rule 714, "Saga Cards.") This turn-based action doesn't use the stack.

		// Rule 505.5: Third, the active player gets priority. (See rule 117, "Timing and Priority.")
		this.has_priority = true;
		
		// Rule 505.5b: During either main phase, the active player may play one land card from their hand if the stack is empty, if the player has priority, and if they haven't played a land this turn (unless an effect states the player may play additional lands). This action doesn't use the stack. Neither the land nor the action of playing the land is a spell or ability, so it can't be countered, and players can't respond to it with instants or activated abilities. (See rule 305, "Lands.")
		this.plays_a_land();
		
		// Rule 505.5a: [A] main phase is the only phase in which a player can normally cast artifact, creature, enchantment, planeswalker, and sorcery spells. The active player may cast these spells.
		
		// Rule 500.2: A phase or step in which players receive priority ends when the stack is empty and all players pass in succession.
		// Rule 505.2: The main phase has no steps, so a main phase ends when all players pass in succession while the stack is empty.
		// Rule 500.4: When a step or phase ends, any unused mana left in a player's mana pool empties. This turn-based action doesn't use the stack.
		// Rule 500.5: When a phase or step ends, any effects scheduled to last "until end of" that phase or step expire... Effects that last "until end of combat" expire at the end of the combat phase.
		
		this.has_priority = false;
	}
	
	
	public void completes_her_postcombat_main_phase() {
	
		System.out.println(this.name + " is completing their postcombat main phase.");
		
		// Rule 500.5: When a phase or step begins, any effects scheduled to last "until" that phase or step expire.
		// Rule 500.6: When a phase or step begins, any abilities that trigger "at the beginning of" that phase or step trigger. They are put on the stack the next time a player would receive priority. (See rule 117, "Timing and Priority.")
		
		// Rule 500.2: A phase or step in which players receive priority ends when the stack is empty and all players pass in succession.
		// Rule 500.4: When a step or phase ends, any unused mana left in a player's mana pool empties. This turn-based action doesn't use the stack.
		// Rule 500.5: When a phase or step ends, any effects scheduled to last "until end of" that phase or step expire... Effects that last "until end of combat" expire at the end of the combat phase.
	}
	
	
	public void completes_her_untap_step() {
		
		System.out.println("    " + this.name + " is completing their untap step.");
		
		// Rule 500.5: When a phase or step begins, any effects scheduled to last "until" that phase or step expire.
		// Rule 500.6: When a phase or step begins, any abilities that trigger "at the beginning of" that phase or step trigger. They are put on the stack the next time a player would receive priority. (See rule 117, "Timing and Priority.")
		
		// Rule 502.1: First, all phased-in permanents with phasing that the active player controls phase out, and all phased-out permanents that the active player controlled when they phased out phase in. This all happens simultaneously. This turn-based action doesn't use the stack. See rule 702.25, "Phasing."

		// Rule 502.2: Second, the active player determines which permanents they control will untap. Then they untap them all simultaneously. This turn-based action doesn't use the stack. Normally, all of a player's permanents untap, but effects can keep one or more of a player's permanents from untapping.
		this.determines_her_permanents_to_untap();
		this.untaps_her_permanents();
		
		// Rule 502.3: No player receives priority during the untap step, so no spells can be cast or resolve and no abilities can be activated or resolve. Any ability that triggers during this step will be held until the next time a player would receive priority, which is usually during the upkeep step (See rule 503, "Upkeep Step.")
		// Rule 500.3: A step in which no players receive priority ends when all specified actions that take place during that step are completed.
		// Rule 500.4: When a step or phase ends, any unused mana left in a player's mana pool empties. This turn-based action doesn't use the stack.
		// Rule 500.5: When a phase or step ends, any effects scheduled to last "until end of" that phase or step expire.
	}
	
	
	// TODO: Allow for adding abilities that triggered during the untap stap and abilities that triggered at the beginning of the upkeep step to the stack.
	// TODO: Allow for processing the stack.
	public void completes_her_upkeep_step() {
		
		System.out.println("    " + this.name + " is completing their upkeep step.");
		
		// Rule 500.5: When a phase or step begins, any effects scheduled to last "until" that phase or step expire.
		// Rule 500.6: When a phase or step begins, any abilities that trigger "at the beginning of" that phase or step trigger. They are put on the stack the next time a player would receive priority. (See rule 117, "Timing and Priority.")
		
		// Rule 503.1a: Any abilities that triggered during the untap step and any abilities that triggered at the beginning of the upkeep [step] are put onto the stack before the active player gets priority; the order in which they triggered doesn't matter. (See rule 603, "Handling Triggered Abilities.")
		
		// Rule 503.1: The upkeep step has no turn-based actions. Once it begins, the active player gets priority. (See rule 117, "Timing and Priority.")
		this.has_priority = true;
		
		// Rule 500.2: A phase or step in which players receive priority ends when the stack is empty and all players pass in succession.
		// Rule 500.4: When a step or phase ends, any unused mana left in a player's mana pool empties. This turn-based action doesn't use the stack.
		// Rule 500.5: When a phase or step ends, any effects scheduled to last "until end of" that phase or step expire.
		
		this.has_priority = false;
	}
	
	
	// TODO: Use discretion in determining permanents to untap.
	public void determines_her_permanents_to_untap() {
		
		System.out.println("        " + this.name + " is determining their permanents to untap.");
		
		this.list_of_permanents_that_should_be_untapped.clear();
		
		for (An_Artifact the_artifact : this.part_of_the_battlefield.provides_its_list_of_artifacts()) {
			if (the_artifact.indicates_whether_it_is_tapped()) {
				this.list_of_permanents_that_should_be_untapped.add(the_artifact);
			}
		}
		for (A_Creature the_creature : this.part_of_the_battlefield.provides_its_list_of_creatures()) {
			if (the_creature.indicates_whether_it_is_tapped()) {
				this.list_of_permanents_that_should_be_untapped.add(the_creature);
			}
		}
		for (An_Enchantment the_enchantment : this.part_of_the_battlefield.provides_its_list_of_enchantments()) {
			if (the_enchantment.indicates_whether_it_is_tapped()) {
				this.list_of_permanents_that_should_be_untapped.add(the_enchantment);
			}
		}
		for (A_Land the_land : this.part_of_the_battlefield.provides_its_list_of_lands()) {
			if (the_land.indicates_whether_it_is_tapped()) {
				this.list_of_permanents_that_should_be_untapped.add(the_land);
			}
		}
		for (A_Planeswalker the_planeswalker : this.part_of_the_battlefield.provides_its_list_of_planeswalkers()) {
			if (the_planeswalker.indicates_whether_it_is_tapped()) {
				this.list_of_permanents_that_should_be_untapped.add(the_planeswalker);
			}
		}
	}
	
	
	public void draws() {
		this.hand.receives(this.deck.provides_a_card());
		
		System.out.println(
			"After drawing, the deck of " + this.name + " has " + this.deck.provides_its_number_of_cards() + " cards and contains the following.\n" +
			this.deck + "\n"
		);
		System.out.println(
			"After drawing, the hand of " + this.name + " has " + this.hand.provides_its_number_of_cards() + " cards and contains the following.\n" +
			this.hand + "\n"
		);
	}
	
	
	/** Rule 103.4:
	 * Each player draws a number of cards equal to their starting hand size, which is normally seven.
	 */
	
	public void draws_a_hand() {
		for (int i = 0; i < STARTING_HAND_SIZE; i++) {
			this.draws();
		}
	}
	
	
	public void plays_a_land() {
		
		ArrayList<A_Land_Card> the_list_of_land_cards = this.hand.provides_its_list_of_land_cards();
		if (this.hand.provides_its_number_of_land_cards() > 0) {
			System.out.println("    " + this.name + " is playing a land.");
			int the_index_of_the_land_card_to_play = (new RandomDataGenerator()).nextInt(0, this.hand.provides_its_number_of_land_cards() - 1);
			A_Land_Card the_land_card_to_play = this.hand.provides_the_land_card_at_index(the_index_of_the_land_card_to_play);
			this.part_of_the_battlefield.provides_its_list_of_lands().add(new A_Land(the_land_card_to_play.provides_its_name(), false));
			
			System.out.println("After playing a land card, the hand of " + this.name + " has " + this.hand.provides_its_number_of_cards() + " cards and contains the following.\n" + this.hand);
			System.out.println("After playing a land card, the part of the battlefield of " + this.name + " has " + this.part_of_the_battlefield.provides_its_number_of_cards() + " cards and contains the following.\n" + this.part_of_the_battlefield);
		}
		
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
	
	
	public void takes_her_turn() {

		System.out.println(this.name + " is taking their turn.");
		
		this.completes_her_beginning_phase();
		this.completes_her_precombat_main_phase();
		this.completes_her_combat_phase();
		this.completes_her_postcombat_main_phase();
		this.completes_her_end_phase();
		
		// Rule 500.5: Effects that last "until end of turn" are subject to special rules; see rule 514.2.	
	}
	
	
	public void untaps_her_permanents() {
		
		System.out.println("        " + this.name + " is untapping their permanents.");
		
		for (A_Permanent the_permanent : this.list_of_permanents_that_should_be_untapped) {
			the_permanent.untaps();
		}
	}
}
