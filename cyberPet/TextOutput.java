package cyberPet;

public class TextOutput implements Output{

	public TextOutput() {
		// TODO Auto-generated constructor stub
	}

	public void display(Pet p) {
		System.out.println("Hapiness: " + p.getHappiness());
		System.out.println("Hunger: " + p.getHunger());
		System.out.println("Tiredness: " + p.getTiredness());
		System.out.println("Age: " + p.getAge());
		if(p.getAge() >= 15) System.out.println(p.getOldAge());
		if(p.getHunger() >= 15) System.out.println(p.getStarve());
		if(p.getTiredness() >= 16) System.out.println(p.getFatigue());
		if(p.getHappiness() <= 0) System.out.println(p.getDepression());
	}
	public void print(int n) {
		if(n==1) System.out.println("Please enter 1 for text-based output or 2 for a GUI");
		if(n==2) System.out.println("Please enter 1 for a dog or 2 for a cat");
		if(n==3) System.out.println("Please enter a number");
		if(n==4) System.out.println("Enter 1 to play, 2 to feed, 3 to sleep");
	}

}
