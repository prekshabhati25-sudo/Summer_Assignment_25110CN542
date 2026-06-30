import java.util.Scanner;

public class ques119 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the maximum number of employees: ");
        int maxEmployees = scanner.nextInt();
        scanner.nextLine(); 

        String[] employeeIds = new String[maxEmployees];
        String[] employeeNames = new String[maxEmployees];
        String[] employeeDepartments = new String[maxEmployees];
        int employeeCount = 0;

        while (true) {
            System.out.println("\n--- Employee Management System ---");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            if (choice == 1) {
                if (employeeCount < maxEmployees) {
                    System.out.print("Enter Employee ID: ");
                    employeeIds[employeeCount] = scanner.nextLine();

                    System.out.print("Enter Employee Name: ");
                    employeeNames[employeeCount] = scanner.nextLine();

                    System.out.print("Enter Department: ");
                    employeeDepartments[employeeCount] = scanner.nextLine();

                    employeeCount++;
                    System.out.println("Employee added successfully!");
                } else {
                    System.out.println("System storage full! Cannot add more employees.");
                }
            } else if (choice == 2) {
                if (employeeCount == 0) {
                    System.out.println("No records found.");
                } else {
                    System.out.println("\n--- Employee Records ---");
                    for (int i = 0; i < employeeCount; i++) {
                        System.out.println("ID: " + employeeIds[i] + " | Name: " + employeeNames[i] + " | Department: " + employeeDepartments[i]);
                    }
                }
            } else if (choice == 3) {
                if (employeeCount == 0) {
                    System.out.println("No records available to search.");
                } else {
                    System.out.print("Enter Employee ID to search: ");
                    String searchId = scanner.nextLine();
                    boolean found = false;

                    for (int i = 0; i < employeeCount; i++) {
                        if (employeeIds[i].equalsIgnoreCase(searchId)) {
                            System.out.println("Employee Found!");
                            System.out.println("ID: " + employeeIds[i] + " | Name: " + employeeNames[i] + " | Department: " + employeeDepartments[i]);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Employee with ID " + searchId + " not found.");
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