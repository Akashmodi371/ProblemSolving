import java.util.Arrays;
import java.util.Scanner;

public class Day3DpCodes {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array1");
        int n = sc.nextInt();

        int[] array1 = new int[n + 1];
        int[] array2 = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            array1[i] = sc.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            array2[i] = sc.nextInt();
        }

        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        dp[1]=Integer.max(array1[1], array2[1]);
        dp[2]=Integer.max(dp[1],Integer.max(array1[2], array2[2]));

        for(int i=3;i<=n;i++){
            dp[i]=Integer.max(Integer.max(array1[i]+dp[i-2], dp[i-1]),Integer.max(array2[i]+dp[i-2], dp[i-1]));
        }

        System.out.println(dp[n]);

        

    }
}
