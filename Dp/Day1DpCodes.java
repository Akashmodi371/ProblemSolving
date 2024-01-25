import java.util.Arrays;
import java.util.Scanner;

public class Day1DpCodes {
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
        dp[2]=array[1]+array[2];
        for(int i=3;i<=n;i++){
            dp[i]=dp[i-1]+array[i];
        }
        System.out.print("sum of given array is"+dp[n]);
    }
}
