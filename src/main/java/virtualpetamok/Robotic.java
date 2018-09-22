package virtualpetamok;

public abstract class Robotic extends VirtualPet implements DogInter {
	private int oil = 20;
	
	Robotic(String name){
		super(name);
	}
	
	public int getOil() {
		return oil;
	}
	
	public void oilPet() {
		oil += 5;
	}
	
	public void walkDog() {
		happy += 5;
	}
	
}
