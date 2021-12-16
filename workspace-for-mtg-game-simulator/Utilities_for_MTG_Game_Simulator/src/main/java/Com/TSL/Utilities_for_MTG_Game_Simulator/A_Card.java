package Com.TSL.Utilities_for_MTG_Game_Simulator;


public abstract class A_Card
{
	private String expansion;
	private String name;
	private String type;
	
	
	protected A_Card(String the_expansion_to_use, String the_name_to_use, String the_type_to_use) {
		this.expansion = the_expansion_to_use;
		this.name = the_name_to_use;
		this.type = the_type_to_use;
	}
	
	
	public String provides_its_name() {
		return this.name;
	}
	
	
	public String provides_its_type() {
		return this.type;
	}
	
	
	@Override
	public String toString() {
		return this.name;
	}
}
