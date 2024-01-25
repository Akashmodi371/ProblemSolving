import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeShawStocks {

    static boolean check(int[]stock,double y,int k){

        double t=y*k;

        int i=1;
        int n=stock.length-1;

        while(i<=n){
            if(stock[i]>=y){
                t=t-y;
            }
            else{
                t=t-stock[i];
            }
            i++;
        }

        if(t<=0) return true;

        return false;



    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int n = sc.nextInt();

        int[] stock = new int[n];

        for (int i = 0; i < n; i++) {
            stock[i] = sc.nextInt();
        }

        double ans=Integer.MIN_VALUE;
        if(stock.length<k){
            System.out.println(0);
        }

        double low=1;
        double high=1e18;

        int y=0;

        while(low<=high && y==0){
            double mid=high+(high-low)/2;

            if(check(stock,mid,k)==true && check(stock,mid+1,k)==false){
                ans=mid;
                y=1;
            }

            else if(check(stock,mid,k)==true){
                low=mid;
            }
            else{
                high=mid-1;
            }
        }

        System.out.println(ans);
    }

}
