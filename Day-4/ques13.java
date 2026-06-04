import java.util.*;
public class ques13 {
    
    public static void main(String args[])
{
       Scanner ob=new Scanner(System.in);
       System.out.println("enter the number of terms of fabonacci");
       int num=ob.nextInt();
       int n1=0;
       int n2=1;
       int n3;
       System.out.print(n1+" , "+n2 +" , ");
       int i=2;
       while(i<num)
       {
        n3=n1+n2;
        System.out.print(n3+" , ");
        n1=n2;
        n2=n3;
        i++;
       }
       ob.close(); 
}
}
