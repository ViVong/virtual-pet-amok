package virtualpetamok;

public abstract class Organic extends VirtualPet implements DogInter {
	int hunger =30, thirst = 30, clean = 50;
	
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
	public int getClean() {
		return clean;
	}
	
	public void walkDog() {
		happy += 5;
	}
}
