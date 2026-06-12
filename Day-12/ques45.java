import java.util.*;

public class ques45 {
void palindrome(int a) {
       int reversenum=0;
    int num=a;
    while(num>0){
    int digit=num%10;
    reversenum=reversenum*10+digit;
    num=num/10;
    }
    if(reversenum== a)
    System.out.println("number is palindrome");
else
    System.out.println("number is not palindrome");
    }
    public static void main(String args[]) {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter the  number:");
        int a = ob.nextInt();
        ques45 obj = new ques45(); 
        obj.palindrome(a);             
        ob.close();
}}
