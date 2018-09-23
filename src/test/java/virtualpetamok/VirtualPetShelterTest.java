package virtualpetamok;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class VirtualPetShelterTest {
	
	@Test
	public void shouldOilAllRobots() {
		VirtualPetShelter shelter = new VirtualPetShelter();
		RoboCat rCat = new RoboCat("Yoby");
		shelter.admit(rCat);
		RoboDog rDog = new RoboDog("BonJoby");
		shelter.admit(rDog);
		assertTrue(rCat.getOil() == 20);
		shelter.oilRoboPets();
		assertTrue(rDog.getOil() == 25);
		assertTrue(rCat.getOil() == 25);
	}
}
