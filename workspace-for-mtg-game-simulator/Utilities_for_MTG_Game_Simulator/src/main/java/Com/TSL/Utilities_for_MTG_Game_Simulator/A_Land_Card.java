package Com.TSL.Utilities_for_MTG_Game_Simulator;


public class A_Land_Card extends A_Card {
	
	private String subtype;
	
	public A_Land_Card(String the_expansion_to_use, String the_name_to_use, String the_subtype_to_use, String the_type_to_use)
	{
		super(the_expansion_to_use, the_name_to_use, the_type_to_use);
		
		this.subtype = the_subtype_to_use;
	}
}
