//https://drive.google.com/file/d/1uKZdwkL70IQYtcZbba1PPScxQURclkeO/view

import java.util.Scanner;

public class SubarrayMixtDP21 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] sum=new int[n];

        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sum[0]=arr[0];
        for(int i=1;i<n;i++){
            sum[i]=sum[i-1]+arr[i];
        }


        int[][] dp=new int[n][n];

        for(int i=0;i<n;i++){
            dp[i][i]=0;
        }

        for(int i=0;i<n-1;i++){
            dp[i][i+1]=arr[i]+arr[i+1];
        }

        int length=2;
        while(length<=n-1){
            int i=0;
            int j=i+length;
            while(j<=n-1){

                int k=i;
                int ans=Integer.MAX_VALUE;
                while(k<j){
                    ans=Math.min(ans,dp[i][k]+dp[k+1][j]+sum[j]);
                    k++;
                }

                dp[i][j]=ans;
                i++;
                j++;

            }
            length++;

        }

        System.out.println(dp[0][n-1]);

    }
}