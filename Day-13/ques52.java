import java.util.Scanner;

public class ques52 {
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter number of element");
        int n=ob.nextInt();
        int arr[] = new int[n];
        int even=0;
        int odd=0;
        System.out.println("enter element of array:");
       for(int i=0;i<n;i++){
        arr[i]=ob.nextInt();}
        for(int i=0;i<n;i++){
            if(arr[i]%2==0)
                even++;
            else
                odd++;
       }
       System.out.println("even number of element:"+even);
       System.out.println("odd number of element:"+odd);
        ob.close();
    }
}
