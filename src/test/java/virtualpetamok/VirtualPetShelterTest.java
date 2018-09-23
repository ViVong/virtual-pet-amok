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
	
	@Test
	public void shouldFeedAllOrganics() {
		VirtualPetShelter shelter = new VirtualPetShelter();
		OrganCat oCat = new OrganCat("Yoby");
		shelter.admit(oCat);
		OrganDog oDog = new OrganDog("BonJoby");
		shelter.admit(oDog);
		assertTrue(oCat.getHunger() == 30);
		shelter.feedPets();
		assertTrue(oDog.getHunger() == 25);
		assertTrue(oCat.getHunger() == 25);
	}
	
	@Test
	public void shouldWaterAllOrganics() {
		VirtualPetShelter shelter = new VirtualPetShelter();
		OrganCat oCat = new OrganCat("Yoby");
		shelter.admit(oCat);
		OrganDog oDog = new OrganDog("BonJoby");
		shelter.admit(oDog);
		assertTrue(oCat.getThirst() == 30);
		shelter.waterPets();
		assertTrue(oDog.getThirst() == 25);
		assertTrue(oCat.getThirst() == 25);
	}
	
	@Test
	public void shouldCleanAllCages() {
		VirtualPetShelter shelter = new VirtualPetShelter();
		OrganDog oDog = new OrganDog("BonJoby");
		shelter.admit(oDog);
		OrganDog orDog = new OrganDog("Khloby");
		shelter.admit(orDog);
		OrganCat oCat = new OrganCat("Yoby");
		shelter.admit(oCat);
		assertTrue(oDog.getClean() == 20);
		shelter.cleanCages();
		assertTrue(oDog.getClean() == 40);
		assertTrue(orDog.getClean() == 40);
		assertTrue(oCat.getClean() == 20);
	}
	
	@Test
	public void shouldCleanLitterBox() {
		VirtualPetShelter shelter = new VirtualPetShelter();
		OrganCat oCat = new OrganCat("HonKoby");
		shelter.admit(oCat);
		OrganCat orCat = new OrganCat("Schloby");
		shelter.admit(orCat);
		OrganDog oDog = new OrganDog("Doby");
		shelter.admit(oDog);
		assertTrue(oCat.getClean() == 20);
		shelter.cleanLitter();
		assertTrue(oCat.getClean() == 40);
		assertTrue(orCat.getClean() == 40);
		assertTrue(oDog.getClean() == 20);
	}
}
