package Com.TSL.The_Utilities_For_The_MTG_Game_Simulator;


public abstract class a_card
{
	private String Expansion;
	private String Name;
	private String Type;
	private a_mana_cost Mana_Cost;
	
	
	protected a_card(String The_Expansion_To_Use, a_mana_cost The_Mana_Cost_To_Use, String The_Name_To_Use, String The_Type_To_Use) {
		this.Expansion = The_Expansion_To_Use;
		this.Mana_Cost = The_Mana_Cost_To_Use;
		this.Name = The_Name_To_Use;
		this.Type = The_Type_To_Use;
	}
	
	public a_mana_cost provides_its_mana_cost() {
		return this.Mana_Cost;
	}
	
	public String provides_its_name() {
		return this.Name;
	}
	
	
	public String provides_its_type() {
		return this.Type;
	}
	
	
	@Override
	public String toString() {
		return this.Name;
	}
}
