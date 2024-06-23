import java.util.Arrays;
import java.util.Scanner;

public class Dp3 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr1=new int[n+1];
        int[] arr2=new int[n+1];
        int i=1;
        while(i<=n){
            arr1[i]=sc.nextInt();
            i++;
        }
        int j=1;
        while(j<=n){
            arr2[j]=sc.nextInt();
            j++;
        }

        int[] dp= new int[n+1];
        dp[1]=Math.max(Math.max(arr1[1],arr2[1]),0);
        dp[2]=Math.max(Math.max(arr1[2],arr2[2]),dp[1]);
        dp[3]=Math.max(Math.max(arr1[3]+dp[1],arr2[3]+dp[1]),dp[2]);


        int k=4;

        while(k<=n){
            dp[k]=Math.max(Math.max(arr1[k]+dp[k-2],arr2[k]+dp[k-2]),dp[k-1]);

            k++;
        }

        System.out.println(dp[n]);


    }
}
