import java.util.Scanner;

public class leetcode3077 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] arr=new int[n+1];

        int i=0;
        while(i<n){
            arr[i]=sc.nextInt();
            i++;
        }


        int k=sc.nextInt();

        int[][] dp=new int[n][k+1];

        for(i=0;i<n;i++){
            for(int j=0;j<=k;j++){
                dp[i][j]=Integer.MIN_VALUE;
            }
        }
        int sum=0;
        for(i=0;i<n;i++){
            sum=sum+arr[i];
            dp[i][1]=sum*k;
        }


        for(i=1;i<n;i++){
            for(int j=2;j<=Math.min(k, i+1);j++){
                int y=k-j+1;

                int g=arr[i];
                int j1=i-1;

                while(j1>=0){
                    dp[i][j]=Math.max(dp[i][j],dp[j1][j-1]+g*y);
                    g=g+arr[j1];

                    j1--;
                }
                System.out.println(dp[i][j]);
            }
        }

        System.out.println("Ans is:"+dp[n-1][k]);







    }
}
