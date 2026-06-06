import java.util.*;

public class ques22 {
    public static void main(String args[])
    {
    Scanner ob=new Scanner(System.in);
    System.out.println("enter the binary number:");
    int num=ob.nextInt();
    int i=0;
    int decimal=0;
    
    while(num>0)
    {
        int digit=num%10;
        decimal=decimal+(int)(digit*Math.pow(2,i));
        num/=10;
        i++;
    }
   
System.out.println(decimal);
ob.close();
    }
    
}
