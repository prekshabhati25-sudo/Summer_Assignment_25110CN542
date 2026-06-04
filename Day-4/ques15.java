import java.util.*;
public class ques15 {
    public static void main(String args[])
    {Scanner ob=new Scanner(System.in);
        System.out.println("enter the number");
        int num=ob.nextInt();
        int count=0;
        int n=num;
        while(n>0)
        {
        n/=10;
        count++;
        }
        int t=num;
        int sum=0;
        while(t>0)
        {
         int digit=t%10;
         sum+=(int)Math.pow(digit,count);
         t/=10;
        }
        if(num==sum)
            System.out.println("number is armstrong");
        else
            System.out.println("number is not armstrong");
       ob.close();

    }
    
}
