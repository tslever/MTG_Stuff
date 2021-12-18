package Com.TSL.Utilities_for_MTG_Game_Simulator;


public class A_Mana_Set
{
	protected int number_of_black_mana;
	protected int number_of_blue_mana;
	protected int number_of_colorless_mana;
	protected int number_of_green_mana;
	protected int number_of_red_mana;
	protected int number_of_white_mana;
	
	public A_Mana_Set(
		int the_number_of_black_mana_to_use,
		int the_number_of_blue_mana_to_use,
		int the_number_of_colorless_mana_to_use,
		int the_number_of_green_mana_to_use,
		int the_number_of_red_mana_to_use,
		int the_number_of_white_mana_to_use
	)
	{
		this.number_of_black_mana = the_number_of_black_mana_to_use;
		this.number_of_blue_mana = the_number_of_blue_mana_to_use;
		this.number_of_colorless_mana = the_number_of_colorless_mana_to_use;
		this.number_of_green_mana = the_number_of_green_mana_to_use;
		this.number_of_red_mana = the_number_of_red_mana_to_use;
		this.number_of_white_mana = the_number_of_white_mana_to_use;
	}
	
	@Override
	public String toString() {
		return
			"Mana Set" +
			"\nNumber of black mana: " + this.number_of_black_mana +
			"\nNumber of blue mana: " + this.number_of_blue_mana +
			"\nNumber of colorless mana: " + this.number_of_colorless_mana +
			"\nNumber of green mana: " + this.number_of_green_mana +
			"\nNumber of red mana: " + this.number_of_red_mana +
			"\nNumber of white mana: " + this.number_of_white_mana;
	}
	
	@Override
	public boolean equals(Object the_mana_set) {
		
		A_Mana_Set the_mana_set_to_compare = (A_Mana_Set)the_mana_set;
		
		return
			(this.number_of_black_mana == the_mana_set_to_compare.number_of_black_mana) &&
			(this.number_of_blue_mana == the_mana_set_to_compare.number_of_blue_mana) &&
			(this.number_of_colorless_mana == the_mana_set_to_compare.number_of_colorless_mana) &&
			(this.number_of_green_mana == the_mana_set_to_compare.number_of_green_mana) &&
			(this.number_of_red_mana == the_mana_set_to_compare.number_of_red_mana) &&
			(this.number_of_white_mana == the_mana_set_to_compare.number_of_white_mana);
	}
}
