import java.util.Scanner;

public class ques118 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the maximum number of books the library can hold: ");
        int maxBooks = scanner.nextInt();
        scanner.nextLine(); 

        String[] bookTitles = new String[maxBooks];
        String[] bookAuthors = new String[maxBooks];
        boolean[] isAvailable = new boolean[maxBooks];
        int bookCount = 0;

        while (true) {
            System.out.println("\n--- Mini Library System ---");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            if (choice == 1) {
                if (bookCount < maxBooks) {
                    System.out.print("Enter Book Title: ");
                    bookTitles[bookCount] = scanner.nextLine();

                    System.out.print("Enter Author Name: ");
                    bookAuthors[bookCount] = scanner.nextLine();

                    isAvailable[bookCount] = true;
                    bookCount++;
                    System.out.println("Book added successfully!");
                } else {
                    System.out.println("Library storage is full!");
                }
            } else if (choice == 2) {
                if (bookCount == 0) {
                    System.out.println("No books in the library.");
                } else {
                    System.out.println("\n--- Library Catalog ---");
                    for (int i = 0; i < bookCount; i++) {
                        String status = isAvailable[i] ? "Available" : "Borrowed";
                        System.out.println((i + 1) + ". Title: " + bookTitles[i] + " | Author: " + bookAuthors[i] + " | Status: " + status);
                    }
                }
            } else if (choice == 3) {
                if (bookCount == 0) {
                    System.out.println("No books available to borrow.");
                } else {
                    System.out.print("Enter the title of the book to borrow: ");
                    String searchTitle = scanner.nextLine();
                    boolean found = false;

                    for (int i = 0; i < bookCount; i++) {
                        if (bookTitles[i].equalsIgnoreCase(searchTitle)) {
                            found = true;
                            if (isAvailable[i]) {
                                isAvailable[i] = false;
                                System.out.println("You have successfully borrowed: " + bookTitles[i]);
                            } else {
                                System.out.println("Sorry, this book is already borrowed.");
                            }
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Book not found in the library.");
                    }
                }
            } else if (choice == 4) {
                if (bookCount == 0) {
                    System.out.println("No books belong to this library yet.");
                } else {
                    System.out.print("Enter the title of the book to return: ");
                    String returnTitle = scanner.nextLine();
                    boolean found = false;

                    for (int i = 0; i < bookCount; i++) {
                        if (bookTitles[i].equalsIgnoreCase(returnTitle)) {
                            found = true;
                            if (!isAvailable[i]) {
                                isAvailable[i] = true;
                                System.out.println("You have successfully returned: " + bookTitles[i]);
                            } else {
                                System.out.println("This book was not borrowed.");
                            }
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("This book does not belong to our library.");
                    }
                }
            } else if (choice == 5) {
                System.out.println("Exiting system. Thank you for using the library!");
                break;
            } else {
                System.out.println("Invalid choice! Please try again.");
            }
        }
        
        scanner.close();
    }
}