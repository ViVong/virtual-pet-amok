package virtualpetamok;

import java.util.Random;

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
		Random generator = new Random();
		hunger += 2;
		thirst += 3;
		health --;
		happy --;
		return generator.nextInt(5) + 1;
	}
	
}
