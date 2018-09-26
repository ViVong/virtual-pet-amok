package virtualpetamok;

public abstract class Organic extends VirtualPet{
	protected int hunger = 30, thirst = 30, clean = 45, waste = 5;
	
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
		clean += waste;
		waste = 0;
	}
	
	public void addWaste(int waste) {
		this.waste += waste;
		clean -= waste;
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
		return waste;
	}
	
}
