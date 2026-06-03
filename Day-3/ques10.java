import java.util.Scanner;

public class ques10 {
    public static void main(String args[]){
    Scanner ob=new Scanner(System.in);
    System.out.println( "enter a 1st number");
    int n1=ob.nextInt();
    System.out.println( "enter a 2nd number");
    int n2=ob.nextInt();
    System.out.println("prime number in the range are:");
    int count=0;
    for(int i=n1;i<=n2;i++)
    {
        for(int j=2;j<i;j++)
        {
            if(i%j==0)
                count++;
           
        }
        if(count==0)
                System.out.print(i+" , ");
            count=0;
    }
    ob.close(); 
    }
}
