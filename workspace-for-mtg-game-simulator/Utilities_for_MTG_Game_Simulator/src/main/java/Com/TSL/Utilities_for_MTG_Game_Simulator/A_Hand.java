package Com.TSL.Utilities_for_MTG_Game_Simulator;

import java.util.ArrayList;

public class A_Hand {

	private ArrayList<An_Artifact_Card> list_of_artifact_cards;
	private ArrayList<A_Creature_Card> list_of_creature_cards;
	private ArrayList<An_Enchantment_Card> list_of_enchantment_cards;
	private ArrayList<An_Instant_Card> list_of_instant_cards;
	private ArrayList<A_Land_Card> list_of_land_cards;
	private ArrayList<A_Planeswalker_Card> list_of_planeswalker_cards;
	private ArrayList<A_Sorcery_Card> list_of_sorcery_cards;
	
	
	public A_Hand() {
		this.list_of_artifact_cards = new ArrayList<An_Artifact_Card>();
		this.list_of_creature_cards = new ArrayList<A_Creature_Card>();
		this.list_of_enchantment_cards = new ArrayList<An_Enchantment_Card>();
		this.list_of_instant_cards = new ArrayList<An_Instant_Card>();
		this.list_of_land_cards = new ArrayList<A_Land_Card>();
		this.list_of_planeswalker_cards = new ArrayList<A_Planeswalker_Card>();
		this.list_of_sorcery_cards = new ArrayList<A_Sorcery_Card>();
	}
	
	
	public ArrayList<A_Land_Card> provides_its_list_of_land_cards() {
		return this.list_of_land_cards;
	}
	
	
	public int provides_its_number_of_cards() {
		return
			this.list_of_artifact_cards.size() +
			this.list_of_creature_cards.size() +
			this.list_of_enchantment_cards.size() +
			this.list_of_instant_cards.size() +
			this.list_of_land_cards.size() +
			this.list_of_planeswalker_cards.size() +
			this.list_of_sorcery_cards.size();
	}
	
	
	public int provides_its_number_of_land_cards() {
		return this.list_of_land_cards.size();
	}
	
	
	public A_Land_Card provides_the_land_card_at_index(int the_index_of_the_land_card) {
		return this.list_of_land_cards.remove(the_index_of_the_land_card);
	}
	
	
	public void receives(A_Card the_card) {
		switch (the_card.provides_its_type()) {
			case "Artifact":
				this.list_of_artifact_cards.add((An_Artifact_Card)the_card);
				break;
			case "Basic Land":
				this.list_of_land_cards.add((A_Land_Card)the_card);
				break;
			case "Creature":
				this.list_of_creature_cards.add((A_Creature_Card)the_card);
				break;
			case "Enchantment":
				this.list_of_enchantment_cards.add((An_Enchantment_Card)the_card);
				break;
			case "Instant":
				this.list_of_instant_cards.add((An_Instant_Card)the_card);
				break;
			case "Planeswalker":
				this.list_of_planeswalker_cards.add((A_Planeswalker_Card)the_card);
				break;
			case "Sorcery":
				this.list_of_sorcery_cards.add((A_Sorcery_Card)the_card);
				break;
		}
	}
	
	
	@Override
	public String toString() {
		StringBuilder the_string_builder = new StringBuilder("Hand");
		for (An_Artifact_Card the_artifact_card : this.list_of_artifact_cards) {
			the_string_builder.append("\n");
			the_string_builder.append(the_artifact_card);
		}
		for (A_Creature_Card the_creature_card : this.list_of_creature_cards) {
			the_string_builder.append("\n");
			the_string_builder.append(the_creature_card);
		}
		for (An_Enchantment_Card the_enchantment_card : this.list_of_enchantment_cards) {
			the_string_builder.append("\n");
			the_string_builder.append(the_enchantment_card);
		}
		for (An_Instant_Card the_instant_card : this.list_of_instant_cards) {
			the_string_builder.append("\n");
			the_string_builder.append(the_instant_card);
		}
		for (A_Land_Card the_land_card : this.list_of_land_cards) {
			the_string_builder.append("\n");
			the_string_builder.append(the_land_card);
		}
		for (A_Planeswalker_Card the_planeswalker_card : this.list_of_planeswalker_cards) {
			the_string_builder.append("\n");
			the_string_builder.append(the_planeswalker_card);
		}
		for (A_Sorcery_Card the_sorcery_card : this.list_of_sorcery_cards) {
			the_string_builder.append("\n");
			the_string_builder.append(the_sorcery_card);
		}

		return the_string_builder.toString();
	}
	
}
