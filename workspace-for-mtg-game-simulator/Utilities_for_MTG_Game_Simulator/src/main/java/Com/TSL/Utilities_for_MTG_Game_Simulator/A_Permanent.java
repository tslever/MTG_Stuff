package Com.TSL.Utilities_for_MTG_Game_Simulator;


public abstract class A_Permanent {

	private boolean tapped_status;
	private String name;
	
	public A_Permanent(String the_name_to_use, boolean the_tapped_status_to_use) {
		this.name = the_name_to_use;
		this.tapped_status = the_tapped_status_to_use;
	}
	
	public boolean indicates_whether_it_is_tapped() {
		return this.tapped_status;
	}
	
	public void untaps() {
		this.tapped_status = false;
	}
	
}
