import java.util.Scanner;

public class ques102 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Voting Eligibility System ---");
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        System.out.print("Are you a citizen? (true/false): ");
        boolean isCitizen = scanner.nextBoolean();
        
        if (age >= 18 && isCitizen) {
            System.out.println("Status: You are eligible to vote!");
        } else if (age < 18 && isCitizen) {
            System.out.println("Status: You are not eligible to vote. You must be at least 18 years old.");
        } else if (age >= 18 && !isCitizen) {
            System.out.println("Status: You are not eligible to vote. You must be a citizen.");
        } else {
            System.out.println("Status: You are not eligible to vote. You do not meet the age or citizenship requirements.");
        }
        
        scanner.close();
    }
}