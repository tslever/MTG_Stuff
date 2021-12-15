package Com.TSL.Utilities_for_MTG_Game_Simulator;


public class An_Enchantment_Card extends A_Card {

	private A_Mana_Cost mana_cost;
	private String rarity;
	private String[] text;
	
	
	public An_Enchantment_Card(
		String the_expansion_to_use,
		A_Mana_Cost the_mana_cost_to_use,
		String the_name_to_use,
		String the_rarity_to_use,
		String[] the_text_to_use,
		String the_type_to_use
	) {
		
		super(the_expansion_to_use, the_name_to_use, the_type_to_use);
		
		this.mana_cost = the_mana_cost_to_use;
		this.rarity = the_rarity_to_use;
		this.text = the_text_to_use;
		
	}
}
