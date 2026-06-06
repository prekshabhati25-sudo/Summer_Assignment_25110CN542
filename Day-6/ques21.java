import java.util.*;
public class ques21 {
    public static void main(String args[])
    {
    Scanner ob=new Scanner(System.in);
    System.out.println("enter the decimal number:");
    int num=ob.nextInt();
    int n=num;
    String binary="";
    
    while(n>0)
    {
        int digit=n%2;
        binary= binary+digit;
        n=n/2;
    }
    String result = new StringBuilder(binary).reverse().toString();

    System.out.println(" number in binary: "+result);
ob.close();
}

}
