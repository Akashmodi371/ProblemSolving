import java.util.Scanner;

public class GoogleSDE3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter m");
        int m=sc.nextInt();

        int[][] dp=new int[n+1][n+1];

        for(int i=1;i<=n;i++){
            dp[i][i]=1;
        }

        int i=1;

        while(i<=n-1){
            int sum=arr[i]+arr[i+1];
            if(sum<=m){
                dp[i][i+1]=2;
            }
            else{
                dp[i][i+1]=1;
            }
            i++;
        }


        int length=3;

        while(length<=n){
            int st=1;

            while(st<=n-length+1){
                int end=st+length-1;

                if(arr[end]<=m){
                    dp[st][end]=dp[st][end-1]+1;
                }
                else{
                    dp[st][end]=dp[st][end-1];
                }
                st++;
            }
            length++;
        }

        System.out.println(dp[1][n]);









    }
}
