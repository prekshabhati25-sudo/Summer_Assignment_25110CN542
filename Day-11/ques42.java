import java.util.Scanner;

public class ques42 {
    int c;
    void max(int a, int b) {
        c = (a>b?a:b);
        System.out.println("max number: " + c);
    }
    public static void main(String args[]) {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter first number:");
        int a = ob.nextInt();
        System.out.println("enter second number:");
        int b = ob.nextInt();
        ques42 obj = new ques42(); 
        obj.max(a, b);             
        ob.close();
    }
}
