package Com.TSL.Utilities_for_MTG_Game_Simulator;


import java.util.ArrayList;


public class A_Stack {

	private ArrayList<A_Spell> list_of_spells;
	
	public A_Stack() {
		this.list_of_spells = new ArrayList<A_Spell>();
	}
	
	public boolean contains_spells() {
		if (this.list_of_spells.size() > 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public A_Spell provides_its_top_spell() {
		return this.list_of_spells.remove(this.list_of_spells.size() - 1);
	}
	
	public void receives(A_Spell the_spell) {
		this.list_of_spells.add(the_spell);
	}
	
	@Override
	public String toString() {
		StringBuilder the_string_builder = new StringBuilder("The Stack");
		for (A_Spell the_spell : this.list_of_spells) {
			the_string_builder.append("\n");
			the_string_builder.append(the_spell);
		}
		return the_string_builder.toString();
	}
	
}
