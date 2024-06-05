import java.util.Scanner;

public class GoogleSDEINternOptimized {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int[] a=new int[n+1];
        int[] b=new int[n+1];

        for(int i=1;i<=n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=1;i<=n;i++){
            b[i]=sc.nextInt();
        }
        
        int[][] dp=new int[n+1][n+1];
        // dp[0][0]=0;
        // dp[0][1]=0;
        dp[1][0]=a[1];
        dp[1][2]=Integer.MAX_VALUE;
        dp[1][1]=b[1];

        int i=2;

        while(i<=n){
            dp[i][0]=a[i]+Math.min(dp[i-1][0],dp[i-1][2]);
            dp[i][2]=b[i]+b[i-1]+Math.min(dp[i-2][1],dp[i-2][0]);

            dp[i][1]=b[i]+Math.min(dp[i-1][1],dp[i-1][0]);
            i++;
        }
        System.out.println(Math.min(dp[n][0],dp[n][2]));
    }
}
