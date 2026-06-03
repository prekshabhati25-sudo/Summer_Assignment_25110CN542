import java.util.*;

public class ques11 {
    public static void main(String args[]) 
    {
        Scanner ob = new Scanner(System.in);
     System.out.println("Enter first number:");
        int n1 = ob.nextInt();
     System.out.println("Enter second number:");
        int n2 = ob.nextInt();
        int lcm = 1;
    for (int i = 1; i <= n1 * n2; i++) {
        if (i % n1 == 0 && i % n2 == 0) 
            {
                lcm = i;
                break; 
            }
        }
        System.out.println("LCM is: " + lcm);
        ob.close(); 
    }
}
