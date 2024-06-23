import java.util.Scanner;

public class analyzeshare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t>0){
            t--;
            int k=sc.nextInt();
            int n=sc.nextInt();
            int [] arr=new int[n];

            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }

            int i=0;
            int j=0;

            int count=0;
            int ans=Integer.MIN_VALUE;
            int temp=0;

            while(j<n){
                count++;

                if(count==k){
                    temp+=arr[j];
                    ans=Math.max(ans, temp);
                    count--;
                    temp+=arr[i];
                    i++;
                    j++;
                    continue;
                }

                temp+=arr[j];
                j++;
            }

            System.out.println(ans);

        }
    }
}
