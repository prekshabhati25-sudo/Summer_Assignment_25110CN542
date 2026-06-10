public class ques39 {
    public static void main(String[] args) 
    {
        int n = 5;

        for (int i = 1; i <= n; i++) 
            {
            for (int j = 1; j <= i; j++) 
            {
                System.out.print(j);// this will print Ascending numbers
            }

            for (int j = i - 1; j >= 1; j--)
            {
                System.out.print(j);//this will print Descending numbers
            }

            System.out.println();
        }
    }
}