package virtualpetamok;

public class RoboDog extends Robotic implements DogInter, Tick {
	RoboDog(String name){
		super(name);
	}
	
	@Override
	public void walkDog() {
		happy += 10;
	}

	@Override
	public int tick() {
		oil -= 2;
		health --;
		happy --;
		return 0;
	}
}