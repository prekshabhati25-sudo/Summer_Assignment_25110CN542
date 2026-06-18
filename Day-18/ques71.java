import java.util.Scanner;

public class ques71 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();
        int[] data = new int[size];
        
        System.out.println("Enter " + size + " sorted integers:");
        for (int i = 0; i < size; i++) {
            data[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the target value to search for: ");
        int target = scanner.nextInt();
        
        int low = 0;
        int high = size - 1;
        int resultIndex = -1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (data[mid] == target) {
                resultIndex = mid;
                break;
            } else if (data[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        if (resultIndex != -1) {
            System.out.println("Element found at index: " + resultIndex);
        } else {
            System.out.println("Element not found in the array.");
        }
        
        scanner.close();
    }
}