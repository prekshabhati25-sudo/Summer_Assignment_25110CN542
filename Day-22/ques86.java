import java.util.Scanner;

public class ques86 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine().trim();
        
        if (sentence.isEmpty()) {
            System.out.println("Word count: 0");
        } else {
            String[] words = sentence.split("\\s+");
            System.out.println("Word count: " + words.length);
        }
        
        scanner.close();
    }
}