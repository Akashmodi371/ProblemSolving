import java.util.Arrays;
import java.util.Scanner;

//https://atcoder.jp/contests/dp/tasks/dp_a

public class Dp5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n+1];

        int i=1;
        while(i<=n){
            arr[i]=sc.nextInt();
            i++;
        }

        int[] dp=new int[n+1];
        Arrays.fill(dp, 0);

        dp[1]=0;
        dp[2]=Math.abs(arr[2]-arr[1]);
        i=3;

        while(i<=n){
            dp[i]=Math.min(Math.abs(arr[i]-arr[i-1])+dp[i-1],Math.abs(arr[i]-arr[i-2])+dp[i-2]);
            i++;
        }

        System.out.println(dp[n]);

        
    }
}
