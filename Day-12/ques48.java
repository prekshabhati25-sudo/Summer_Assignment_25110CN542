import java.util.Scanner;

public class ques48 {
     void perfect(int a)
    {
        int sum=0;
        for(int i=1;i<a;i++)
        {
        if(a%i==0)
            sum+=i;}
        if(sum==a)
            System.out.println("number is perfect");
         else
        System.out.println("number is not perfect");
    }
    public static void main(String args[])
{
Scanner ob = new Scanner(System.in);
        System.out.println("enter the  number:");
        int a = ob.nextInt();
        ques48 obj = new ques48(); 
        obj.perfect(a);             
        ob.close();
}
}
