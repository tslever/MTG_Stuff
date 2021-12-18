package Com.TSL.Utilities_for_MTG_Game_Simulator;


public class A_Mana_Cost extends A_Mana_Set
{	
	public A_Mana_Cost(
		int the_number_of_black_mana_to_use,
		int the_number_of_blue_mana_to_use,
		int the_number_of_colorless_mana_to_use,
		int the_number_of_green_mana_to_use,
		int the_number_of_red_mana_to_use,
		int the_number_of_white_mana_to_use
	)
	{
		super(
			the_number_of_black_mana_to_use,
			the_number_of_blue_mana_to_use,
			the_number_of_colorless_mana_to_use,
			the_number_of_green_mana_to_use,
			the_number_of_red_mana_to_use,
			the_number_of_white_mana_to_use
		);
	}
	
	public int provides_its_number_of_black_mana() {
		return this.number_of_black_mana;
	}
	
	public int provides_its_number_of_blue_mana() {
		return this.number_of_blue_mana;
	}
	
	public int provides_its_number_of_colorless_mana() {
		return this.number_of_colorless_mana;
	}
	
	public int provides_its_number_of_green_mana() {
		return this.number_of_green_mana;
	}
	
	public int provides_its_number_of_red_mana() {
		return this.number_of_red_mana;
	}
	
	public int provides_its_number_of_white_mana() {
		return this.number_of_white_mana;
	}
}
