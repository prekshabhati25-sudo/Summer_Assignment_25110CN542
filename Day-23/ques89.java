import java.util.Scanner;

public class ques89 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        boolean found = false;
        
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            boolean isRepeating = false;
            
            for (int j = 0; j < input.length(); j++) {
                if (i != j && currentChar == input.charAt(j)) {
                    isRepeating = true;
                    break;
                }
            }
            
            if (!isRepeating) {
                System.out.println(currentChar);
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("No non-repeating character found.");
        }
        
        scanner.close();
    }
}