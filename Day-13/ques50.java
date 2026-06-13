import java.util.Scanner;

public class ques50 {
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter number of element");
        int n=ob.nextInt();
        int arr[] = new int[n];
        int sum=0;
        float avg;
        System.out.println("enter element of array:");
       for(int i=0;i<n;i++)
        {
        arr[i]=ob.nextInt();
        }
        for(int i=0;i<n;i++)
        {
       sum+=arr[i];
       }
       avg=sum/n;
        System.out.print(" sum: "+sum);
        System.out.print(" avg "+avg);
        ob.close();
    }
}
