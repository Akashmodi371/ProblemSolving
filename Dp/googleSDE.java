import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//T.C=O(N)
//S.C=0(N)

public class googleSDE {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        long n=sc.nextLong();
        long[] dp=new long[250000];
        long[] g=new long[250000];

        long ans=0;

        Map<Long,Long> mp=new HashMap<>();

        for(long i=1;i<n;i++){
            long yy=sc.nextLong();
            mp.put(yy, mp.getOrDefault(yy, 0L)+1);
        }

        dp[(int)0]=0;

        for(long i=1;i<=100000;i++){
            if(mp.getOrDefault(i, 0L)>=1){
                dp[(int)i]=1+dp[(int)i-1];
            }
            else if(mp.getOrDefault(i-1,0L)>=1){
                dp[(int)i]=1+g[(int)i-1];
            }
            else{
                dp[(int)i]=0;
            }


            if(mp.getOrDefault(i, 0L)>=2){
                g[(int)i]=1+dp[(int)i-1];
            }
            else if(mp.getOrDefault(i,0L)==1){
                if(mp.getOrDefault(i-1, 0L)>=1){
                    g[(int)i]=1+g[(int)i-1];
                }
                else{
                    g[(int)i]=0;
                }
            }
            else{
                g[(int)i]=0;
            }

            ans=Math.max(ans,dp[(int)i]);
        }

        System.out.println(ans);



        
    }
}
