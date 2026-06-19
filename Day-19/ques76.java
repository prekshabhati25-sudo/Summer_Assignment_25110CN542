import java.util.Scanner;

public class ques76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the square matrix (N): ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];
        int primarySum = 0;
        int secondarySum = 0;

        System.out.println("Enter elements of the Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            primarySum += matrix[i][i];
            secondarySum += matrix[i][n - 1 - i];
        }

        System.out.println("Sum of Primary Diagonal: " + primarySum);
        System.out.println("Sum of Secondary Diagonal: " + secondarySum);

        sc.close();
    }
}