import java.util.*;

public class ques5 {
public static void main(String args[])
{
    Scanner ob =new Scanner(System.in);
    System.out.println("Enter a number:");
    int n=ob.nextInt();
    int sum=0;
    while(n>0)
    {
    int digit=n%10;
    sum+= digit;
    n= n/10;
    }
    System.out.println("sum of digit of number:"+sum);
    ob.close(); 
}
    
}
