import java.util.Arrays;
import java.util.Scanner;

public class Day6DpCodes {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();


        int[][] happiness = new int[n + 1][n+1];
        for (int i = 1; i <= n; i++) {
            for(int j=1;j<=n;j++){
                happiness[i][j]=sc.nextInt();
            }
        }

        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        dp[1]=Integer.max(happiness[1][1], Integer.max(happiness[1][2], happiness[1][3]));
        
        






    }



}
