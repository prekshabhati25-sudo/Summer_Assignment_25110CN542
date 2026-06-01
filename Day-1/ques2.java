import java.util.*;


public class ques2 {
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter a number");
        int n=ob.nextInt();
        for(int i=1; i<=10;i++)
           { System.out.println(n+" * "+ i +"="+ (n*i));}
        ob.close(); 
    }
    
}