package Com.TSL.Utilities_for_MTG_Game_Simulator;


import java.util.Random;


public enum A_Coin_Flip {

	HEADS,
	TAILS;
	
	
	public static A_Coin_Flip random_value() {
		
		return A_Coin_Flip.values()[new Random().nextInt(A_Coin_Flip.values().length)];
	}
}
