import java.util.Scanner;

public class ques53 {
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter number of element");
        int n=ob.nextInt();
        int arr[] = new int[n];
        int index=-1;
        System.out.println("enter element of array:");
       for(int i=0;i<n;i++){
        arr[i]=ob.nextInt();}
        System.out.println("enter element to search");
        int num=ob.nextInt();
        int j;
        for(j=0;j<n;j++){
            if(arr[j]==num){
                index=j;
               break;
            }
       }
       if(index!=-1)
       System.out.println("element found at : "+j);
    else
       System.out.println("element not found at");
        ob.close();
}
}