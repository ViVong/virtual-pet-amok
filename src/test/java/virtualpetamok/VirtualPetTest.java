package virtualpetamok;

import org.junit.Test;

public class VirtualPetTest {
	
	@Test
	public void shouldInitPets() {
		OrganCat oCat = new OrganCat("Koby");
		OrganCat oDog = new OrganCat("Toby");
		RoboCat rCat = new RoboCat("Yoby");
		RoboCat rDog = new RoboCat("BonJoby");
	}
	
	@Test
	public void shouldGetOil() {
		
	}
}
