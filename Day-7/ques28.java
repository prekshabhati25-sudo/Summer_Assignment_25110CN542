import java.util.*;
public class ques28 
{

    static int reverse(int n, int rev)
    {
        if (n == 0) {
            return rev;
        }
        // recursive function
        return reverse(n / 10, rev * 10 + n % 10);
    }

    public static void main(String[] args) 

    {   Scanner ob=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=ob.nextInt();
        System.out.println(reverse(n, 0));
        ob.close();
    }
    
}