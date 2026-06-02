import java.util.*;

public class ques7 {
public static void main(String args[])
{
    Scanner ob =new Scanner(System.in);
    System.out.println("Enter a number:");
    int n=ob.nextInt();
    int product=1;
    while(n>0)
    {
    int digit=n%10;
    product*= digit;
    n= n/10;
    }
    System.out.println("product of digit of number:"+product);
    ob.close(); 
}
    
}
