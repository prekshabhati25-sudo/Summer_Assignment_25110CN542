import java.util.Scanner;

public class ques92 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        int[] count = new int[256];
        
        for (int i = 0; i < input.length(); i++) {
            count[input.charAt(i)]++;
        }
        
        int max = -1;
        char result = ' ';
        
        for (int i = 0; i < input.length(); i++) {
            if (max < count[input.charAt(i)]) {
                max = count[input.charAt(i)];
                result = input.charAt(i);
            }
        }
        
        System.out.println(result);
        
        scanner.close();
    }
}