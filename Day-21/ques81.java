import java.util.Scanner;

public class ques81 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        char[] chars = str.toCharArray();
        int length = 0;

        for (int i = 0; i < chars.length; i++) {
            length++;
        }

        System.out.println("Length of the string: " + length);

        scanner.close();
    }
}