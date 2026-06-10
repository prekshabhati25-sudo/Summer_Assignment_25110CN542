public class ques40 {
    public static void main(String[] args) {
        
        for (int i = 0; i < 5; i++) {

            // this is to print letters in Ascending order.
            for (int j = 0; j <= i; j++) {
                System.out.print((char)('A' + j));
            }

            // this is to print letters in Descending order
            for (int j = i - 1; j >= 0; j--) {
                System.out.print((char)('A' + j));
            }

            System.out.println();
        }
    }
}