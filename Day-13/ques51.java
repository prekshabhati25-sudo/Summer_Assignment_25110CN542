import java.util.Scanner;

public class ques51 {
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter number of element");
        int n=ob.nextInt();
        int arr[] = new int[n];
        
        System.out.println("enter element of array:");
       for(int i=0;i<n;i++){
        arr[i]=ob.nextInt();}
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<n;i++){
       max=(arr[i]>max)?arr[i]:max;
       min=(arr[i]<min)?arr[i]:min;
    
        }
        System.out.println("max: "+max);
        System.out.println("min: "+min);
        ob.close();
    }
}
