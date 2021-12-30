package Com.TSL.Utilities_for_MTG_Game_Simulator;


import java.util.HashMap;


public class A_Dictionary_Of_Permanent_Names_And_Encapsulators_For_A_Method_To_Provide_An_Array_Of_Possible_Mana_Contributions {

	
	private HashMap<String, An_Encapsulator_For_A_Method_To_Provide_An_Array_Of_Possible_Mana_Contributions> hash_map = new HashMap<String, An_Encapsulator_For_A_Method_To_Provide_An_Array_Of_Possible_Mana_Contributions>();
	
	
	public A_Dictionary_Of_Permanent_Names_And_Encapsulators_For_A_Method_To_Provide_An_Array_Of_Possible_Mana_Contributions() {

		this.hash_map.put(
			"Swamp",
			new An_Encapsulator_For_A_Method_To_Provide_An_Array_Of_Possible_Mana_Contributions() {
				@Override
				public A_Mana_Contribution[] provides_an_array_of_possible_mana_contributions() throws RuntimeException {
					return new A_Mana_Contribution[] { new A_Mana_Contribution(1, 0, 0, 0, 0, 0) };
				}
			}
		);
		
		this.hash_map.put(
			"Island",
			new An_Encapsulator_For_A_Method_To_Provide_An_Array_Of_Possible_Mana_Contributions() {
				@Override
				public A_Mana_Contribution[] provides_an_array_of_possible_mana_contributions() throws RuntimeException {
					return new A_Mana_Contribution[] { new A_Mana_Contribution(0, 1, 0, 0, 0, 0) };
				}
			}
		);
		
		this.hash_map.put(
			"Forest",
			new An_Encapsulator_For_A_Method_To_Provide_An_Array_Of_Possible_Mana_Contributions() {
				@Override
				public A_Mana_Contribution[] provides_an_array_of_possible_mana_contributions() throws RuntimeException {
					return new A_Mana_Contribution[] { new A_Mana_Contribution(0, 0, 0, 1, 0, 0) };
				}
			}
		);
		
		this.hash_map.put(
			"Mountain",
			new An_Encapsulator_For_A_Method_To_Provide_An_Array_Of_Possible_Mana_Contributions() {
				@Override
				public A_Mana_Contribution[] provides_an_array_of_possible_mana_contributions() throws RuntimeException {
					return new A_Mana_Contribution[] { new A_Mana_Contribution(0, 0, 0, 0, 1, 0) };
				}
			}
		);
		
		this.hash_map.put(
			"Plains",
			new An_Encapsulator_For_A_Method_To_Provide_An_Array_Of_Possible_Mana_Contributions() {
				@Override
				public A_Mana_Contribution[] provides_an_array_of_possible_mana_contributions() throws RuntimeException {
					return new A_Mana_Contribution[] { new A_Mana_Contribution(0, 0, 0, 0, 0, 1) };
				}
			}
		);
		
	}
	
	
	public An_Encapsulator_For_A_Method_To_Provide_An_Array_Of_Possible_Mana_Contributions provides_the_encapsulator_for_a_method_to_provide_an_array_of_possible_mana_contributions_corresponding_to(String The_Permanent_Name) {
		
		return this.hash_map.get(The_Permanent_Name);
		
	}
	
}