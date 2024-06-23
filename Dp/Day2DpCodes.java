import java.util.Arrays;
import java.util.Scanner;

public class Day2DpCodes {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();

        int[] array=new int[n+1];
        for(int i=1;i<=n;i++){
            array[i]=sc.nextInt();
        }

        int[] dp=new int[n+1];
        Arrays.fill(dp, -1);

        dp[1]=array[1];
        dp[2]=Integer.max(dp[1], array[2]);
        for(int i=3;i<=n;i++){
            dp[i]=Integer.max(array[i]+dp[i-2], dp[i-1]);
        }
        System.out.println("Max sum of subset is"+dp[n]);
    }
}
