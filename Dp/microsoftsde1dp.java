import java.util.Scanner;

public class microsoftsde1dp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        int[][][] dp = new int[1005][1005][4];

        int sum1 = arr[1] + arr[n];
        int sum2 = arr[1] + arr[2];
        int sum3 = arr[n - 1] + arr[n];

        int start = 1;

        while (start <= n - 1) {

            int g = 1;
            int sum = arr[start] + arr[start + 1];
            if (sum == sum1) {
                dp[start][start + 1][1] = Math.max(g, dp[start][start + 1][1]);
            }
            if (sum == sum2) {
                dp[start][start + 1][2] = Math.max(g, dp[start][start + 1][2]);
            }
            if (sum == sum3) {
                dp[start][start + 1][3] = Math.max(g, dp[start][start + 1][3]);
            }
            start++;
        }


        int l=3;
        while(l<=n){
            int i=1;
            while(i<=n-l+1){
                int end=i+l-1;

                int g=1;

                int sum=arr[i]+arr[i+1];
                if(sum==sum1){
                    dp[i][end][1]=Math.max(dp[i][end][1], g+dp[i+2][end][1]);
                }
                if(sum==sum2){
                    dp[i][end][2]=Math.max(dp[i][end][2], g+dp[i+2][end][2]);
                }
                if(sum==sum3){
                    dp[i][end][3]=Math.max(dp[i][end][3], g+dp[i+2][end][3]);
                }

                sum=arr[i]+arr[end-1];
                if(sum==sum1){
                    dp[i][end][1]=Math.max(dp[i][end][1], g+dp[i+1][end-1][1]);
                }
                if(sum==sum2){
                    dp[i][end][2]=Math.max(dp[i][end][2], g+dp[i+1][end-1][2]);
                }
                if(sum==sum3){
                    dp[i][end][3]=Math.max(dp[i][end][3], g+dp[i+1][end-1][3]);
                }

                sum=arr[end]+arr[end-1];
                if(sum==sum1){
                    dp[i][end][1]=Math.max(dp[i][end][1], g+dp[i][end-2][1]);
                }
                if(sum==sum2){
                    dp[i][end][2]=Math.max(dp[i][end][2], g+dp[i][end-2][2]);
                }
                if(sum==sum3){
                    dp[i][end][3]=Math.max(dp[i][end][3], g+dp[i][end-2][3]);
                }



                i++;

            }
            l++;
        }

        System.out.println(Math.max(dp[1][n][1],Math.max(dp[1][n][2],dp[1][n][3])));

    }

}
