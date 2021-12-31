package Com.TSL.The_Utilities_For_The_MTG_Game_Simulator;


public class a_mana_set
{
	protected int Number_Of_Black_Mana;
	protected int Number_Of_Blue_Mana;
	protected int Number_Of_Colorless_Mana;
	protected int Number_Of_Green_Mana;
	protected int Number_Of_Red_Mana;
	protected int Number_Of_White_Mana;
	
	public a_mana_set(
		int The_Number_Of_Black_Mana_To_Use,
		int The_Number_Of_Blue_Mana_To_Use,
		int The_Number_Of_Colorless_Mana_To_Use,
		int The_Number_Of_Green_Mana_To_Use,
		int The_Number_Of_Red_Mana_To_Use,
		int The_Number_Of_White_Mana_To_Use
	)
	{
		this.Number_Of_Black_Mana = The_Number_Of_Black_Mana_To_Use;
		this.Number_Of_Blue_Mana = The_Number_Of_Blue_Mana_To_Use;
		this.Number_Of_Colorless_Mana = The_Number_Of_Colorless_Mana_To_Use;
		this.Number_Of_Green_Mana = The_Number_Of_Green_Mana_To_Use;
		this.Number_Of_Red_Mana = The_Number_Of_Red_Mana_To_Use;
		this.Number_Of_White_Mana = The_Number_Of_White_Mana_To_Use;
	}
	
	public int provides_its_number_of_black_mana() {
		return this.Number_Of_Black_Mana;
	}
	
	public int provides_its_number_of_blue_mana() {
		return this.Number_Of_Blue_Mana;
	}
	
	public int provides_its_number_of_colorless_mana() {
		return this.Number_Of_Colorless_Mana;
	}
	
	public int provides_its_number_of_green_mana() {
		return this.Number_Of_Green_Mana;
	}
	
	public int provides_its_number_of_red_mana() {
		return this.Number_Of_Red_Mana;
	}
	
	public int provides_its_number_of_white_mana() {
		return this.Number_Of_White_Mana;
	}
	
	@Override
	public String toString() {
		return
			"Mana Set" +
			"\nNumber of black mana: " + this.Number_Of_Black_Mana +
			"\nNumber of blue mana: " + this.Number_Of_Blue_Mana +
			"\nNumber of colorless mana: " + this.Number_Of_Colorless_Mana +
			"\nNumber of green mana: " + this.Number_Of_Green_Mana +
			"\nNumber of red mana: " + this.Number_Of_Red_Mana +
			"\nNumber of white mana: " + this.Number_Of_White_Mana;
	}
	
	@Override
	public boolean equals(Object The_Mana_Set) {
		
		a_mana_set The_Mana_Set_To_Compare = (a_mana_set)The_Mana_Set;
		
		return
			(this.Number_Of_Black_Mana == The_Mana_Set_To_Compare.Number_Of_Black_Mana) &&
			(this.Number_Of_Blue_Mana == The_Mana_Set_To_Compare.Number_Of_Blue_Mana) &&
			(this.Number_Of_Colorless_Mana == The_Mana_Set_To_Compare.Number_Of_Colorless_Mana) &&
			(this.Number_Of_Green_Mana == The_Mana_Set_To_Compare.Number_Of_Green_Mana) &&
			(this.Number_Of_Red_Mana == The_Mana_Set_To_Compare.Number_Of_Red_Mana) &&
			(this.Number_Of_White_Mana == The_Mana_Set_To_Compare.Number_Of_White_Mana);
	}
}
