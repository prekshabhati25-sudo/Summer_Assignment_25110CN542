import java.util.*;
public class ques4 {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter number  ");
        int n=obj.nextInt();
        int count=0;int num=n;
        while(num>0)
        {
          num/=10;
          count++;
        }
       
System.out.println("number of digits:"+count);
obj.close(); 


    }
    
}