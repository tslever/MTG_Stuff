package Com.TSL.The_Utilities_For_The_MTG_Game_Simulator;


import java.util.HashMap;


public class a_dictionary_of_permanent_names_and_encapsulators_for_a_method_to_provide_an_array_of_possible_mana_contributions {

	
	private HashMap<String, an_encapsulator_for_a_method_to_provide_an_array_of_possible_mana_contributions> Hash_Map = new HashMap<String, an_encapsulator_for_a_method_to_provide_an_array_of_possible_mana_contributions>();
	
	
	public a_dictionary_of_permanent_names_and_encapsulators_for_a_method_to_provide_an_array_of_possible_mana_contributions() {

		this.Hash_Map.put(
			"Swamp",
			new an_encapsulator_for_a_method_to_provide_an_array_of_possible_mana_contributions() {
				@Override
				public a_mana_contribution[] provides_an_array_of_possible_mana_contributions() throws RuntimeException {
					return new a_mana_contribution[] { new a_mana_contribution(1, 0, 0, 0, 0, 0) };
				}
			}
		);
		
		this.Hash_Map.put(
			"Island",
			new an_encapsulator_for_a_method_to_provide_an_array_of_possible_mana_contributions() {
				@Override
				public a_mana_contribution[] provides_an_array_of_possible_mana_contributions() throws RuntimeException {
					return new a_mana_contribution[] { new a_mana_contribution(0, 1, 0, 0, 0, 0) };
				}
			}
		);
		
		this.Hash_Map.put(
			"Forest",
			new an_encapsulator_for_a_method_to_provide_an_array_of_possible_mana_contributions() {
				@Override
				public a_mana_contribution[] provides_an_array_of_possible_mana_contributions() throws RuntimeException {
					return new a_mana_contribution[] { new a_mana_contribution(0, 0, 0, 1, 0, 0) };
				}
			}
		);
		
		this.Hash_Map.put(
			"Mountain",
			new an_encapsulator_for_a_method_to_provide_an_array_of_possible_mana_contributions() {
				@Override
				public a_mana_contribution[] provides_an_array_of_possible_mana_contributions() throws RuntimeException {
					return new a_mana_contribution[] { new a_mana_contribution(0, 0, 0, 0, 1, 0) };
				}
			}
		);
		
		this.Hash_Map.put(
			"Plains",
			new an_encapsulator_for_a_method_to_provide_an_array_of_possible_mana_contributions() {
				@Override
				public a_mana_contribution[] provides_an_array_of_possible_mana_contributions() throws RuntimeException {
					return new a_mana_contribution[] { new a_mana_contribution(0, 0, 0, 0, 0, 1) };
				}
			}
		);
		
	}
	
	
	public an_encapsulator_for_a_method_to_provide_an_array_of_possible_mana_contributions provides_the_encapsulator_for_a_method_to_provide_an_array_of_possible_mana_contributions_corresponding_to(String The_Permanent_Name) {
		
		return this.Hash_Map.get(The_Permanent_Name);
		
	}
	
}