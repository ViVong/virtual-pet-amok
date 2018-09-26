package virtualpetamok;

public class OrganCat extends Organic implements Tick {
	OrganCat(String name){
		super(name);
	}
	
	@Override
	public int tick() {
		hunger += 2;
		thirst += 3;
		health --;
		happy --;
		return 2;
	}
}
