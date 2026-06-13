import java.util.Scanner;

public class ques49 {
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter number of element");
        int n=ob.nextInt();
        int arr[] = new int[n];
        System.out.println("enter element of array:");
       for(int i=0;i<n;i++){
        arr[i]=ob.nextInt();}
        for(int i=0;i<n;i++){
       
    
        System.out.print(arr[i]+" , ");}
        ob.close();
    }
}
