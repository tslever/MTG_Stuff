package Com.TSL.The_Utilities_For_The_MTG_Game_Simulator;


public abstract class a_permanent {

	private an_encapsulator_for_a_method_to_provide_an_array_of_possible_mana_contributions Encapsulator_For_A_Method_To_Provide_An_Array_Of_Possible_Mana_Contributions;
	private String Name;
	private boolean Tapped_Status;
	
	public a_permanent(an_encapsulator_for_a_method_to_provide_an_array_of_possible_mana_contributions The_Encapsulator_To_Use, String The_Name_To_Use, boolean The_Tapped_Status_To_Use) {
		this.Encapsulator_For_A_Method_To_Provide_An_Array_Of_Possible_Mana_Contributions = The_Encapsulator_To_Use;
		this.Name = The_Name_To_Use;
		this.Tapped_Status = The_Tapped_Status_To_Use;
	}
	
	public boolean indicates_whether_it_is_tapped() {
		return this.Tapped_Status;
	}
	
	public String provides_its_name() {
		return this.Name;
	}
	
	public void untaps() {
		this.Tapped_Status = false;
	}
	
	@Override
	public String toString() {
		return this.Name;
	}
	
	
	public a_mana_contribution[] provides_an_array_of_possible_mana_contributions() {
		
		return this.Encapsulator_For_A_Method_To_Provide_An_Array_Of_Possible_Mana_Contributions.provides_an_array_of_possible_mana_contributions();
		
	}
	
}