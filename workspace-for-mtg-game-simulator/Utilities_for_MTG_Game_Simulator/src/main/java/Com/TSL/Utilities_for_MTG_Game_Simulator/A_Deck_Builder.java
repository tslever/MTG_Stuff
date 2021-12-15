package Com.TSL.Utilities_for_MTG_Game_Simulator;

import java.util.ArrayList;

public class A_Deck_Builder {

	public A_Deck provides_Keep_the_Peace() {
		
    	ArrayList<A_Card> the_list_of_cards_for_Keep_the_Peace = new ArrayList<A_Card>();
    	
    	for (int i = 0; i < 25; i++) {
    		the_list_of_cards_for_Keep_the_Peace.add(
    			new A_Land_Card(
    				"Innistrad: Crimson Vow",
    				"Plains",
    				"Plains",
    				"Basic Land"
    			)
    		);
    	}
    	// 25 cards
    	
    	for (int i = 0; i < 4; i++) {
    		the_list_of_cards_for_Keep_the_Peace.add(
    			new A_Creature_Card(
    				"Arena Base Set",
    				new A_Mana_Cost(0, 0, 0, 0, 0, 1),
    				"Charmed Stray",
    				1,
    				"Common",
    				"Cat",
    				new String[] {
    					"Lifelink",
    					"When Charmed Stray enters the battlefield, put a +1/+1 counter on each other creature you control named Charmed Stray."
    				},
    				1,
    				"Creature"
    			)
    		);
    	}
    	// 29 cards
    	
    	for (int i = 0; i < 4; i++) {
    		the_list_of_cards_for_Keep_the_Peace.add(
    			new An_Instant_Card(
    				"Arena Base Set",
    				new A_Mana_Cost(0, 0, 0, 0, 0, 1),
    				"Tactical Advantage",
    				"Common",
    				new String[] {
    					"Target blocking or blocked creature you control gets +2/+2 until end of turn."
    				},
    				"Instant"
    			)
    		);
    	}
    	// 33 cards
    	
    	for (int i = 0; i < 2; i++) {
    		the_list_of_cards_for_Keep_the_Peace.add(
    			new A_Creature_Card(
    				"Arena Base Set",
    				new A_Mana_Cost(0, 0, 1, 0, 0, 1),
    				"Fencing Ace",
    				1,
    				"Common",
    				"Human Soldier",
    				new String[] {
    					"Double strike"
    				},
    				1,
    				"Creature"
    			)
    		);
    	}
    	// 35 cards
    	
    	for (int i = 0; i < 4; i++) {
    		the_list_of_cards_for_Keep_the_Peace.add(
    			new A_Creature_Card(
    				"Arena Base Set",
    				new A_Mana_Cost(0, 0, 1, 0, 0, 1),
    				"Hallowed Priest",
    				1,
    				"Uncommon",
    				"Human Cleric",
    				new String[] {
    					"Whenever you gain life, put a +1/+1 counter on Hallowed Priest."
    				},
    				1,
    				"Creature"
    			)
    		);
    	}
    	// 39 cards
    	
    	for (int i = 0; i < 3; i++) {
    		the_list_of_cards_for_Keep_the_Peace.add(
    			new A_Creature_Card(
    				"Arena Base Set",
    				new A_Mana_Cost(0, 0, 1, 0, 0, 1),
    				"Impassioned Orator",
    				2,
    				"Common",
    				"Human Cleric",
    				new String[] {
    					"Whenever another creature enters the battlefield under your control, you gain 1 life."
    				},
    				2,
    				"Creature"
    			)
    		);
    	}
    	// 42 cards
    	
    	for (int i = 0; i < 2; i++) {
    		the_list_of_cards_for_Keep_the_Peace.add(
    			new A_Creature_Card(
    				"Arena Base Set",
    				new A_Mana_Cost(0, 0, 1, 0, 0, 1),
    				"Moorland Inquisitor",
    				2,
    				"Common",
    				"Human Soldier",
    				new String[] {
    					"[2W]: Moorland Inquisitor gains first strike until end of turn."
    				},
    				2,
    				"Creature"
    			)
    		);
    	}
    	// 44 cards
    	
    	for (int i = 0; i < 3; i++) {
    		the_list_of_cards_for_Keep_the_Peace.add(
    			new An_Enchantment_Card(
    				"Arena Base Set",
    				new A_Mana_Cost(0, 0, 1, 0, 0, 1),
    				"Pacifism",
    				"Common",
    				"Aura",
    				new String[] {
    					"Enchant creature",
    					"Enchanted creature can't attack or block."
    				},
    				"Enchantment"
    			)
    		);
    	}
    	// 47 cards
    	
    	for (int i = 0; i < 2; i++) {
    		the_list_of_cards_for_Keep_the_Peace.add(
    			new A_Creature_Card(
    				"Arena Base Set",
    				new A_Mana_Cost(0, 0, 2, 0, 0, 1),
    				"Angel of Vitality",
    				2,
    				"Uncommon",
    				"Angel",
    				new String[] {
    					"Flying",
    					"If you would gain life, you gain that much life plus 1 instead.",
    					"Angel of Vitality gets +2/+2 as long as you have 25 or more life."
    				},
    				2,
    				"Creature"
    			)
    		);
    	}
    	// 49 cards
    	
    	for (int i = 0; i < 2; i++) {
    		the_list_of_cards_for_Keep_the_Peace.add(
    			new A_Creature_Card(
    				"Arena Base Set",
    				new A_Mana_Cost(0, 0, 2, 0, 0, 2),
    				"Leonin Warleader",
    				4,
    				"Rare",
    				"Cat Soldier",
    				new String[] {
    					"Whenever Leonin Warleader attacks, create two 1/1 white Cat creature tokens with lifelink that are tapped and attacking."
    				},
    				4,
    				"Creature"
    			)
    		);
    	}
    	// 51 cards
    	
		the_list_of_cards_for_Keep_the_Peace.add(
			new An_Enchantment_Card(
				"Arena Base Set",
				new A_Mana_Cost(0, 0, 3, 0, 0, 2),
				"Angelic Reward",
				"Uncommon",
				"Aura",
				new String[] {
					"Enchant creature",
					"Enchanted creature get +3/+3 and has flying."
				},
				"Enchantment"
			)
		);
		// 52 cards
		
		the_list_of_cards_for_Keep_the_Peace.add(
			new A_Sorcery_Card(
				"Arena Base Set",
				new A_Mana_Cost(0, 0, 4, 0, 0, 1),
				"Bond of Discipline",
				"Uncommon",
				new String[] {
					"Tap all creatures your opponents control. Creatures you control gain lifelink until end of turn."
				},
				"Sorcery"
			)
		);
		// 53 cards
		
		the_list_of_cards_for_Keep_the_Peace.add(
			new An_Instant_Card(
				"Arena Base Set",
				new A_Mana_Cost(0, 0, 4, 0, 0, 1),
				"Confront the Assault",
				"Uncommon",
				new String[] {
					"Cast this spell only if a creature is attacking you.",
					"Create three 1/1 white Spirit creature tokens with flying."
				},
				"Instant"
			)
		);
		// 54 cards
		
		the_list_of_cards_for_Keep_the_Peace.add(
			new A_Creature_Card(
				"Arena Base Set",
				new A_Mana_Cost(0, 0, 3, 0, 0, 2),
				"Serra Angel",
				4,
				"Uncommon",
				"Angel",
				new String[] {
					"Flying, Vigilance"
				},
				4,
				"Creature"
			)
		);
		// 55 cards
		
		the_list_of_cards_for_Keep_the_Peace.add(
			new A_Creature_Card(
				"Arena Base Set",
				new A_Mana_Cost(0, 0, 3, 0, 0, 2),
				"Spiritual Guardian",
				3,
				"Common",
				"Spirit",
				new String[] {
					"When Spiritual Guardian enters the battlefield, you gain 4 life."
				},
				4,
				"Creature"
			)
		);
		// 56 cards
		
		the_list_of_cards_for_Keep_the_Peace.add(
			new A_Creature_Card(
				"Arena Base Set",
				new A_Mana_Cost(0, 0, 4, 0, 0, 2),
				"Angelic Guardian",
				5,
				"Rare",
				"Angel",
				new String[] {
					"Flying",
					"Whenever one or more creatures you control attack, they gain indestructible until end of turn."
				},
				5,
				"Creature"
			)
		);
		// 57 cards
		
    	for (int i = 0; i < 2; i++) {
    		the_list_of_cards_for_Keep_the_Peace.add(
    			new A_Creature_Card(
    				"Arena Base Set",
    				new A_Mana_Cost(0, 0, 4, 0, 0, 2),
    				"Inspiring Commander",
    				1,
    				"Rare",
    				"Human Soldier",
    				new String[] {
    					"Whenever another creature with power 2 or less enters the battlefield under your control, you gain 1 life and draw a card."
    				},
    				4,
    				"Creature"
    			)
    		);
    	}
    	// 59 cards
    	
		the_list_of_cards_for_Keep_the_Peace.add(
			new A_Creature_Card(
				"Arena Base Set",
				new A_Mana_Cost(0, 0, 5, 0, 0, 2),
				"Goring Ceratops",
				3,
				"Rare",
				"Dinosaur",
				new String[] {
					"Double strike",
					"Whenever Goring Ceratops attacks, other creatures you control gain double strike until end of turn."
				},
				3,
				"Creature"
			)
		);
    	// 60 cards
    	
    	return new A_Deck(the_list_of_cards_for_Keep_the_Peace, "Keep the Peace");
		
	}
	
}
