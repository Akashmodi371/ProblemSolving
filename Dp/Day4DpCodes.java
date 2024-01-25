import java.util.Arrays;
import java.util.Scanner;

public class Day4DpCodes {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();

        int[] array = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            array[i] = sc.nextInt();
        }

        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        dp[1]=0;
        dp[2]=Math.abs(array[2]-array[1]);
        dp[3]=dp[2]+Math.abs(array[3]-array[2]);
        for(int i=4;i<=n;i++){
            dp[i]=Math.min(Math.abs(array[i-3]-array[i])+dp[i-3], Math.abs(array[i-1]-array[i])+dp[i-1]);
        }
        
        System.out.println(dp[n]);
        

    }
}
