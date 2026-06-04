import java.util.*;
public class ques14 {
    public static void main(String args[]) {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter the value of n:");
        int num = ob.nextInt();
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        
        if (num == 1)
            System.out.println("nth fibonacci term is: " + n1);
        else if (num == 2)
            System.out.println("nth fibonacci term is: " + n2);
        else {
            for (int i = 2; i < num; i++) {
                n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
            }
            System.out.println("nth fibonacci term is: " + n3);
        }
        ob.close(); 
    }
}