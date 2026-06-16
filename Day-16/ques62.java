import java.util.*;
public class ques62 {
    public static void main(String args[])
    {
     Scanner ob=new Scanner(System.in);
     System.out.println("enter n:");
        int n = ob.nextInt();
        int arr[] = new int[n];  
        System.out.println("enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = ob.nextInt();
        }int compare=0;
        
        int freq=0;
        for(int i=0;i<n;i++)
        {int count=0;
            for(int j=0;j<n;j++)
            { 
               if( arr[i]==arr[j])
                count++;
            }
        if(compare<count)
        {
            compare=count;
            freq=arr[i];
        }
        }
        System.out.println("the most frequent element is:"+freq);
        System.out.println("it occured "+compare+" times.");
    ob.close();
    }
}
