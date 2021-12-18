package Com.TSL.Utilities_for_MTG_Game_Simulator;


public class A_Creature_Card extends A_Card
{
	private int power;
	private String rarity;
	private String subtype;
	private String[] text;
	private int toughness;
	
	
	public A_Creature_Card(
		String the_expansion_to_use,
		A_Mana_Cost the_mana_cost_to_use,
		String the_name_to_use,
		int the_power_to_use,
		String the_rarity_to_use,
		String the_subtype_to_use,
		String[] the_text_to_use,
		int the_toughness_to_use,
		String the_type_to_use
	)
	{
		super(the_expansion_to_use, the_mana_cost_to_use, the_name_to_use, the_type_to_use);
		
		this.power = the_power_to_use;
		this.rarity = the_rarity_to_use;
		this.subtype = the_subtype_to_use;
		this.text = the_text_to_use;
		this.toughness = the_toughness_to_use;
	}
}
