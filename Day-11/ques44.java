import java.util.Scanner;
public class ques44 {
    int factorial=1;
    void factorial(int a) {
       for(int i=1;i<=a;i++)
        factorial*=i;
    System.out.println(factorial);
    }
    public static void main(String args[]) {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter the  number:");
        int a = ob.nextInt();
        ques44 obj = new ques44(); 
        obj.factorial(a);             
        ob.close();
    }
}
