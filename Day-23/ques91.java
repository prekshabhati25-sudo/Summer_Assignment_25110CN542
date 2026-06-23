import java.util.Scanner;
import java.util.Arrays;

public class ques91 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String str1 = scanner.next();
        String str2 = scanner.next();
        
        if (str1.length() != str2.length()) {
            System.out.println("Not Anagram");
        } else {
            char[] array1 = str1.toLowerCase().toCharArray();
            char[] array2 = str2.toLowerCase().toCharArray();
            
            Arrays.sort(array1);
            Arrays.sort(array2);
            
            if (Arrays.equals(array1, array2)) {
                System.out.println("Anagram");
            } else {
                System.out.println("Not Anagram");
            }
        }
        
        scanner.close();
    }
}