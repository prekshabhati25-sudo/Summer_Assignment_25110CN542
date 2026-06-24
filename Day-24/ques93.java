import java.util.Scanner;

public class ques93 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        if (str1.length() != str2.length()) {
            System.out.println("false");
        } else {
            String concatenated = str1 + str1;
            if (concatenated.contains(str2)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }

        scanner.close();
    }
}