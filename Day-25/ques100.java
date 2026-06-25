import java.util.Scanner;

public class ques100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of words: ");
        int n = scanner.nextInt();
        String[] words = new String[n];

        System.out.println("Enter the words: ");
        for (int i = 0; i < n; i++) {
            words[i] = scanner.next();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (words[j].length() > words[j + 1].length()) {
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }

        System.out.println("Words sorted by length: ");
        for (int i = 0; i < n; i++) {
            System.out.println(words[i]);
        }

        scanner.close();
    }
}