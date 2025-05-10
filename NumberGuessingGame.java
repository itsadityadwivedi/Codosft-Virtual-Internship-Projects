import java.util.Scanner;

public class NumberGuessingGame {
    
    public static void playNumberGuessingGame() {
        Scanner scanner = new Scanner(System.in);
        
        // Generate a random number between 1 and 100
        int targetNumber = 1 + (int) (100 * Math.random());
        int attempts = 5;

        System.out.println("A number has been chosen between 1 and 100. Try to guess it within 5 attempts.");
        
        for (int attempt = 1; attempt <= attempts; attempt++) {
            System.out.print("Enter your guess: ");
            int playerGuess = scanner.nextInt();

            if (playerGuess == targetNumber) {
                System.out.println("Congratulations! You've guessed the correct number.");
                return;
            } else if (playerGuess < targetNumber && attempt != attempts) {
                System.out.println("The target number is higher than " + playerGuess);
            } else if (playerGuess > targetNumber && attempt != attempts) {
                System.out.println("The target number is lower than " + playerGuess);
            }
        }
        
        System.out.println("You've used all " + attempts + " attempts. The correct number was " + targetNumber);
        System.out.println("Better luck next time!");
    }

    public static void main(String[] args) {
        playNumberGuessingGame();
    }
}
