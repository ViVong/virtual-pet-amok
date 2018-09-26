package virtualpetamok;

import java.util.HashMap;
import java.util.Random;

public class VirtualPetShelter {
	HashMap<String, VirtualPet> shelter = new HashMap<String, VirtualPet>();
	
	public HashMap<String, VirtualPet> shelter(){
		return shelter;
	}
	public VirtualPet onePet(String name) {
		return shelter.get(name);
	}
	
	public void feedPets() {
		for (VirtualPet pet: shelter.values()){
			if (pet instanceof Organic) {
				((Organic) pet).feedPet();
			}
		}
	}
	public void waterPets() {
		for (VirtualPet pet: shelter.values()){
			if (pet instanceof Organic) {
				((Organic) pet).waterPet();
			}
		}
	}
	
	public void admit(VirtualPet pet) {
		shelter.put(pet.name.toLowerCase(), pet);
	}
	
	public void adopt(String name) {
		shelter.remove(name);
	}
	
	public void cleanCages() {
		for (VirtualPet pet: shelter.values()){
			if (pet instanceof OrganDog) {
				((OrganDog) pet).cleanPets();
			}
		}
	}
	
	public void cleanLitter() {
		for (VirtualPet pet: shelter.values()){
			if (pet instanceof OrganCat) {
				((OrganCat) pet).cleanPets();
			}
		}
	}
	
	public void oilRoboPets() {
		for (VirtualPet pet: shelter.values()){
			if (pet instanceof Robotic) {
				((Robotic) pet).oilPet();
			}
		}
	}
	
	public void tick() {
		Random random = new Random();
		int litterbox = 0;
		for (VirtualPet pet: shelter.values()){
			if (pet instanceof OrganDog) {
				((OrganDog) pet).addWaste(((OrganDog) pet).tick());
				if (random.nextInt(49)+1 > pet.happy) {
					((OrganDog) pet).addWaste(4);
				}
			}
			else if (pet instanceof OrganCat) {
				litterbox += ((OrganCat) pet).tick();
			}
			else if (pet instanceof RoboDog) {
				((RoboDog) pet).tick();
			}
			else if (pet instanceof RoboCat) {
				((RoboCat) pet).tick();
			}
		}
		for (VirtualPet pet: shelter.values()){
			if (pet instanceof OrganCat) {
				((OrganCat) pet).addWaste(litterbox);
			}
		}
	}
}
