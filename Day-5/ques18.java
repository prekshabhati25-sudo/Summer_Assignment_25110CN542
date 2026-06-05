import java.util.Scanner;

public class ques18 {
    public static void main(String args[])
    {Scanner ob=new Scanner(System.in);
        System.out.println("enter the number");
        int n=ob.nextInt();
        int sum=0;
        int num=n;
while(num>0)
{int factorial=1;
    int digit =num%10;
    for(int i=1;i<=digit;i++)
    {
        factorial*=i;
    }
    sum+=factorial;
    num/=10;
}
        
        if(n==sum)
            System.out.println("number is strong num");
        else
            System.out.println("number is not strong num");
       ob.close();
    
    }}
