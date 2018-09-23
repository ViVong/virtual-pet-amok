package virtualpetamok;

public class RoboCat extends Robotic implements Tick  {
	RoboCat(String name){
		super(name);
	}

	@Override
	public int tick() {
		oil -= 2;
		health --;
		happy --;
		return 0;
	}
}
