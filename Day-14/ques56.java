import java.util.*;
public class ques56 {
    public static void main(String args[]) {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter number of elements:");
        int n = ob.nextInt();
        int arr[] = new int[n];
        System.out.println("enter elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = ob.nextInt();
        }
        System.out.println("following are terms that are duplicate:");
        for (int i = 0; i < n; i++) {
            int counted = 0;           
            for (int k = 0; k < i; k++) {
                if (arr[k] == arr[i]) {
                    counted = 1;       
                    break;
                }
            }
            if (counted == 0) {        
                int count = 0;
                for (int j = 0; j < n; j++) {
                    if (arr[i] == arr[j])
                        count++;
                }
                if(count>1)

                    System.out.println(arr[i]);
            }
        }
        ob.close();
    }
}