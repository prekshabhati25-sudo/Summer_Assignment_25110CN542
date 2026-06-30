import java.util.Scanner;

public class ques117 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the maximum number of students: ");
        int maxStudents = scanner.nextInt();
        scanner.nextLine(); 

        String[] studentIds = new String[maxStudents];
        String[] studentNames = new String[maxStudents];
        String[] studentGrades = new String[maxStudents];
        int studentCount = 0;

        while (true) {
            System.out.println("\n--- Student Record System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            if (choice == 1) {
                if (studentCount < maxStudents) {
                    System.out.print("Enter Student ID: ");
                    studentIds[studentCount] = scanner.nextLine();

                    System.out.print("Enter Student Name: ");
                    studentNames[studentCount] = scanner.nextLine();

                    System.out.print("Enter Student Grade: ");
                    studentGrades[studentCount] = scanner.nextLine();

                    studentCount++;
                    System.out.println("Student added successfully!");
                } else {
                    System.out.println("Database is full! Cannot add more students.");
                }
            } else if (choice == 2) {
                if (studentCount == 0) {
                    System.out.println("No records found.");
                } else {
                    System.out.println("\n--- Student Records ---");
                    for (int i = 0; i < studentCount; i++) {
                        System.out.println("ID: " + studentIds[i] + " | Name: " + studentNames[i] + " | Grade: " + studentGrades[i]);
                    }
                }
            } else if (choice == 3) {
                if (studentCount == 0) {
                    System.out.println("No records available to search.");
                } else {
                    System.out.print("Enter Student ID to search: ");
                    String searchId = scanner.nextLine();
                    boolean found = false;

                    for (int i = 0; i < studentCount; i++) {
                        if (studentIds[i].equalsIgnoreCase(searchId)) {
                            System.out.println("Student Found!");
                            System.out.println("ID: " + studentIds[i] + " | Name: " + studentNames[i] + " | Grade: " + studentGrades[i]);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student with ID " + searchId + " not found.");
                    }
                }
            } else if (choice == 4) {
                System.out.println("Exiting system. Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice! Please try again.");
            }
        }
        
        scanner.close();
    }
}