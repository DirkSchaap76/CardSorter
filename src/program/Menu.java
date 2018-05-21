package program;

import program.Start;

import java.util.Scanner;

import cards.Card;
import program.Tool;

public class Menu {
	Scanner scanner = new Scanner(System.in);

	public void Menu() {

		while (true) {

			System.out.println("Choose 1 to enter cards: ");
			System.out.println("Choose 2 to quit program.");

			int option = scanner.nextInt();

			switch (option) {
			case 1:

				System.out.println("Here I'll add a method to enter cards.");
				/*
				 * test goal: press 1 to create a new card enter color (string, scanner) enter
				 * value (int, scanner)
				 * 
				 * note to self: might need tostring for value
				 */

				break;
			case 2:
				System.out.println("Program ended.");
				System.exit(0);
				break;
			default:
				break;
			}
		}

	}
}
