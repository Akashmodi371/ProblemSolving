import java.util.Scanner;

public class GoogleSDEIntern {
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

        int[] dp=new int[n+1];
        dp[0]=0;

        dp[1]=a[1];

        for(int i=2;i<=n;i++){

            int v=a[i]+dp[i-1];

            int j=i-1;

            int sumb=b[i]+b[i-1];
            while(j>=1){
                v=Math.min(v,sumb+dp[j-1]);
                j--;
                sumb+=b[j];
            }

            dp[i]=v;
        }

        System.out.println(dp[n]);
       
    }
}
