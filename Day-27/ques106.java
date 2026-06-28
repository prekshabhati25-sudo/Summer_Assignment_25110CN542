import java.util.Scanner;

public class ques106 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] employeeNames = new String[100];
        int[] employeeIds = new int[100];
        String[] departments = new String[100];
        double[] salaries = new double[100];
        int employeeCount = 0;
        
        while (true) {
            System.out.println("\n--- Employee Management System ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Update Employee Salary");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            
            if (choice == 1) {
                if (employeeCount >= 100) {
                    System.out.println("Database full! Cannot add more employees.");
                    continue;
                }
                
                System.out.print("Enter Employee Name: ");
                employeeNames[employeeCount] = scanner.nextLine();
                
                System.out.print("Enter Employee ID: ");
                employeeIds[employeeCount] = scanner.nextInt();
                scanner.nextLine(); 
                
                System.out.print("Enter Department: ");
                departments[employeeCount] = scanner.nextLine();
                
                System.out.print("Enter Salary: ");
                salaries[employeeCount] = scanner.nextDouble();
                
                employeeCount++;
                System.out.println("Employee added successfully!");
                
            } else if (choice == 2) {
                if (employeeCount == 0) {
                    System.out.println("No records found.");
                    continue;
                }
                
                System.out.println("\n--- Employee Records ---");
                for (int i = 0; i < employeeCount; i++) {
                    System.out.println("ID: " + employeeIds[i] + 
                                       " | Name: " + employeeNames[i] + 
                                       " | Dept: " + departments[i] + 
                                       " | Salary: $" + salaries[i]);
                }
                
            } else if (choice == 3) {
                if (employeeCount == 0) {
                    System.out.println("No records found.");
                    continue;
                }
                
                System.out.print("Enter Employee ID to search: ");
                int searchId = scanner.nextInt();
                boolean found = false;
                
                for (int i = 0; i < employeeCount; i++) {
                    if (employeeIds[i] == searchId) {
                        System.out.println("\nEmployee Found:");
                        System.out.println("ID: " + employeeIds[i]);
                        System.out.println("Name: " + employeeNames[i]);
                        System.out.println("Department: " + departments[i]);
                        System.out.println("Salary: $" + salaries[i]);
                        found = true;
                        break;
                    }
                }
                
                if (!found) {
                    System.out.println("Employee with ID " + searchId + " not found.");
                }
                
            } else if (choice == 4) {
                if (employeeCount == 0) {
                    System.out.println("No records found.");
                    continue;
                }
                
                System.out.print("Enter Employee ID to update salary: ");
                int updateId = scanner.nextInt();
                boolean found = false;
                
                for (int i = 0; i < employeeCount; i++) {
                    if (employeeIds[i] == updateId) {
                        System.out.print("Enter New Salary: ");
                        salaries[i] = scanner.nextDouble();
                        System.out.println("Salary updated successfully!");
                        found = true;
                        break;
                    }
                }
                
                if (!found) {
                    System.out.println("Employee with ID " + updateId + " not found.");
                }
                
            } else if (choice == 5) {
                System.out.println("Exiting system. Goodbye!");
                break;
                
            } else {
                System.out.println("Invalid choice! Please select a valid option.");
            }
        }
        
        scanner.close();
    }
}