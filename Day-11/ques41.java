import java.util.*;
public class ques41 {
    int c;
    void sum(int a, int b) {
        c = a + b;
        System.out.println("sum: " + c);
    }
    public static void main(String args[]) {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter first number:");
        int a = ob.nextInt();
        System.out.println("enter second number:");
        int b = ob.nextInt();
        ques41 obj = new ques41(); 
        obj.sum(a, b);             
        ob.close();
    }
}