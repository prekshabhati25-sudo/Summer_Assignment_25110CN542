import java.util.Scanner;

public class ques47 {
    
    void fabonacci(int a) {
       int n1=0;
       int n2=1;
       int n3;
       System.out.print(n1+" , "+n2 +" , ");
       int i=2;
       while(i<a)
       {
        n3=n1+n2;
        System.out.print(n3+" , ");
        n1=n2;
        n2=n3;
        i++;
       }
    }
    public static void main(String args[]) {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter the  number:");
        int a = ob.nextInt();
        ques47 obj = new ques47(); 
        obj.fabonacci(a);             
        ob.close();
    }
}
