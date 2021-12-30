package Com.TSL.Utilities_for_MTG_Game_Simulator;


public abstract class A_Permanent {

	private An_Encapsulator_For_A_Method_To_Provide_An_Array_Of_Possible_Mana_Contributions encapsulator_for_a_method_to_provide_an_array_of_possible_mana_contributions;
	private String name;
	private boolean tapped_status;
	
	public A_Permanent(An_Encapsulator_For_A_Method_To_Provide_An_Array_Of_Possible_Mana_Contributions the_encapsulator_to_use, String the_name_to_use, boolean the_tapped_status_to_use) {
		this.encapsulator_for_a_method_to_provide_an_array_of_possible_mana_contributions = the_encapsulator_to_use;
		this.name = the_name_to_use;
		this.tapped_status = the_tapped_status_to_use;
	}
	
	public boolean indicates_whether_it_is_tapped() {
		return this.tapped_status;
	}
	
	public String provides_its_name() {
		return this.name;
	}
	
	public void untaps() {
		this.tapped_status = false;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
	
	
	public A_Mana_Contribution[] provides_an_array_of_possible_mana_contributions() {
		
		return this.encapsulator_for_a_method_to_provide_an_array_of_possible_mana_contributions.provides_an_array_of_possible_mana_contributions();
		
	}
	
}