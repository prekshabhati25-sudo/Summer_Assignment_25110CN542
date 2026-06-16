import java.util.Scanner;
public class ques61 {
    public static void main(String args[]) {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter n:");
        int n = ob.nextInt();
        int arr[] = new int[n-1];  
        System.out.println("enter elements:");
        for (int i = 0; i < n-1; i++) {
            arr[i] = ob.nextInt();
        }
        int expectedSum = n * (n + 1) / 2; 
        int actualSum = 0;
        for (int i = 0; i < n-1; i++) {
            actualSum += arr[i];
        }
        System.out.println("missing number: " + (expectedSum - actualSum));
        ob.close();

    }
}
