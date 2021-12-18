package Com.TSL.Utilities_for_MTG_Game_Simulator;


public class A_Mana_Pool extends A_Mana_Cost {

	public A_Mana_Pool(
		int the_number_of_black_mana_to_use,
		int the_number_of_blue_mana_to_use,
		int the_number_of_colorless_mana_to_use,
		int the_number_of_green_mana_to_use,
		int the_number_of_red_mana_to_use,
		int the_number_of_white_mana_to_use
	)
	{
		super(
			the_number_of_black_mana_to_use,
			the_number_of_blue_mana_to_use,
			the_number_of_colorless_mana_to_use,
			the_number_of_green_mana_to_use,
			the_number_of_red_mana_to_use,
			the_number_of_white_mana_to_use
		);
	}
	
	public A_Mana_Pool clones_itself() {
		return
			new A_Mana_Pool(
				this.number_of_black_mana,
				this.number_of_blue_mana,
				this.number_of_colorless_mana,
				this.number_of_green_mana,
				this.number_of_red_mana,
				this.number_of_white_mana
			);
	}
	
	public void increases_by_one_black_mana() {
		this.number_of_black_mana++;
	}
	
	public void increases_by_one_blue_mana() {
		this.number_of_blue_mana++;
	}
	
	public void increases_by_one_colorless_mana() {
		this.number_of_colorless_mana++;
	}
	
	public void increases_by_one_green_mana() {
		this.number_of_green_mana++;
	}
	
	public void increases_by_one_red_mana() {
		this.number_of_red_mana++;
	}
	
	public void increases_by_one_white_mana() {
		this.number_of_white_mana++;
	}
	
	public void decreases_by(A_Mana_Cost the_mana_cost) {
		this.number_of_black_mana -= the_mana_cost.provides_its_number_of_black_mana();
		this.number_of_blue_mana -= the_mana_cost.provides_its_number_of_blue_mana();
		this.number_of_colorless_mana -= the_mana_cost.provides_its_number_of_colorless_mana();
		this.number_of_green_mana -= the_mana_cost.provides_its_number_of_green_mana();
		this.number_of_red_mana -= the_mana_cost.provides_its_number_of_red_mana();
		this.number_of_white_mana -= the_mana_cost.provides_its_number_of_white_mana();
	}
	
	public boolean is_sufficient_for(A_Mana_Cost the_mana_cost) {
		
		A_Mana_Pool the_clone = this.clones_itself();
		the_clone.decreases_by(the_mana_cost);
		
		if ((the_clone.provides_its_number_of_black_mana() < 0) ||
			(the_clone.provides_its_number_of_blue_mana() < 0) ||
			(the_clone.provides_its_number_of_colorless_mana() < 0) ||
			(the_clone.provides_its_number_of_green_mana() < 0) ||
			(the_clone.provides_its_number_of_red_mana() < 0) ||
			(the_clone.provides_its_number_of_white_mana() < 0)) {
			return false;
		}
		
		if ((the_clone.provides_its_number_of_colorless_mana() +
			 the_clone.provides_its_number_of_black_mana() +
			 the_clone.provides_its_number_of_blue_mana() +
			 the_clone.provides_its_number_of_green_mana() +
			 the_clone.provides_its_number_of_red_mana() +
			 the_clone.provides_its_number_of_white_mana())
			< 0) {
			return false;
		}
		
		return true;
		
	}
}
