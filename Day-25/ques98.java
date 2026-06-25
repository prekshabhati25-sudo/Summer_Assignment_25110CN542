import java.util.Scanner;

public class ques98 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        String[] strings = new String[n];

        System.out.println("Enter the strings: ");
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.next();
        }

        int[] minCounts = new int[26];
        for (int i = 0; i < 26; i++) {
            minCounts[i] = Integer.MAX_VALUE;
        }

        for (int i = 0; i < n; i++) {
            int[] currentCounts = new int[26];
            String str = strings[i];
            
            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);
                if (ch >= 'a' && ch <= 'z') {
                    currentCounts[ch - 'a']++;
                }
            }

            for (int j = 0; j < 26; j++) {
                if (currentCounts[j] < minCounts[j]) {
                    minCounts[j] = currentCounts[j];
                }
            }
        }

        System.out.print("Common characters: ");
        for (int i = 0; i < 26; i++) {
            while (minCounts[i] > 0 && minCounts[i] != Integer.MAX_VALUE) {
                System.out.print((char) (i + 'a') + " ");
                minCounts[i]--;
            }
        }

        scanner.close();
    }
}