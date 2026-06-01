import java.util.*;
public class ques3 {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter number of which you want factorial ");
        int n=obj.nextInt();
        int product=1;
        for(int i=1;i<=n;i++)
            product*= i;
System.out.println("factorial is:"+product);
obj.close(); 


    }
    
}
