package virtualpetamok;

public abstract class Robotic extends VirtualPet{
	private int oil = 20;
	
	Robotic(String name){
		super(name);
	}
	
	public int getOil() {
		return oil;
	}
	
	public void oilPet() {
		oil += 5;
		health += 3;
		happy += 2;
	}
	
}
