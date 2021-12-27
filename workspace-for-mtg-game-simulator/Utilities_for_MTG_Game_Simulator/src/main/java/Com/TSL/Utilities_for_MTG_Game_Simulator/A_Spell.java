package Com.TSL.Utilities_for_MTG_Game_Simulator;


public class A_Spell {

	private String name;
	private String type;
	
	public A_Spell(String the_name_to_use, String the_type_to_use) {
		this.name = the_name_to_use;
		this.type = the_type_to_use;
	}
	
	public String provides_its_name() {
		return this.name;
	}
	
}
