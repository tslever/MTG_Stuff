package Com.TSL.Utilities_for_MTG_Game_Simulator;


public class An_Aura_Card extends An_Enchantment_Card {

	private String subtype;
	
	public An_Aura_Card(
		String the_expansion_to_use,
		A_Mana_Cost the_mana_cost_to_use,
		String the_name_to_use,
		String the_rarity_to_use,
		String the_subtype_to_use,
		String[] the_text_to_use,
		String the_type_to_use
	) {
		
		super(the_expansion_to_use, the_mana_cost_to_use, the_name_to_use, the_rarity_to_use, the_text_to_use, the_type_to_use);
		
		this.subtype = the_subtype_to_use;
	}
}