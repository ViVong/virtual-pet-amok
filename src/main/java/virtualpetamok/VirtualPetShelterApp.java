package virtualpetamok;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		int choice = 0;
		String name;
		VirtualPetShelter cleve = new VirtualPetShelter();
		Scanner input = new Scanner(System.in);
		cleve.admit(new OrganCat("Meowry"));
		cleve.admit(new OrganDog("Fido"));
		cleve.admit(new RoboCat("Mechow"));
		cleve.admit(new RoboDog("Rhido"));
		System.out.println("Welcome to Cleveland's new and improved petting zoo/robot shelter.");
		while (choice != 9) {
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();			
			}
			System.out.println("Our Current animals are: ");
			cleve.allPets();
			System.out.println("\nWhat would you like to do with them?\n\n1. Feed the organic Animals.\n2. Give the organic Animals water.\n3. Oil the robotic animals.\n4. Walk the dogs.\n5. Clean the cages.\n6. Clean the litterbox\n7. Adopt an animal.\n8. Admit an animal.\n9. Quit");
			choice = Integer.parseInt(input.next());
			switch (choice) {
				case 1:
					cleve.feedPets();
					System.out.println("You feed all the fleshy animals.");
					cleve.tick();
					break;
				case 2:
					cleve.waterPets();
					System.out.println("You let all the organics drinks some water.");
					cleve.tick();
					break;
				case 3:
					cleve.oilRoboPets();
					System.out.println("You splash a bit of oil on all the robots.");
					cleve.tick();
					break;
				case 4:
					cleve.walkDogs();
					System.out.println("You take all the dogs out for a nice walk.");
					cleve.tick();
					break;
				case 5:
					cleve.tick();
					cleve.cleanCages();
					System.out.println("You take all the dogs out and scrub their cages clean.");
					break;
				case 6:
					cleve.tick();
					cleve.cleanLitter();
					System.out.println("You empty out the litterbox and put in fresh litter.");
					break;
				case 7:
					System.out.println("Who would you like to adopt?");
					for (VirtualPet pet: cleve.shelter().values()) {
						if (pet instanceof OrganCat) {
							System.out.println(pet.name + " is a organic cat.");
						}
						else if (pet instanceof OrganDog) {
							System.out.println(pet.name + " is a organic dog.");
						}
						else if (pet instanceof RoboCat) {
							System.out.println(pet.name + " is a robotic cat.");
						}
						else if (pet instanceof RoboDog) {
							System.out.println(pet.name + " is a robotic dog.");
						}
					}
					name = input.next();
					cleve.adopt(name.toLowerCase());
					cleve.tick();
					break;
				case 8:
					cleve.tick();
					System.out.println("What is the name of the pet you want to admit?");
					name = input.next();
					System.out.println("What kind of pet are they?\n1. Organic Dog\n2. Organic Cat\n3. Robotic Dog\n4. Robotic Cat");
					choice = Integer.parseInt(input.next());
					switch (choice) {
						case 1:
							cleve.admit(new OrganDog(name));
							break;
						case 2:
							cleve.admit(new OrganCat(name));
							break;
						case 3:
							cleve.admit(new RoboDog(name));
							break;
						case 4:
							cleve.admit(new RoboCat(name));
							break;
						default:
							System.out.println("Invalid Input");
					}
					break;
				case 9:
					System.out.println("Quitting.....");
					System.exit(0);
				default:
					System.out.println("Invalid Input.");
			}
		}
		input.close();
	}
}