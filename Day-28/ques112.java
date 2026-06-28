import java.util.Scanner;

public class ques112 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = new String[100];
        String[] phoneNumbers = new String[100];
        String[] emails = new String[100];

        int contactCount = 0;

        while (true) {
            System.out.println("\n===== Contact Management System =====");
            System.out.println("1. Add Contact");
            System.out.println("2. Display All Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {

                case 1:
                    if (contactCount == 100) {
                        System.out.println("Contact list is full!");
                        break;
                    }

                    System.out.print("Enter Name: ");
                    names[contactCount] = scanner.nextLine();

                    System.out.print("Enter Phone Number: ");
                    phoneNumbers[contactCount] = scanner.nextLine();

                    System.out.print("Enter Email: ");
                    emails[contactCount] = scanner.nextLine();

                    contactCount++;
                    System.out.println("Contact Added Successfully!");
                    break;

                case 2:
                    if (contactCount == 0) {
                        System.out.println("No contacts available.");
                    } else {
                        System.out.println("\n----- Contact List -----");
                        for (int i = 0; i < contactCount; i++) {
                            System.out.println("Contact " + (i + 1));
                            System.out.println("Name  : " + names[i]);
                            System.out.println("Phone : " + phoneNumbers[i]);
                            System.out.println("Email : " + emails[i]);
                            System.out.println("-------------------------");
                        }
                    }
                    break;

                case 3:
                    if (contactCount == 0) {
                        System.out.println("No contacts available.");
                        break;
                    }

                    System.out.print("Enter Name to Search: ");
                    String searchName = scanner.nextLine();

                    boolean found = false;

                    for (int i = 0; i < contactCount; i++) {
                        if (names[i].equalsIgnoreCase(searchName)) {
                            System.out.println("\nContact Found");
                            System.out.println("Name  : " + names[i]);
                            System.out.println("Phone : " + phoneNumbers[i]);
                            System.out.println("Email : " + emails[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Contact Not Found.");
                    }
                    break;

                case 4:
                    if (contactCount == 0) {
                        System.out.println("No contacts available.");
                        break;
                    }

                    System.out.print("Enter Name to Delete: ");
                    String deleteName = scanner.nextLine();

                    boolean deleted = false;

                    for (int i = 0; i < contactCount; i++) {
                        if (names[i].equalsIgnoreCase(deleteName)) {

                            for (int j = i; j < contactCount - 1; j++) {
                                names[j] = names[j + 1];
                                phoneNumbers[j] = phoneNumbers[j + 1];
                                emails[j] = emails[j + 1];
                            }

                            contactCount--;
                            deleted = true;
                            System.out.println("Contact Deleted Successfully!");
                            break;
                        }
                    }

                    if (!deleted) {
                        System.out.println("Contact Not Found.");
                    }
                    break;

                case 5:
                    System.out.println("Thank you for using Contact Management System!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice! Please try again.");
            }
        }
    }
}