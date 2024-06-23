import java.util.Scanner;

public class LongestPalindromicsubsquence {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int[][] dp = new int[500][500];

        int countpalindrome_subsquence = 0;
        int maxlen=Integer.MIN_VALUE;

        int i = 0;
        int n = str.length();

        while (i <= n - 1) {
            dp[i][i] = 1;
            countpalindrome_subsquence++;
            maxlen=1;
            i++;
        }

        i = 0;
        while (i < n - 1) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                dp[i][i + 1] = 3;
                countpalindrome_subsquence+=3;
                maxlen=Math.max(maxlen, 2);
            }
            else{
                dp[i][i+1]=2;
                countpalindrome_subsquence+=2;
            }
            i++;
        }

        int length = 3;

        while (length <= n) {

            i = 0;
            while (i < n - length + 1) {
                int j = i + length - 1;

                if (str.charAt(i) == str.charAt(j)) {
                    dp[i][j] = dp[i][j-1]+dp[i+1][j]+1;
                    countpalindrome_subsquence+=dp[i][j-1]+dp[i+1][j]+1;
                }
                else{
                    dp[i][j]=dp[i][j-1]+dp[i+1][j]-dp[i+1][j-1];
                    countpalindrome_subsquence+=dp[i][j-1]+dp[i+1][j]-dp[i+1][j-1];
                }
                i++;
            }

            length++;
        }

        System.out.println(countpalindrome_subsquence);
        System.out.println("Max length is: "+ maxlen);
        System.out.println(dp[0][n-1]);
    } 
}
