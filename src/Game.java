import java.util.Scanner;
import java.util.Random;

public class Game {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Hello ! Do you want to play? (y or n)");
		
		Random random = new Random();
		int target = random.nextInt(100)+1;
		int counter = 0;
		
		while (scan.hasNext()) {
			System.out.println("Please guess the target number, between 1 and 100: \n");
			if (scan.hasNextInt()) {
				int value = scan.nextInt();
				if (value == target) {
					counter++;
					System.out.println("Congratulations! You find " + target + " in " + counter + " turns.");
					System.out.println("Do you want to play again? (y or n)");
					break;
				}
				if (value < target) {
					System.out.println("The target number is higher! Please try again.");
					counter++;
				}
				else {
					System.out.println("The target number is lower! Please try again.");
					counter++;
				}
			}
			else {
				String input = scan.next();
				if (input.equalsIgnoreCase("n")) {
					System.out.println("You are quitting the program! See you next time!");
					break;
				}
			}
		}
		
		scan.close();
	}

}
