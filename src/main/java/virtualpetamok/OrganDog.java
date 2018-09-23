package virtualpetamok;

public class OrganDog extends Organic implements DogInter{
	int cage;
	
	OrganDog(String name){
		super(name);
	}
	
	public void walkDog() {
		happy += 10;
		
	}
	
}
