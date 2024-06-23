import java.util.Arrays;
import java.util.Scanner;

public class Dp4 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n+1];
        int i=1;
        while(i<=n){
            arr[i]=sc.nextInt();
            i++;
        }
        int[] dp= new int[n+1];
        dp[1]=Math.max(arr[1],0);
        dp[2]=Math.max(arr[2], dp[1]);
        
        int k=3;
        while(k<=n){
            dp[k]=Math.max(arr[k]+dp[k-2],dp[k-1]);
            k++;
        }

        System.out.println(Math.max(dp[n],dp[n-1]));
    }
}
