import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();
        int attempts = 8;
        int score = 0;   
        boolean playAgain = true;

        while (playAgain) {
            int mynumber = rn.nextInt(100) + 1;
            int numOfTries = 0;
            boolean correctGuess = false;

            System.out.println("\nWelcome to the Number Guessing Game!");
            System.out.println("Guess a number between 1 and 100.");
            System.out.println("You have " + attempts + " attempts to guess the correct number.");
            while (!correctGuess && numOfTries < attempts) {
                System.out.print("Enter your guess: ");
                int userGuess = sc.nextInt();
                numOfTries++;

                if (userGuess < mynumber) {
                    System.out.println("Too low!");
                } else if (userGuess > mynumber) {
                    System.out.println("Too high!");
                } else {
                    correctGuess = true;
                    score++;   
                    System.out.println("Congratulations! You guessed the number "
                            + mynumber + " in " + numOfTries + " tries.");
                }
            }

            if (!correctGuess) {
                System.out.println("Out of attempts! The number was: " + mynumber);
            }

            System.out.print("Would you like to play again? (yes/no): ");
            String answer = sc.next();

            if (answer.equalsIgnoreCase("no")) {
                playAgain = false;
                System.out.println("\nThank you for playing!");
                System.out.println("Your score: " + score);
            }
        }
        sc.close();
    }
}
