import java.util.Scanner;

public class ques104 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int score = 0;
        int answer;
        
        System.out.println("--- Welcome to the General Knowledge Quiz! ---");
        
        System.out.println("\nQuestion 1: What is the capital of France?");
        System.out.println("1. London");
        System.out.println("2. Paris");
        System.out.println("3. Berlin");
        System.out.println("4. Rome");
        System.out.print("Your answer: ");
        answer = scanner.nextInt();
        if (answer == 2) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong! The correct answer was 2. Paris.");
        }
        
        System.out.println("\nQuestion 2: Which planet is known as the Red Planet?");
        System.out.println("1. Earth");
        System.out.println("2. Venus");
        System.out.println("3. Mars");
        System.out.println("4. Jupiter");
        System.out.print("Your answer: ");
        answer = scanner.nextInt();
        if (answer == 3) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong! The correct answer was 3. Mars.");
        }
        
        System.out.println("\nQuestion 3: What is the largest mammal in the world?");
        System.out.println("1. Elephant");
        System.out.println("2. Blue Whale");
        System.out.println("3. Giraffe");
        System.out.println("4. Shark");
        System.out.print("Your answer: ");
        answer = scanner.nextInt();
        if (answer == 2) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong! The correct answer was 2. Blue Whale.");
        }
        
        System.out.println("\n--- Quiz Over! ---");
        System.out.println("Your final score is: " + score + " out of 3");
        
        scanner.close();
    }
}