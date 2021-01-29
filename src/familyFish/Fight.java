package familyFish;

public class Fight {
	public static String getAttackResult(Warrior attacker, Warrior defender) {
		int attackerAmt = attacker.attack();
		int defenderAmt = defender.block();
		
		int dmgToDefender = attackerAmt - defenderAmt;
		if(dmgToDefender > 0) {
			defender.health -= dmgToDefender; 
		}
		else {
			dmgToDefender = 0;
		}
		System.out.printf("%s attacks %s and deals %d DMG\n", attacker.getName(), defender.getName(), dmgToDefender);
		System.out.printf("%s has %d health\n\n", defender.getName(), defender.health);
		
		if(defender.health <= 0) {
			System.out.printf("%s is defeated and %s is victorious\n", defender.getName(), attacker.getName());
			return "It is over! All hope is gone!";
		}
		else {
			return "Fight on";
		}
	}
	public static void startBattle(Warrior warrior1, Warrior warrior2) {
		while(true) {
			if (getAttackResult(warrior1, warrior2).equals("It is over! All hope is gone!")) {
				System.out.println("Game Over!");
				break;
			}
			if (getAttackResult(warrior2, warrior1).equals("It is over! All hope is gone!")) {
				System.out.println("Game Over!");
				break;
			}
		}
	}
}
