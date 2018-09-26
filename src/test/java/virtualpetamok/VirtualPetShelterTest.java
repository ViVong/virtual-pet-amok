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
		assertTrue(rCat.getOil() == 30);
		shelter.oilRoboPets();
		assertTrue(rDog.getOil() == 35);
		assertTrue(rCat.getOil() == 35);
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
		assertTrue(oDog.getClean() == 45);
		shelter.cleanCages();
		assertTrue(oDog.getClean() == 50);
		assertTrue(orDog.getClean() == 50);
		assertTrue(oCat.getClean() == 45);
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
		assertTrue(oCat.getClean() == 45);
		shelter.cleanLitter();
		assertTrue(oCat.getClean() == 50);
		assertTrue(orCat.getClean() == 50);
		assertTrue(oDog.getClean() == 45);
	}
	
	@Test
	public void shouldGetWasteThenCleanLitterAndCage() {
		VirtualPetShelter shelter = new VirtualPetShelter();
		OrganCat oCat = new OrganCat("HonKoby");
		shelter.admit(oCat);
		OrganDog oDog = new OrganDog("Doby");
		shelter.admit(oDog);
		shelter.tick();
		assertTrue(oCat.getWaste() == 7);
		assertTrue(oDog.getWaste() == 9);
		OrganCat orCat = new OrganCat("Schloby");
		shelter.admit(orCat);
		shelter.tick();
		assertTrue(oCat.getWaste() == 11);
		assertTrue(oDog.getWaste() == 13);
	}
	
	@Test
	public void shouldTickProperly() {
		VirtualPetShelter shelter = new VirtualPetShelter();
		OrganCat oCat = new OrganCat("HonKoby");
		shelter.admit(oCat);
		OrganDog oDog = new OrganDog("Doby");
		shelter.admit(oDog);
		RoboCat rCat = new RoboCat("Yoby");
		shelter.admit(rCat);
		RoboDog rDog = new RoboDog("BonJoby");
		shelter.admit(rDog);
		shelter.tick();
		assertTrue(oCat.getHunger() == 32 && oDog.getHunger() == 32);
		assertTrue(oCat.getThirst() == 33 && oDog.getThirst() == 33);
		assertTrue(oCat.getHappy() == 49 && oDog.getHappy() == 49 && rCat.getHappy() == 49 && rDog.getHappy() == 49);
		assertTrue(oCat.getHealth() == 49 && oDog.getHealth() == 49 && rCat.getHealth() == 49 && rDog.getHealth() == 49);
		assertTrue(rCat.getOil() == 28 && rDog.getOil() == 28);
	}
}
