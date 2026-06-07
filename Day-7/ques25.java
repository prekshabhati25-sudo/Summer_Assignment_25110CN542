import java.util.*;

public class ques25 
{

    static int factorial(int n) 
    {
        if (n == 0 || n == 1) 
        {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) 
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = ob.nextInt();

        System.out.println(factorial(n));
        ob.close();
    }
}