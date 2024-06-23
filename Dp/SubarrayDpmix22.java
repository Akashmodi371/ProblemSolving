import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubarrayDpmix22 {

    public static class Pair {
        int x;
        int y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int q = sc.nextInt();
        List<Pair> p = new ArrayList<>();

        for (int i = 0; i < q; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            Pair pair = new Pair(a, b);
            p.add(pair);
        }

        int n = s.length();
        int[][] dp = new int[n][n];
        int[][] dp1=new int[n][n];

        // Initialize DP array for single character substrings
        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
            dp1[i][i]=1;
        }

        // Initialize DP array for two character substrings
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = 1;
                dp1[i][i+1]=dp1[i][i]+dp1[i+1][i+1]+dp[i][i+1];
            }
        }

        // Fill the DP array for lengths greater than 2 to check dp-> i to j is palidrome substrin or not.
        for (int length = 3; length <= n; length++) {
            for (int i = 0; i <= n - length; i++) {
                int j = i + length - 1;
                if (s.charAt(i) == s.charAt(j)  && dp[i+1][j-1]==1) {
                    dp[i][j]=dp[i+1][j-1];
                }
                else{
                    dp[i][j]=0;
                }
            }
        }
        
        // Fill the dp1 array for finding the number of palindromic substrings from i to j 
        for (int length = 3; length <= n; length++) {
            for (int i = 0; i <= n - length; i++) {
                int j = i + length - 1;
                dp1[i][j]=dp1[i][j-1]+dp[i+1][j]-dp1[i+1][j-1]+dp[i][j];
            }
        }
        // Output the results for the queries
        for (int i = 0; i < q; i++) {
            int x = p.get(i).x - 1; // Convert to 0-based index
            int y = p.get(i).y - 1; // Convert to 0-based index
            System.out.println(dp1[x][y]);
        }
    }
}
