import java.util.*;

public class ques23 
{
    public static void main(String[] args) 
    {
        Scanner ob = new Scanner(System.in);

        int n = ob.nextInt();
        int count = 0;

        while (n > 0) 
        {//add 1 to count, if the last bit is 1
            count += (n & 1);
            //bits move one position to the right.
            n = n >> 1;
        }

        System.out.println(count);
        ob.close();
    }
}