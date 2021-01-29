package familyFish;

public class Warrior {
	protected String name = "Fighter";
	public int health = 0, attkMax = 0, blockMax = 0;
	
	public Warrior() {
		
	}
	public Warrior(String name, int health, int attkMax, int blockMax) {
		this.setName(name);
		this.health = health;
		this.attkMax = attkMax;
		this.blockMax = blockMax;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int attack() {
		return (int)(Math.random()* ((attkMax - 1) + 1)) + 1;
	}
	public int block() {
		return (int)(Math.random()* ((blockMax - 1) + 1)) + 1;
	}
}
