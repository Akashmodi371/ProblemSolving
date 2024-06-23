import java.util.Scanner;

public class Day8DpCodes {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int y=scanner.nextInt();
        int x=scanner.nextInt();
        int z=scanner.nextInt();
        int b=scanner.nextInt();


        
        int[]dp=new int [n+1];

        dp[1]=0;

        for(int i=2;i<=n;i++){
         
         int v1=dp[i-1]+y;
         int v2=Integer.MAX_VALUE;
         int v3=Integer.MAX_VALUE;
         int v4=Integer.MAX_VALUE;
         if(i/7==0){
          v2=dp[i/7]+x;
         }
         if(i/5==0){
          v4=dp[i/5]+b;
         }
         if(i/3==0){
          v3=dp[i/3]+z;
         }

         dp[i]=Math.min(Math.min(v3, v1),Math.min(v2, v4));

          
        }

        System.out.println(dp[n]);





        









      }
}
