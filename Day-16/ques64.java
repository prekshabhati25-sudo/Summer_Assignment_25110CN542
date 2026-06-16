import java.util.Scanner;
public class ques64 {
    public static void main(String args[]) {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter n:");
        int n = ob.nextInt();
        int arr[] = new int[n];
        System.out.println("enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = ob.nextInt();
        }
     for(int i=0;i<n;i++)
     {
        for(int j=i+1;j<n;j++)
        {
            if(arr[i]==arr[j])
            {
                for(int k=j;k<n-1;k++)
                {
                    arr[k]=arr[k+1];
                }
                n--;
                j--;
            }
        }
     }
      System.out.println("array after removing duplicates:");
      
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
      }
       ob.close();
    }}