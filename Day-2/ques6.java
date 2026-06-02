import java.util.*;
public class ques6 {
    public static void main(String args[]){
    Scanner ob=new Scanner(System.in);
    System.out.println( "enter a number");
    int n=ob.nextInt();
    int reversenum=0;
    int num=n;
    while(num>0){
    int digit=num%10;
    reversenum=reversenum*10+digit;
    num=num/10;
    }
    System.out.println("reverse of the number "+n+"is:"+reversenum);
    ob.close(); 
    }
    
}
