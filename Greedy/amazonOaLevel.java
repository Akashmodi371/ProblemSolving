import java.util.Scanner;
// https://www.desiqna.in/10522/amazon-sde-internship-coding-questions-and-solutions-2022
public class amazonOaLevel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t>0){
            t--;

            int n=sc.nextInt();
            int m=sc.nextInt();
            int[] arr=new int[n];
            int totalsum=0,current=0,maxiumsum=0;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                totalsum+=arr[i];
            }
            int ans=0;
            int i=0,j=0;

            while(j<n){
                current+=arr[j];

                if(j-i+1==m){
                    maxiumsum=Math.max(current, maxiumsum);
                    current-=arr[i];
                    i++;
                }

                j++;
            }
            System.out.println(totalsum-maxiumsum);
        }
    }
}
