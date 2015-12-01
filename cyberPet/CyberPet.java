package cyberPet;

import java.io.IOException;
import java.util.Scanner;

public class CyberPet {

	public static void main(String[] args) throws IOException {

		initGame();

	}

	public static String getInput() {
		Scanner in = new Scanner(System.in);
		String inputGuess = in.nextLine();
		return inputGuess;
	}

	public static void initGame() throws IOException {
		CyberPet newGame = new CyberPet();
		TextOutput output = new TextOutput();

		output.print(1);
		int userResponse = Integer.parseInt(getInput());

		if (userResponse == 1) {
			TextOutput out = new TextOutput();
			out.print(2);
			userResponse = Integer.parseInt(getInput());
			if (userResponse == 2) {
				Pet cat = new Cat("CyberCat");

				newGame.play(cat, out);
			} else if (userResponse == 1) {
				Pet dog = new Dog("CyberDog");

				newGame.play(dog, out);
			} else {
				output.print(3);
			}
		} else if (userResponse == 2) {
			GUIOutput out = new GUIOutput();
			out.print(2);
		} else {
			output.print(3);
		}
	}

	public void play(Pet p, Output o) throws java.io.IOException {
		o.print(4);
		try {
			Output out = o;
			while (p.getAge() < 15 && p.getHunger() < 15 && p.getTiredness() < 16 && p.getHappiness() > 0) {

				int userResponse = Integer.parseInt(getInput());

				if (userResponse == 1) {
					p.play();
				}
				if (userResponse == 2) {
					p.feed();
				}
				if (userResponse == 3) {
					p.sleep();
				}
				out.display(p);

			}

		} catch (NumberFormatException e) {
			System.out.println("error");
		}
	}
}
