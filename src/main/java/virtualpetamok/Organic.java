package virtualpetamok;

public abstract class Organic extends VirtualPet{
	private int hunger =30, thirst = 30;
	protected int litter;
	
	Organic(String name){
		super(name);
	}
	
	public void feedPet() {
		hunger -= 5;
	}

	public void waterPet() {
		thirst -= 5;
	}
	
	public int getHunger() {
		return hunger;
	}
	
	public int getThirst() {
		return thirst;
	}
}
