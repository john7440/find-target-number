import java.util.Scanner;
import java.util.Random;

public class Game {

    public static void main(String[] args) {
    	
    	
    	System.out.println("Welcome!");
        Scanner scan = new Scanner(System.in);
        String playAgain;

        do {
        	// Generate the random number to guess
            Random random = new Random();
            int target = random.nextInt(100) + 1;
            // Create a counter to count the turn
            int counter = 0;
            // Create a boolean to checks if the number is guessed
            boolean guessed = false;

            System.out.println("New game started! Try to guess the number between 1 and 100: ");

            // While not guessed:
            while (!guessed) {
                System.out.print("Your guess (or n if you want to quit):  ");
                if (scan.hasNextInt()) {
                    int value = scan.nextInt();
                    counter++;
                    if (value == target) {
                        System.out.println("Congratulations! You found the target number: " + target + " in " + counter + " turns.");
                        guessed = true;
                    } else if (value < target) {
                        System.out.println("The target number is higher! Try again.");
                    } else {
                        System.out.println("The target number is lower! Try again.");
                    }
                    
                } else {
                	// Handling if the user want to quit:
                    String input = scan.next();
                    if (input.equalsIgnoreCase("n")) {
                        System.out.println("You are quitting the program! See you next time!");
                        scan.close();
                        return;
                      // Print a message if the number is not valid (not a number):
                    } else {
                        System.out.println("Please enter a valid number.");
                    }
                }
            }

            System.out.print("Do you want to play again? (y or n): ");
            playAgain = scan.next();

          // We check if the player want to replay
        } while (playAgain.equalsIgnoreCase("y"));

        System.out.println("Thanks for playing! Goodbye.");
        scan.close();
    }
}
