package Com.TSL.Utilities_for_MTG_Game_Simulator;


public class A_Mana_Cost
{
	private int number_of_black_mana;
	private int number_of_blue_mana;
	private int number_of_colorless_mana;
	private int number_of_green_mana;
	private int number_of_red_mana;
	private int number_of_white_mana;
	
	public A_Mana_Cost(
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
}
