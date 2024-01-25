// to ensure that no subarray of size greater than k or equal to k has average zero.

import java.util.Scanner;

public class AverageSubarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t>0){
            t--;

            int n=sc.nextInt();
            int k=sc.nextInt();

            int arr[]=new int[n+1];

            for(int i=1;i<=n;i++){
                arr[i]=sc.nextInt();
            }


            // int count=0;
            int ans=0;

            // for(int i=0;i<n;i++){
            //     if(arr[i]==1){
            //         count++;
            //     }
            //     else if(arr[i]==0){
            //         count=0;
            //     }

            //     if(count>=k){
            //         ans++;
            //         count=0;
            //     }
            // }

            int sum=0;
            int i=1;
            while(i<=k-1){
                sum+=arr[i];
                i++;
            }
            
            i=k;
            while(i<=n){
                sum+=arr[i];

                if(sum<k){

                }
                else{
                    arr[i]=0;
                    sum-=1;
                    ans++;
                }
                sum-=arr[i-k+1];

                i++;

            }




            System.out.println(ans);
        }
    }
}
