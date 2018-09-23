package virtualpetamok;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class VirtualPetTest {
	
	@Test
	public void shouldInitPets() {
		OrganCat oCat = new OrganCat("Koby");
		OrganDog oDog = new OrganDog("Toby");
		RoboCat rCat = new RoboCat("Yoby");
		RoboDog rDog = new RoboDog("BonJoby");
		assertTrue(rCat.name.equals("Yoby"));
		assertTrue(oCat.name.equals("Koby"));
		assertTrue(rDog.name.equals("BonJoby"));
		assertTrue(oDog.name.equals("Toby"));
	}
	
	@Test
	public void shouldOilThenGetOil() {
		RoboCat rCat = new RoboCat("Yoby");
		RoboDog rDog = new RoboDog("BonJoby");
		assertTrue(rCat.getOil() == 20);
		rDog.oilPet();
		assertTrue(rDog.getOil() == 25);
	}
	
	@Test
	public void shouldFeedPetThenGetHunger() {
		OrganCat oCat = new OrganCat("Yoby");
		OrganDog oDog = new OrganDog("Toby");
		assertTrue(oCat.getHunger() == 30);
		oDog.feedPet();
		assertTrue(oDog.getHunger() == 25);
	}
	
	@Test
	public void shouldWaterPetThenGetThirst() {
		OrganCat oCat = new OrganCat("Yoby");
		OrganDog oDog = new OrganDog("Toby");
		assertTrue(oCat.getThirst() == 30);
		oDog.waterPet();
		assertTrue(oDog.getThirst() == 25);
	}
	
}
