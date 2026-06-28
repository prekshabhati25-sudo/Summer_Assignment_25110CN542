import java.util.Scanner;

public class ques109 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bookTitles = new String[100];
        int[] bookIds = new int[100];
        String[] bookAuthors = new String[100];
        boolean[] isIssued = new boolean[100];
        int bookCount = 0;

        while (true) {
            System.out.println("\n--- Library Management System ---");
            System.out.println("1. Add New Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Issue a Book");
            System.out.println("4. Return a Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                if (bookCount >= 100) {
                    System.out.println("Library storage is full!");
                    continue;
                }

                System.out.print("Enter Book ID: ");
                bookIds[bookCount] = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Enter Book Title: ");
                bookTitles[bookCount] = scanner.nextLine();

                System.out.print("Enter Author Name: ");
                bookAuthors[bookCount] = scanner.nextLine();

                isIssued[bookCount] = false;
                bookCount++;
                System.out.println("Book added successfully!");

            } else if (choice == 2) {
                if (bookCount == 0) {
                    System.out.println("No books available in the library.");
                    continue;
                }

                System.out.println("\n--- Library Catalog ---");
                for (int i = 0; i < bookCount; i++) {
                    String status = isIssued[i] ? "Issued" : "Available";
                    System.out.println("ID: " + bookIds[i] +
                                       " | Title: " + bookTitles[i] +
                                       " | Author: " + bookAuthors[i] +
                                       " | Status: " + status);
                }

            } else if (choice == 3) {
                if (bookCount == 0) {
                    System.out.println("No books available to issue.");
                    continue;
                }

                System.out.print("Enter Book ID to issue: ");
                int searchId = scanner.nextInt();
                boolean found = false;

                for (int i = 0; i < bookCount; i++) {
                    if (bookIds[i] == searchId) {
                        found = true;
                        if (isIssued[i]) {
                            System.out.println("Sorry, this book is already issued.");
                        } else {
                            isIssued[i] = true;
                            System.out.println("Book issued successfully!");
                        }
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Book with ID " + searchId + " not found.");
                }

            } else if (choice == 4) {
                if (bookCount == 0) {
                    System.out.println("No books registered in the system.");
                    continue;
                }

                System.out.print("Enter Book ID to return: ");
                int searchId = scanner.nextInt();
                boolean found = false;

                for (int i = 0; i < bookCount; i++) {
                    if (bookIds[i] == searchId) {
                        found = true;
                        if (!isIssued[i]) {
                            System.out.println("This book was not issued.");
                        } else {
                            isIssued[i] = false;
                            System.out.println("Book returned successfully!");
                        }
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Book with ID " + searchId + " not found.");
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