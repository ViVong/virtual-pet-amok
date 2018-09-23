package virtualpetamok;

public abstract class Organic extends VirtualPet{
	private int hunger =30, thirst = 30, clean = 20;
	
	Organic(String name){
		super(name);
	}
	
	public void feedPet() {
		hunger -= 5;
		health += 5;
		happy += 3;
	}

	public void waterPet() {
		thirst -= 5;
		health += 3;
		happy += 2;
	}
	
	public void cleanPets() {
		clean += 20;
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
	
	public int getWaste() {
		return clean;
	}
	
	
}
