import java.util.*;
public class ques1
{
    public static void main(String args[])
    {Scanner obj=new Scanner(System.in);
        System.out.println("enter number till where you need addition");
        int n=obj.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
            sum+=i;
        }
 
 System.out.println("sum= "+ sum);
 obj.close(); 
 
    }
}