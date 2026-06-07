import java.util.*;

public class ques27 
{

    static int sumDigits(int n) 
    {
        if (n == 0) //Base case that stops the recursion.
        {
            return 0;
        }
        //recursive function
        return (n % 10) + sumDigits(n / 10);
    }

    public static void main(String[] args) 
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = ob.nextInt();

        System.out.println(sumDigits(n));
        ob.close();
    }
}