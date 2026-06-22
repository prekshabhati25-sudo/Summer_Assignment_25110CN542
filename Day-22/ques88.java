import java.util.Scanner;

public class ques88 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String result = input.replace(" ", "");
        
        System.out.println("Result: " + result);
        
        scanner.close();
    }
}