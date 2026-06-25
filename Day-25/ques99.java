import java.util.Scanner;

public class ques99 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of names: ");
        int n = scanner.nextInt();
        String[] names = new String[n];

        System.out.println("Enter the names: ");
        for (int i = 0; i < n; i++) {
            names[i] = scanner.next();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (names[j].compareTo(names[j + 1]) > 0) {
                    String temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }
            }
        }

        System.out.println("Names in alphabetical order: ");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i]);
        }

        scanner.close();
    }
}