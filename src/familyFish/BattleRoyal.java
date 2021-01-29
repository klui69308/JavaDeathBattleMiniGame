package familyFish;

public class BattleRoyal {

	public static void main(String[] args) {
		Warrior sophia = new Warrior("Sophia", 1000, 200, 100);
		Warrior kayu = new Warrior("Kayu", 500, 100, 50);
		Fight.startBattle(sophia, kayu);
	}

}
