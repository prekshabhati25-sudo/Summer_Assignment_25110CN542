public class ques55 {
    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            return -1; 
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];

            if (current > largest) {
                secondLargest = largest; 
                largest = current;       
            }
            else if (current > secondLargest && current != largest) {
                secondLargest = current; 
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            return -1;
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] nums = {10, 20, 4, 35, 35, 16};
        System.out.println("Second Largest: " + findSecondLargest(nums)); 
    }
}