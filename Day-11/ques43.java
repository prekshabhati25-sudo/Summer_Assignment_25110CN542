import java.util.*;
public class ques43 {
    int c;
    void prime(int a) {
        int count=0;
        for(int i=2;i<a;i++)
        {
            if(a%i==0)
                count++;
        }
        if(count!=0)
            System.out.println("number is not prime");
        else
             System.out.println("number is prime");
            
    } 
    
    public static void main(String args[]) {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter number:");
        int a = ob.nextInt();
        ques43 obj = new ques43(); 
        obj.prime(a);             
        ob.close();
    }
}
