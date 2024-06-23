import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TowerResearchSDE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] A = new int[n + 1];
        int[] B = new int[n + 1];

        int i = 1;
        while (i <= n) {
            A[i] = sc.nextInt();
            i++;
        }

        i = 1;
        while (i <= n) {
            B[i] = sc.nextInt();
            i++;
        }
        int[] dp1 = new int[100000 + 1];
        int[] dp2 = new int[100000 + 1];
        int[] p=new int[100000+1];

        Map<Integer, Integer> mp1 = new HashMap<>();
        Map<Integer, Integer> mp2 = new HashMap<>();

        i = 1;
        while (i <= n) {
            mp1.put(A[i], mp1.getOrDefault(A[i], 0) + 1);
            mp2.put(B[i], mp2.getOrDefault(B[i], 0) + 1);
            i++;
        }

        i = 1;
        int g=0;
        while (i <= 100000 + 1) {
            int v=mp1.get(i);
            dp1[i]=(2^g)*((2^v)-1);
            i++;
            g=g+v;
        }

        p[0]=0;

        int j = 1;
        g=0;
        while (j <= 100000 + 1) {
            int v=mp2.get(j);
            dp2[j]=(2^g)*((2^v)-1);
            p[j]=dp2[j]+p[j-1];
            j++;
            g=g+v;
        }

        long ans=0;

        i=1;
        while(i<=100000){
            // j=1;

            // while(j<=i){
            //     ans=ans+dp1[i]*p[i];
            //     j++;
            // }
            ans=ans+dp1[i]*p[i];
            i++;
        }

        System.out.println(ans);


        //Tc: O(N)( when we crreate the prefix sum array);
        //SC: O(N) 



    }
}
