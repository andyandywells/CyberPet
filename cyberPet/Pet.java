package cyberPet;

public class Pet {

	public Pet(String n) {
		// TODO Auto-generated constructor stub
		this.name = n;
		this.tiredness = 0;
		this.hunger = 0;
		this.happiness = 10;
		this.age = 0;
		this.oldAge = this.name + " died due to old age";
		this.starve = this.name + " starved to death";
		this.fatigue = this.name + " died due to exhaustion";
		this.depression = this.name + " died due to depression";
	}

	private int tiredness;
	private int hunger;
	private int age;
	private int happiness;
	private int ageInc;
	private int tiredInc;
	private int happyInc;
	private String name;
	private String oldAge;
	private String starve;
	private String fatigue;
	private String depression;

	public String getDepression() {
		return depression;
	}

	public String getOldAge() {
		return oldAge;
	}

	public String getStarve() {
		return starve;
	}

	public String getFatigue() {
		return fatigue;
	}

	public void setAgeInc(int ageInc) {
		this.ageInc = ageInc;
	}

	public void setTiredInc(int tiredInc) {
		this.tiredInc = tiredInc;
	}

	public void setHappyInc(int happyInc) {
		this.happyInc = happyInc;
	}

	public String getName() {
		return name;
	}

	public int ageInc() {
		return ageInc;
	}

	public int tiredInc() {
		return tiredInc;
	}

	public int happyInc() {
		return happyInc;
	}

	public int getTiredness() {
		return tiredness;
	}

	public int getHappiness() {
		return happiness;
	}

	public int getHunger() {
		return hunger;
	}

	public int getAge() {
		return age;
	}

	public void play() {
		this.age = this.getAge() + this.ageInc();
		this.happiness = this.getHappiness() + (2 * this.happyInc());
		this.hunger = this.getHunger() + 2;
		this.tiredness = this.getTiredness() + this.tiredInc();
	}

	public void sleep() {
		this.age = this.getAge() + this.ageInc();
		this.hunger = this.getHunger() + 5;
		this.tiredness = this.getTiredness() - this.tiredInc();
	}

	public void feed() {
		this.age = this.getAge() + this.ageInc();
		this.happiness = this.getHappiness() + this.happyInc();
		this.hunger = this.getHunger() - 5;
	}

}
