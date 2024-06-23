import java.util.Scanner;

public class TechGig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s=sc.nextLine();
        int k=sc.nextInt();
        int n=s.length();

        int dp[] =new int[n+1];

        dp[0]=1;

        int b[]=new int[n+1];

        int i=0;
        for(char c:s.toCharArray()){
            b[i+1]=Character.getNumericValue(c);
            i++;
        }


        i=1;

        while(i<=n){

            int j=i-1;
            while(j>=i-10 && j>=0){
                int l=Math.abs(j-i);
                String vv=s.substring(j, j+l);
                int g=Integer.parseInt(vv);

                if(g<=k && b[j+1]!=0){
                    dp[i]=dp[i]+dp[j];
                }
                else{
                    dp[i]=dp[i]+0;
                }

                j=j-1;
            }
            i++;
        }
        System.out.println(dp[n]);
        

    }

}
