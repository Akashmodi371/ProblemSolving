import java.util.Scanner;

public class Day7DpCodes {
      public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n + 1];
        int[][] dp = new int[100005][3];
 
        for (int i = 1; i <= n; i++) {
            a[i] = scanner.nextInt();
        }
 
        if (a[1] % 2 == 0) {
            dp[1][2] = 1;
        } else {
            dp[1][1] = 1;
        }
 
        if (a[2] % 2 == 0) {
            dp[2][2] = dp[1][2];
            dp[2][1] = dp[1][1];
        } else {
            dp[2][2] = dp[1][1];
            dp[2][1] = dp[1][2];
        }
 
        int i = 3;
        while (i <= n) {
            if (a[i] % 2 == 0) {
                dp[i][2] = dp[i - 1][2] + dp[i - 2][2];
                dp[i][1] = dp[i - 1][1] + dp[i - 2][1];
            } else {
                dp[i][2] = dp[i - 1][1] + dp[i - 2][1];
                dp[i][1] = dp[i - 1][2] + dp[i - 2][2];
            }
 
            i++;
        }
 
        System.out.println(dp[n][1] + " " + dp[n][2]);



      }
}
