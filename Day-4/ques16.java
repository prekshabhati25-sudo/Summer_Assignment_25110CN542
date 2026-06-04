import java.util.*;

public class ques16 {
    public static void main(String args[]) {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter the 1st number");
        int num1 = ob.nextInt();
        System.out.println("enter the 2nd number");
        int num2 = ob.nextInt();
        System.out.println("Armstrong numbers in range are:");
        for (int num = num1; num <= num2; num++) {
            int count = 0;
            int n = num;
            while (n > 0) {
                n /= 10;
                count++;
            }
            int t = num;
            int sum = 0;
            while (t > 0) {
                int digit = t % 10;
                sum += (int) Math.pow(digit, count);
                t /= 10;
            }
            if (num == sum)         
                System.out.println(num + " ");
        }                            
        ob.close();
    }
}                                   