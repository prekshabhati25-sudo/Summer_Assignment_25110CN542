import java.util.Scanner;

public class ques116 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the maximum number of unique items the inventory can hold: ");
        int maxItems = scanner.nextInt();
        scanner.nextLine(); 

        String[] itemNames = new String[maxItems];
        int[] itemQuantities = new int[maxItems];
        double[] itemPrices = new double[maxItems];
        int itemCount = 0;
        int choice;

        do {
            System.out.println("\n--- Inventory Management System ---");
            System.out.println("1. Add New Item");
            System.out.println("2. Update Stock Quantity");
            System.out.println("3. Display Inventory");
            System.out.println("4. Calculate Total Inventory Value");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    if (itemCount < maxItems) {
                        System.out.print("Enter item name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter initial stock quantity: ");
                        int quantity = scanner.nextInt();
                        System.out.print("Enter item price: ");
                        double price = scanner.nextDouble();

                        itemNames[itemCount] = name;
                        itemQuantities[itemCount] = quantity;
                        itemPrices[itemCount] = price;
                        itemCount++;
                        System.out.println("Item added successfully.");
                    } else {
                        System.out.println("Inventory is full! Cannot add more items.");
                    }
                    break;

                case 2:
                    if (itemCount == 0) {
                        System.out.println("Inventory is empty.");
                    } else {
                        System.out.print("Enter the item name to update: ");
                        String targetName = scanner.nextLine();
                        int foundIndex = -1;

                        for (int i = 0; i < itemCount; i++) {
                            if (itemNames[i].equalsIgnoreCase(targetName)) {
                                foundIndex = i;
                                break;
                            }
                        }

                        if (foundIndex != -1) {
                            System.out.print("Enter new stock quantity: ");
                            int newQuantity = scanner.nextInt();
                            itemQuantities[foundIndex] = newQuantity;
                            System.out.println("Stock updated successfully.");
                        } else {
                            System.out.println("Item not found in inventory.");
                        }
                    }
                    break;

                case 3:
                    if (itemCount == 0) {
                        System.out.println("Inventory is empty.");
                    } else {
                        System.out.println("\n--- Current Inventory ---");
                        System.out.printf("%-20s %-10s %-10s\n", "Item Name", "Quantity", "Price");
                        System.out.println("---------------------------------------------");
                        for (int i = 0; i < itemCount; i++) {
                            System.out.printf("%-20s %-10d $%-10.2f\n", itemNames[i], itemQuantities[i], itemPrices[i]);
                        }
                    }
                    break;

                case 4:
                    if (itemCount == 0) {
                        System.out.println("Inventory is empty. Total Value: $0.00");
                    } else {
                        double totalValue = 0;
                        for (int i = 0; i < itemCount; i++) {
                            totalValue += itemQuantities[i] * itemPrices[i];
                        }
                        System.out.printf("Total Inventory Value: $%.2f\n", totalValue);
                    }
                    break;

                case 5:
                    System.out.println("Exiting the system...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}