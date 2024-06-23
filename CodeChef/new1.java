import java.util.Scanner;

public class new1 {

    public static int solve(int n,int m){
            if(m==n || (m>n && n%m==0)){
                return 0;
            }

            if(m>n){
                int rem=m%n;
                int as=n-rem;
                return Math.min(as,rem);                
            }

            if(m<n){
                return n-m;
            }

            return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t > 0) {
            int n=sc.nextInt();
            int m=sc.nextInt();


            int ans=solve(n,m);

            System.out.println(ans);

            t--;
        }
    }
}
