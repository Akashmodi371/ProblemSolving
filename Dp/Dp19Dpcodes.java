import java.util.Scanner;

public class Dp19Dpcodes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int[][] dp = new int[500][500];

        int countpalindrome = 0;
        int maxlen=Integer.MIN_VALUE;

        int i = 0;
        int n = str.length();

        while (i <= n - 1) {
            dp[i][i] = 1;
            countpalindrome++;
            maxlen=1;
            i++;
        }

        i = 0;
        while (i < n - 1) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                dp[i][i + 1] = 1;
                countpalindrome++;
                maxlen=Math.max(maxlen, 2);
            }
            i++;
        }

        int length = 3;

        while (length <= n) {

            i = 0;
            while (i < n - length + 1) {
                int j = i + length - 1;

                if (str.charAt(i) == str.charAt(j) && dp[i + 1][j - 1] == 1) {
                    dp[i][j] = 1;
                    maxlen=Math.max(maxlen,j-i+1);
                    countpalindrome++;
                }
                i++;
            }

            length++;
        }

        System.out.println(countpalindrome);
        System.out.println("Max length is: "+ maxlen);
    }
}
