import java.util.Scanner;

public class ques46 {
    
    void armstrong(int a) {
        int count=0;
        int n=a;
        while(n>0)
        {
        n/=10;
        count++;
        }
        int t=a;
        int sum=0;
        while(t>0)
        {
         int digit=t%10;
         sum+=(int)Math.pow(digit,count);
         t/=10;
        }
        if(a==sum)
            System.out.println("number is armstrong");
        else
            System.out.println("number is not armstrong");
    }
    public static void main(String args[]) {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter the number:");
        int a = ob.nextInt();
        
        ques46 obj = new ques46(); 
        obj.armstrong(a);             
        ob.close();
    }
}


