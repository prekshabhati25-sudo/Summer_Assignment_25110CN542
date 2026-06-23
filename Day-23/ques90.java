import java.util.Scanner;

public class ques90 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        
        char result = '\0';
        
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            
            for (int j = 0; j < i; j++) {
                if (currentChar == input.charAt(j)) {
                    result = currentChar;
                    break;
                }
            }
            
            if (result != '\0') {
                break;
            }
        }
        
        if (result != '\0') {
            System.out.println(result);
        } else {
            System.out.println("No repeating character found.");
        }
        
        scanner.close();
    }
}