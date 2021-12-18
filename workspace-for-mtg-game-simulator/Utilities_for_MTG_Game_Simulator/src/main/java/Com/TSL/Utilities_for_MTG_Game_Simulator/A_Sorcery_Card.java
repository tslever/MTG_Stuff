package Com.TSL.Utilities_for_MTG_Game_Simulator;


public class A_Sorcery_Card extends A_Card {

	private String rarity;
	private String[] text;
	
	public A_Sorcery_Card(
		String the_expansion_to_use,
		A_Mana_Cost the_mana_cost_to_use,
		String the_name_to_use,
		String the_rarity_to_use,
		String[] the_text_to_use,
		String the_type_to_use
	) {
		super(the_expansion_to_use, the_mana_cost_to_use, the_name_to_use, the_type_to_use);
		
		this.rarity = the_rarity_to_use;
		this.text = the_text_to_use;
	}
	
}
