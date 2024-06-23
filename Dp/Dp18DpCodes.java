import java.util.Scanner;

public class Dp18DpCodes {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] array = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            array[i] = scanner.nextInt();
        }
        int[][] dp = new int[n + 1][n + 1];

        

        int i = 1;
        while (i <= n) {
            dp[i][i] = 0;
            i++;
        }

        i = 1;
        while (i <= n - 1) {
            dp[i][i + 1] = array[i] + array[i + 1];
            i++;
        }

        int[] dpsum = new int[n + 1];
        dpsum[1] = array[1];

        i = 2;
        while (i <= n) {
            dpsum[i] = dpsum[i - 1] + array[i];
            i++;
        }

        int length = 3;

        while (length <= n) {
            i = 1;
            int j = i + length - 1;

            

            while (j <= n) {
                int k = i;
                int ans = Integer.MAX_VALUE;
                while (k <= j - 1) {
                    int val = dp[i][k] + dp[k + 1][j] + dpsum[j];
                    ans = Integer.min(ans, val);
                    k++;
                }
                dp[i][j]=ans;
                i++;
                j++;
            }
            

            length++;

        }

        System.out.println(dp[1][n]);

    }
}
