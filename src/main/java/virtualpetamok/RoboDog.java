package virtualpetamok;

public class RoboDog extends Robotic implements DogInter{
	RoboDog(String name){
		super(name);
	}
	
	public void walkDog() {
		happy += 10;
	}
}