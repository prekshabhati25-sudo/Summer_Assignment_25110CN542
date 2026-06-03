import java.util.*;

public class ques9 {
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the number");
        int n=ob.nextInt();
        int count=0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
                count++;
        }
        if(count!=0)
            System.out.println("number is not prime");
        else
             System.out.println("number is prime");
            ob.close(); 
    } 
    
}
