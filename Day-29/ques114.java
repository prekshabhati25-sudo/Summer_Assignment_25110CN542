import java.util.Scanner;

public class ques114 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the maximum size of the array: ");
        int maxSize = scanner.nextInt();
        int[] arr = new int[maxSize];
        int currentSize = 0;
        int choice;

        do {
            System.out.println("\n--- Array Operations Menu ---");
            System.out.println("1. Insert an element");
            System.out.println("2. Delete an element by index");
            System.out.println("3. Search for an element");
            System.out.println("4. Display the array");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (currentSize < maxSize) {
                        System.out.print("Enter the element to insert: ");
                        int element = scanner.nextInt();
                        arr[currentSize] = element;
                        currentSize++;
                        System.out.println("Element inserted successfully.");
                    } else {
                        System.out.println("Array overflow! Cannot insert more elements.");
                    }
                    break;

                case 2:
                    if (currentSize == 0) {
                        System.out.println("Array underflow! No elements to delete.");
                    } else {
                        System.out.print("Enter the index to delete (0 to " + (currentSize - 1) + "): ");
                        int index = scanner.nextInt();
                        
                        if (index >= 0 && index < currentSize) {
                            for (int i = index; i < currentSize - 1; i++) {
                                arr[i] = arr[i + 1];
                            }
                            currentSize--;
                            System.out.println("Element deleted successfully.");
                        } else {
                            System.out.println("Invalid index!");
                        }
                    }
                    break;

                case 3:
                    if (currentSize == 0) {
                        System.out.println("Array is empty.");
                    } else {
                        System.out.print("Enter the element to search: ");
                        int target = scanner.nextInt();
                        int foundIndex = -1;
                        
                        for (int i = 0; i < currentSize; i++) {
                            if (arr[i] == target) {
                                foundIndex = i;
                                break;
                            }
                        }
                        
                        if (foundIndex != -1) {
                            System.out.println("Element found at index: " + foundIndex);
                        } else {
                            System.out.println("Element not found in the array.");
                        }
                    }
                    break;

                case 4:
                    if (currentSize == 0) {
                        System.out.println("Array is empty.");
                    } else {
                        System.out.print("Array elements: ");
                        for (int i = 0; i < currentSize; i++) {
                            System.out.print(arr[i] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 5:
                    System.out.println("Exiting the program...");
                    break;

                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        } while (choice != 5);

        scanner.close();
    }
}