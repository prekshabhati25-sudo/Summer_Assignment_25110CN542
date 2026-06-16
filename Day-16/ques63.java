import java.util.Scanner;

public class ques63 {
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
     System.out.println("enter n:");
        int n = ob.nextInt();
        int arr[] = new int[n];  
        System.out.println("enter elements:");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = ob.nextInt();
        }
        System.out.println("enter the sum");
        int sum=ob.nextInt();
        int found=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if (arr[i] + arr[j] == sum)
                {
                    System.out.println("the pair with given sum is: "+arr[i]+" , "+arr[j]);
                    found=1;
                    break;}
                    if(found==1)
                    break;
            }
            }
        if (found == 0)
            System.out.println("no pair found!");
          ob.close();
    }
}
