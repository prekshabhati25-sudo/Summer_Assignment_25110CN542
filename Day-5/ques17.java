import java.util.*;
public class ques17 {
    
public static void main(String args[])
    {Scanner ob=new Scanner(System.in);
        System.out.println("enter the number");
        int num=ob.nextInt();
        int sum=0;
        for(int i=1;i<num;i++)
        {
        if(num%i==0)
            sum+=i;}
        if(sum==num)
            System.out.println("number is perfect");
         else
        System.out.println("number is not perfect");

    
       ob.close();
}}
