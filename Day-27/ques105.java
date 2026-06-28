import java.util.Scanner;

public class ques105 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] studentNames = new String[100];
        int[] studentRollNumbers = new int[100];
        double[] studentGrades = new double[100];
        int studentCount = 0;
        
        while (true) {
            System.out.println("\n--- Student Record Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by Roll Number");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            
            if (choice == 1) {
                if (studentCount >= 100) {
                    System.out.println("Database is full!");
                    continue;
                }
                System.out.print("Enter Student Name: ");
                studentNames[studentCount] = scanner.nextLine();
                
                System.out.print("Enter Roll Number: ");
                studentRollNumbers[studentCount] = scanner.nextInt();
                
                System.out.print("Enter Grade/Marks: ");
                studentGrades[studentCount] = scanner.nextDouble();
                
                studentCount++;
                System.out.println("Student added successfully!");
                
            } else if (choice == 2) {
                if (studentCount == 0) {
                    System.out.println("No records found.");
                    continue;
                }
                System.out.println("\n--- Student Records ---");
                for (int i = 0; i < studentCount; i++) {
                    System.out.println("Roll No: " + studentRollNumbers[i] + 
                                       " | Name: " + studentNames[i] + 
                                       " | Grade: " + studentGrades[i]);
                }
                
            } else if (choice == 3) {
                if (studentCount == 0) {
                    System.out.println("No records found.");
                    continue;
                }
                System.out.print("Enter Roll Number to search: ");
                int searchRoll = scanner.nextInt();
                boolean found = false;
                
                for (int i = 0; i < studentCount; i++) {
                    if (studentRollNumbers[i] == searchRoll) {
                        System.out.println("\nStudent Found:");
                        System.out.println("Roll No: " + studentRollNumbers[i]);
                        System.out.println("Name: " + studentNames[i]);
                        System.out.println("Grade: " + studentGrades[i]);
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Student with Roll Number " + searchRoll + " not found.");
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