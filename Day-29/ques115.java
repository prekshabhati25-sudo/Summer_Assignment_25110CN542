import java.util.Scanner;

public class ques115 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- String Operations Menu ---");
            System.out.println("1. Reverse a string");
            System.out.println("2. Check for Palindrome");
            System.out.println("3. Count Vowels and Consonants");
            System.out.println("4. Convert to Uppercase / Lowercase");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter the string: ");
                String input = scanner.nextLine();

                switch (choice) {
                    case 1:
                        String reversed = "";
                        for (int i = input.length() - 1; i >= 0; i--) {
                            reversed += input.charAt(i);
                        }
                        System.out.println("Reversed String: " + reversed);
                        break;

                    case 2:
                        String cleanInput = input.replaceAll("\\s+", "").toLowerCase();
                        String rev = "";
                        for (int i = cleanInput.length() - 1; i >= 0; i--) {
                            rev += cleanInput.charAt(i);
                        }
                        if (cleanInput.equals(rev)) {
                            System.out.println("\"" + input + "\" is a palindrome.");
                        } else {
                            System.out.println("\"" + input + "\" is not a palindrome.");
                        }
                        break;

                    case 3:
                        int vowels = 0, consonants = 0;
                        String lowerInput = input.toLowerCase();
                        for (int i = 0; i < lowerInput.length(); i++) {
                            char ch = lowerInput.charAt(i);
                            if (ch >= 'a' && ch <= 'z') {
                                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                                    vowels++;
                                } else {
                                    consonants++;
                                }
                            }
                        }
                        System.out.println("Vowels: " + vowels);
                        System.out.println("Consonants: " + consonants);
                        break;

                    case 4:
                        System.out.println("Uppercase: " + input.toUpperCase());
                        System.out.println("Lowercase: " + input.toLowerCase());
                        break;
                }
            } else if (choice != 5) {
                System.out.println("Invalid choice! Please select a valid option.");
            }
        } while (choice != 5);

        System.out.println("Exiting the program...");
        scanner.close();
    }
}