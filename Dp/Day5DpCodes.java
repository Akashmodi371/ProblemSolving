import java.util.Arrays;
import java.util.Scanner;

public class Day5DpCodes {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();

        int k=sc.nextInt();

        int[] height = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            height[i] = sc.nextInt();
        }

        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        dp[1]=0;
        dp[2]=Math.abs(height[2]-height[1]);
        int i=3;
        while(i<=n){
            int ans=Integer.MAX_VALUE;
            int j=1;
            while(j<=k && i-j>=1){
                int yy=dp[i-j]+Math.abs(height[i]-height[i-j]);
                ans=Math.min(ans, yy);
                j++;
            }
            dp[i]=ans;
            i++;
        }

        System.out.println(dp[n]);
    }
}
