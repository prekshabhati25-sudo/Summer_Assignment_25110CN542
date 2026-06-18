import java.util.Scanner;

public class ques72 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();
        int[] data = new int[size];
        
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            data[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (data[j] < data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
        
        System.out.print("Sorted array in descending order: ");
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
        
        scanner.close();
    }
}