import java.util.Scanner;

public class MeeshoSDE1OA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n + 1];

        int i = 1;
        while (i <= n) {
            arr[i] = sc.nextInt();
            i++;
        }

        int[][] dp = new int[n + 1][2];
        dp[1][0] = 1;
        dp[1][1] = 1;

        int[] ans = new int[n + 1];
        ans[1] = 1;

        i = 2;

        while (i <= n) {
            dp[i][0] = ans[i - 1] + 1;

            int minIndex = i;
            int j = i - 1;

            while (j >= 0) {
                if (arr[j] == arr[i]) {
                    minIndex = Math.min(minIndex, j);
                }
                j--;
            }

            if (minIndex != i) {
                dp[i][1] = ans[minIndex];

            } else {
                dp[i][1] = ans[i - 1] + 1;
            }

            ans[i] = Math.min(dp[i][0], dp[i][1]);
            i++;
        }
        System.out.println(ans[n]);
    }
}
