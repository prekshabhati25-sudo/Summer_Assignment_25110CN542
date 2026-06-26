import java.util.Scanner;

public class ques103 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double balance = 1000.00;
        int choice = 0;
        
        System.out.println("Welcome to the ATM!");
        
        while (choice != 4) {
            System.out.println("\n--- ATM MENU ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            
            choice = scanner.nextInt();
            
            if (choice == 1) {
                System.out.println("Your current balance is: $" + balance);
            } else if (choice == 2) {
                System.out.print("Enter deposit amount: $");
                double depositAmount = scanner.nextDouble();
                if (depositAmount > 0) {
                    balance += depositAmount;
                    System.out.println("$" + depositAmount + " deposited successfully.");
                } else {
                    System.out.println("Invalid amount!");
                }
            } else if (choice == 3) {
                System.out.print("Enter withdrawal amount: $");
                double withdrawAmount = scanner.nextDouble();
                if (withdrawAmount > 0 && withdrawAmount <= balance) {
                    balance -= withdrawAmount;
                    System.out.println("$" + withdrawAmount + " withdrawn successfully.");
                } else if (withdrawAmount > balance) {
                    System.out.println("Insufficient balance!");
                } else {
                    System.out.println("Invalid amount!");
                }
            } else if (choice == 4) {
                System.out.println("Thank you for using the ATM. Goodbye!");
            } else {
                System.out.println("Invalid choice! Please select a valid option.");
            }
        }
        
        scanner.close();
    }
}