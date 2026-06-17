import java.util.Scanner;

public class ques68{
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

        System.out.println("\nThe Intersection of the two arrays is:");

        for (int i = 0; i < size1; i++) {
            boolean isPresentInBoth = false;

            for (int j = 0; j < size2; j++) {
                if (array1[i] == array2[j]) {
                    isPresentInBoth = true;
                    break;
                }
            }

            if (isPresentInBoth) {
                boolean alreadyPrinted = false;
                for (int k = 0; k < i; k++) {
                    if (array1[i] == array1[k]) {
                        alreadyPrinted = true;
                        break;
                    }
                }

                if (!alreadyPrinted) {
                    System.out.print(array1[i] + " ");
                }
            }
        }

        System.out.println();
        scanner.close();
    }
}