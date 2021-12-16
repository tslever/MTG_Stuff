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
	
	
	public ArrayList<An_Artifact> provides_its_artifacts() {
		return this.list_of_artifacts;
	}
	
	
	public ArrayList<A_Creature> provides_its_creatures() {
		return this.list_of_creatures;
	}
	
	
	public ArrayList<An_Enchantment> provides_its_enchantments() {
		return this.list_of_enchantments;
	}
	
	
	public ArrayList<A_Land> provides_its_lands() {
		return this.list_of_lands;
	}
	
	
	public ArrayList<A_Planeswalker> provides_its_planeswalkers() {
		return this.list_of_planeswalkers;
	}
	
}
