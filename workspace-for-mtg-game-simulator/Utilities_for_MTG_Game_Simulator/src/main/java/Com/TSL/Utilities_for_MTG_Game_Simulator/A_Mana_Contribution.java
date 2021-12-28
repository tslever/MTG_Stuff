package Com.TSL.Utilities_for_MTG_Game_Simulator;


public class A_Mana_Contribution extends A_Mana_Set
{	
	public A_Mana_Contribution(
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

}