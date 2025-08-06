package CodSoft_Internship;
import java.util.*;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int score = 0;
        String playAgain;

        do {
            int numberToGuess = rand.nextInt(100) + 1;
            int attempts = 0;
            int guess;

            System.out.println("Guess the number between 1 and 100. You have 7 attempts!");

            while (true) {
                System.out.print("Enter your guess: ");
                guess = sc.nextInt();
                attempts++;

                if (guess == numberToGuess) {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                    score++;
                    break;
                } else if (guess < numberToGuess) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }

                if (attempts >= 7) {
                    System.out.println("Sorry! You've used all your attempts. The number was: " + numberToGuess);
                    break;
                }
            }

            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = sc.next();
        } while (playAgain.equalsIgnoreCase("yes"));

        System.out.println("Your total score: " + score);
        sc.close();
    }
}
