package Com.TSL.Utilities_for_MTG_Game_Simulator;


import java.util.ArrayList;


public class A_Part_Of_The_Battlefield {

	private ArrayList<An_Artifact> list_of_artifacts;
	private ArrayList<A_Creature> list_of_creatures;
	private ArrayList<An_Enchantment> list_of_enchantments;
	private ArrayList<A_Land> list_of_lands;
	private ArrayList<A_Planeswalker> list_of_planeswalkers;
	
	
	public A_Part_Of_The_Battlefield() {
		this.list_of_artifacts = new ArrayList<An_Artifact>();
		this.list_of_creatures = new ArrayList<A_Creature>();
		this.list_of_enchantments = new ArrayList<An_Enchantment>();
		this.list_of_lands = new ArrayList<A_Land>();
		this.list_of_planeswalkers = new ArrayList<A_Planeswalker>();
	}
	
	
	public ArrayList<An_Artifact> provides_its_list_of_artifacts() {
		return this.list_of_artifacts;
	}
	
	
	public ArrayList<A_Creature> provides_its_list_of_creatures() {
		return this.list_of_creatures;
	}
	
	
	public ArrayList<An_Enchantment> provides_its_list_of_enchantments() {
		return this.list_of_enchantments;
	}
	
	
	public ArrayList<A_Land> provides_its_list_of_lands() {
		return this.list_of_lands;
	}
	
	
	public ArrayList<A_Planeswalker> provides_its_list_of_planeswalkers() {
		return this.list_of_planeswalkers;
	}
	
	public int provides_its_number_of_cards() {
		return
			this.list_of_artifacts.size() +
			this.list_of_creatures.size() +
			this.list_of_enchantments.size() +
			this.list_of_lands.size() +
			this.list_of_planeswalkers.size();
	}
	
	
	@Override
	public String toString() {
		StringBuilder the_string_builder = new StringBuilder("Part of the Battlefield");
		for (An_Artifact the_artifact : this.list_of_artifacts) {
			the_string_builder.append("\n");
			the_string_builder.append(the_artifact);
		}
		for (A_Creature the_creature : this.list_of_creatures) {
			the_string_builder.append("\n");
			the_string_builder.append(the_creature);
		}
		for (An_Enchantment the_enchantment : this.list_of_enchantments) {
			the_string_builder.append("\n");
			the_string_builder.append(the_enchantment);
		}
		for (A_Land the_land : this.list_of_lands) {
			the_string_builder.append("\n");
			the_string_builder.append(the_land);
		}
		for (A_Planeswalker the_planeswalker : this.list_of_planeswalkers) {
			the_string_builder.append("\n");
			the_string_builder.append(the_planeswalker);
		}

		return the_string_builder.toString();
	}
	
}
