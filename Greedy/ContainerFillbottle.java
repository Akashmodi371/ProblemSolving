import java.util.Arrays;
import java.util.Scanner;

public class ContainerFillbottle {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t>0){
            t--;

            int n=sc.nextInt();

            int x=sc.nextInt();

            int bottle[]=new int[n];

            for(int i=0;i<n;i++){
                bottle[i]=sc.nextInt();
            }

            Arrays.sort(bottle);
            
            int ans=0;
            for(int i=0;i<n;i++){
                if(bottle[i]<=x){
                    ans++;
                    x-=bottle[i];
                }
            }

            System.out.println(ans+"->");
            
            

        }

    }
}
