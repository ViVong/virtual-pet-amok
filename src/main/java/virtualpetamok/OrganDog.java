package virtualpetamok;

public class OrganDog extends Organic implements DogInter{
	OrganDog(String name){
		super(name);
	}
	
	public void walkDog() {
		happy += 10;
		health += 1;
	}
	
}
