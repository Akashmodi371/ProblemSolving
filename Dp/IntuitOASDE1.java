import java.util.Scanner;


//tc:O(N*N)
//Space:O(N)

public class IntuitOASDE1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] range = new int[n + 1];
        int[] cost = new int[n + 1];

        int i = 0;
        while (i <=n) {
            range[i] = sc.nextInt();
            i++;
        }

        i=0;
        while(i<=n){
            cost[i]=sc.nextInt();
            i++;
        }
        int []dp=new int[n+1];

        dp[0]=0;

        for(i=1;i<=n;i++){
            int j=i;
            int g=-1;
            while(j>=0){

                int left=j-range[j];
                int right =j+range[j];
                if(left<0){
                    left=0;
                }

                if(range[j]!=0){
                    if(right>=i){
                        int p=cost[j]+dp[left];
                        g=Math.min(g,p);
                    }
                }

                j--;
            }
            dp[i]=g;
        }
System.out.println(dp[n]);







    }
}
