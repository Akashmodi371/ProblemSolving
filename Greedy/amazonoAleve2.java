import java.util.Arrays;
import java.util.Scanner;
// https://www.desiqna.in/10522/amazon-sde-internship-coding-questions-and-solutions-2022
public class amazonoAleve2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t>0){
            t--;

            int n=sc.nextInt();
            int k=sc.nextInt();
            Double[] arr=new Double[n];
            
            for(int i=0;i<n;i++){
                arr[i]=sc.nextDouble();
                
            }
            int bucket=1;
            int ans=0;
            int count=0;

            // for(int i=0;i<n;i++){
            //     if(arr[i]==Double.NEGATIVE_INFINITY){
            //             continue;
            //         }
            //     for(int j=i+1;j<n;j++){
            //         if(arr[j]==Double.NEGATIVE_INFINITY){
            //             continue;
            //         }
                    
            //         if(Math.abs(arr[i]-arr[j])<=k){
            //             arr[j]=Double.NEGATIVE_INFINITY;
            //         }
                    
            //     }
            //     ans++;
            // }

            int i=0;
            int j=i+1;
            Arrays.sort(arr);

            while(j<n){
                if(Math.abs(arr[j]-arr[i])>k){
                    bucket++;
                    i=j;
                }
                else{
                    j++;
                }
            }

            System.out.println(bucket);

            
        }
    }
}
