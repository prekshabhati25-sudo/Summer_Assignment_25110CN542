import java.util.*;

public class ques12 {
    public static void main(String args[]) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter first number:");
        int n1 = ob.nextInt();
        System.out.println("Enter second number:");
        int n2 = ob.nextInt();
        int gcd = 1;
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0)
                gcd = i;  
        }
        System.out.println("GCD is: " + gcd);
        ob.close(); 
    }
}
