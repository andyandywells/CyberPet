package cyberPet;

public class Cat extends Pet {

	public Cat(String n) {
		super(n);
		this.setAgeInc(1);
		this.setHappyInc(2);
		this.setTiredInc(2);
	}

}
