import java.util.Scanner;

public class ques66 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the first array: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        System.out.println("Enter elements for the first array:");
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.print("Enter the size of the second array: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        System.out.println("Enter elements for the second array:");
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
        }

        int[] combinedArray = new int[size1 + size2];
        int index = 0;

        for (int i = 0; i < size1; i++) {
            combinedArray[index] = array1[i];
            index++;
        }

        for (int i = 0; i < size2; i++) {
            combinedArray[index] = array2[i];
            index++;
        }

        System.out.println("\nThe Union of the two arrays is:");
        
        for (int i = 0; i < combinedArray.length; i++) {
            boolean isDuplicate = false;
            
            for (int j = 0; j < i; j++) {
                if (combinedArray[i] == combinedArray[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            
            if (!isDuplicate) {
                System.out.print(combinedArray[i] + " ");
            }
        }
        
        System.out.println();
        scanner.close();
    }
}