import java.util.*;

public class ques26 {

    static int fibonacci(int n) {
        if (n == 0)
            return 0;

        if (n == 1)
            return 1;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) 
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = ob.nextInt();

        System.out.println(fibonacci(n));
        ob.close();
    }
}