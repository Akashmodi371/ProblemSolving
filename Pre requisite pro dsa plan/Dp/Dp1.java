import java.util.Arrays;
import java.util.Scanner;

public class Dp1{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] dp= new int[n+1];
        Arrays.fill(dp, 0);


        int i=0;
        while(i<=n-1){
            if(i==0){
                dp[0]=0;
            }
            else{
                dp[i]=i+dp[i-1];
            }
            i++;
        }

        System.out.println(dp[n-2]);
    }
}