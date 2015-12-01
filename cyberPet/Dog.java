package cyberPet;

public class Dog extends Pet {

	public Dog(String n) {
		super(n);
		this.setAgeInc(2);
		this.setHappyInc(3);
		this.setTiredInc(4);
	}

}
