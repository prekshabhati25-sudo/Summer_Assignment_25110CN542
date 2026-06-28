import java.util.Scanner;

public class ques107 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] employeeIds = new int[100];
        String[] employeeNames = new String[100];
        double[] baseSalaries = new double[100];
        double[] allowances = new double[100];
        double[] deductions = new double[100];
        int employeeCount = 0;

        while (true) {
            System.out.println("\n--- Salary Management System ---");
            System.out.println("1. Add Employee Salary Details");
            System.out.println("2. Display Payroll Register");
            System.out.println("3. Calculate & Generate Payslip");
            System.out.println("4. Update Salary Components");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                if (employeeCount >= 100) {
                    System.out.println("Database full!");
                    continue;
                }

                System.out.print("Enter Employee ID: ");
                employeeIds[employeeCount] = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Enter Employee Name: ");
                employeeNames[employeeCount] = scanner.nextLine();

                System.out.print("Enter Monthly Base Salary: ");
                baseSalaries[employeeCount] = scanner.nextDouble();

                System.out.print("Enter Monthly Allowances (Bonus/HRA): ");
                allowances[employeeCount] = scanner.nextDouble();

                System.out.print("Enter Monthly Deductions (Tax/PF): ");
                deductions[employeeCount] = scanner.nextDouble();

                employeeCount++;
                System.out.println("Salary details added successfully!");

            } else if (choice == 2) {
                if (employeeCount == 0) {
                    System.out.println("No records found.");
                    continue;
                }

                System.out.println("\n--- Payroll Register ---");
                for (int i = 0; i < employeeCount; i++) {
                    double netSalary = baseSalaries[i] + allowances[i] - deductions[i];
                    System.out.println("ID: " + employeeIds[i] +
                                       " | Name: " + employeeNames[i] +
                                       " | Base: $" + baseSalaries[i] +
                                       " | Net Salary: $" + netSalary);
                }

            } else if (choice == 3) {
                if (employeeCount == 0) {
                    System.out.println("No records found.");
                    continue;
                }

                System.out.print("Enter Employee ID to generate payslip: ");
                int searchId = scanner.nextInt();
                boolean found = false;

                for (int i = 0; i < employeeCount; i++) {
                    if (employeeIds[i] == searchId) {
                        double grossSalary = baseSalaries[i] + allowances[i];
                        double netSalary = grossSalary - deductions[i];

                        System.out.println("\n====================================");
                        System.out.println("             PAYSLIP                ");
                        System.out.println("====================================");
                        System.out.println("Employee ID   : " + employeeIds[i]);
                        System.out.println("Employee Name : " + employeeNames[i]);
                        System.out.println("------------------------------------");
                        System.out.println("Base Salary   : $" + baseSalaries[i]);
                        System.out.println("Allowances    : $" + allowances[i]);
                        System.out.println("Gross Salary  : $" + grossSalary);
                        System.out.println("Deductions    : $" + deductions[i]);
                        System.out.println("------------------------------------");
                        System.out.println("NET TAKE-HOME : $" + netSalary);
                        System.out.println("====================================");
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

                System.out.print("Enter Employee ID to update details: ");
                int updateId = scanner.nextInt();
                boolean found = false;

                for (int i = 0; i < employeeCount; i++) {
                    if (employeeIds[i] == updateId) {
                        System.out.print("Enter New Base Salary: ");
                        baseSalaries[i] = scanner.nextDouble();

                        System.out.print("Enter New Allowances: ");
                        allowances[i] = scanner.nextDouble();

                        System.out.print("Enter New Deductions: ");
                        deductions[i] = scanner.nextDouble();

                        System.out.println("Salary details updated successfully!");
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Employee with ID " + updateId + " not found.");
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