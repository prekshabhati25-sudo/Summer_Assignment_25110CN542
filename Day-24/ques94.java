import java.util.Scanner;

public class ques94 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String str = scanner.nextLine();
        
        if (str == null || str.isEmpty()) {
            System.out.println(str);
            scanner.close();
            return;
        }

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                compressed.append(str.charAt(i));
                compressed.append(count);
                count = 1;
            }
        }

        String result = compressed.toString();
        
        if (result.length() < str.length()) {
            System.out.println(result);
        } else {
            System.out.println(str);
        }

        scanner.close();
    }
}