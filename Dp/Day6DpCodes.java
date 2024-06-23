import java.util.Arrays;
import java.util.Scanner;

public class Day6DpCodes {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int ans=0;

        int[]a=new int[n+1];
        int[]b=new int[n+1];
        int[]c=new int[n+1];

        for(int i=1;i<=n;i++){
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
            c[i]=sc.nextInt();
        }

        int[]dpa=new int[n+1];
        int[]dpb=new int[n+1];
        int[]dpc=new int[n+1];

        dpa[1]=a[1];
        dpb[1]=b[1];
        dpc[1]=c[1];


        dpa[2]=a[2]+Integer.max(b[1], c[1]);
        dpb[2]=b[2]+Integer.max(a[1], c[1]);
        dpc[2]=c[2]+Integer.max(b[1], a[1]);

        for(int i=3;i<=n;i++){
            dpa[i]=a[i]+Integer.max(dpb[i-1], dpc[i-1]);
            dpb[i]=b[i]+Integer.max(dpa[i-1], dpc[i-1]);
            dpc[i]=c[i]+Integer.max(dpa[i-1], dpb[i-1]);
        }

        ans=Integer.max(dpa[n], Integer.max(dpb[n], dpc[n]));

        System.out.println(ans+  "this is ans");



        
    }

}
