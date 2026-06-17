import java.util.Scanner;

public class ques65 {
    public static void main(String args[]) {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter the number of element of 1st array:");
        int n=ob.nextInt();
        int arr[] = new int[n];
        System.out.println("enter elements for 1st array");
        for (int i = 0; i < n; i++) 
            {
            arr[i] = ob.nextInt();
             }
        System.out.println("enter the number of element of 2nd array:");
        int N=ob.nextInt();
        int brr[]=new int[N];
        System.out.println("enter elements for 2nd array");
        for (int i = 0; i < N; i++) 
            {
            brr[i] = ob.nextInt();
             }
             int crr[]=new int[n+N];
             
                for(int i=0;i<n;i++)
                {
                    crr[i]=arr[i];
                }
                int t=0;
             for(int i=n;i<(N+n);i++)
             {
                crr[i]=brr[t];
                t++;
             }
             System.out.println("array after merging:");
             for(int i=0;i<(n+N);i++)
             {
                System.out.print(crr[i]+",");
             }
          ob.close();

}}
