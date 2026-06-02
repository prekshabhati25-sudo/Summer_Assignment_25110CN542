import java.util.*;
public class ques8 {

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
    if(reversenum== n)
    System.out.println("number is palindrome");
else
    System.out.println("number is not palindrome");
ob.close(); 
    }
    
}
