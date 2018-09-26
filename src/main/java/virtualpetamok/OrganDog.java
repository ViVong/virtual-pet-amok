package virtualpetamok;

public class OrganDog extends Organic implements DogInter, Tick {
	OrganDog(String name){
		super(name);
	}
	
	@Override
	public void walkDog() {
		happy += 10;
		health += 1;
	}

	@Override
	public int tick() {
		hunger += 2;
		thirst += 3;
		health --;
		happy --;
		return 4;
	}
	
}
