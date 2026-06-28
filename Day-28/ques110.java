import java.util.Scanner;

public class ques110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] accountNumbers = new int[100];
        String[] accountHolders = new String[100];
        double[] balances = new double[100];
        int accountCount = 0;

        while (true) {
            System.out.println("\n--- Bank Account System ---");
            System.out.println("1. Create New Account");
            System.out.println("2. Display Account Details");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                if (accountCount >= 100) {
                    System.out.println("Bank database is full!");
                    continue;
                }

                System.out.print("Enter Account Number: ");
                accountNumbers[accountCount] = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Enter Account Holder Name: ");
                accountHolders[accountCount] = scanner.nextLine();

                System.out.print("Enter Initial Deposit Amount: ");
                balances[accountCount] = scanner.nextDouble();

                accountCount++;
                System.out.println("Account created successfully!");

            } else if (choice == 2) {
                if (accountCount == 0) {
                    System.out.println("No accounts registered yet.");
                    continue;
                }

                System.out.print("Enter Account Number: ");
                int searchAcc = scanner.nextInt();
                boolean found = false;

                for (int i = 0; i < accountCount; i++) {
                    if (accountNumbers[i] == searchAcc) {
                        System.out.println("\n--- Account Details ---");
                        System.out.println("Account Number: " + accountNumbers[i]);
                        System.out.println("Holder Name   : " + accountHolders[i]);
                        System.out.println("Current Balance: $" + balances[i]);
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Account not found.");
                }

            } else if (choice == 3) {
                if (accountCount == 0) {
                    System.out.println("No accounts registered yet.");
                    continue;
                }

                System.out.print("Enter Account Number: ");
                int searchAcc = scanner.nextInt();
                boolean found = false;

                for (int i = 0; i < accountCount; i++) {
                    if (accountNumbers[i] == searchAcc) {
                        System.out.print("Enter amount to deposit: ");
                        double amount = scanner.nextDouble();

                        if (amount > 0) {
                            balances[i] += amount;
                            System.out.println("Successfully deposited! New Balance: $" + balances[i]);
                        } else {
                            System.out.println("Invalid amount!");
                        }
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Account not found.");
                }

            } else if (choice == 4) {
                if (accountCount == 0) {
                    System.out.println("No accounts registered yet.");
                    continue;
                }

                System.out.print("Enter Account Number: ");
                int searchAcc = scanner.nextInt();
                boolean found = false;

                for (int i = 0; i < accountCount; i++) {
                    if (accountNumbers[i] == searchAcc) {
                        System.out.print("Enter amount to withdraw: ");
                        double amount = scanner.nextDouble();

                        if (amount > 0 && amount <= balances[i]) {
                            balances[i] -= amount;
                            System.out.println("Successfully withdrawn! New Balance: $" + balances[i]);
                        } else if (amount > balances[i]) {
                            System.out.println("Insufficient balance!");
                        } else {
                            System.out.println("Invalid amount!");
                        }
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Account not found.");
                }

            } else if (choice == 5) {
                System.out.println("Exiting System. Goodbye!");
                break;

            } else {
                System.out.println("Invalid choice! Please try again.");
            }
        }

        scanner.close();
    }
}