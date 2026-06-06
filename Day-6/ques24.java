import java.util.*;

public class ques24 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter the number:");
        int x = ob.nextInt();
        System.out.println("raise to the power:");
        int n = ob.nextInt();

        long result = 1;

        for (int i = 1; i <= n; i++) {
            result = result * x;
        }

        System.out.println(result);
        ob.close();
    }
}