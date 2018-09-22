package virtualpetamok;

public abstract class VirtualPet {
	public String name;
	protected int health = 50, happy = 50;
	
	VirtualPet(String name){
		this.name = name;
	}
	
	public int getHealth() {
		return health;
	}
	
	public int getHappy() {
		return happy;
	}
}
