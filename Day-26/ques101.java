import java.util.Scanner;

public class ques101 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int targetNumber = 42;
        int userGuess = 0;
        int attempts = 0;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I am thinking of a number between 1 and 100. Try to guess it!");
        
        while (userGuess != targetNumber) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            attempts++;
            
            if (userGuess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > targetNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number.");
                System.out.println("It took you " + attempts + " attempts.");
            }
        }
        
        scanner.close();
    }
}