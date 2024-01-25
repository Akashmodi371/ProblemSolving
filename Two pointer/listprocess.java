import java.util.Arrays;

public class listprocess {
    public static void main(String[] args) {
            int[] process={10,4,8,13,20};
            int m=2;
            // Arrays.sort(process);
            // int sum=0;
            // for(int i=0;i<process.length-m;i++){
            //     sum+=process[i];
            // }
            // System.out.println(sum);

            int total_sum=0;
            for(Integer x:process) total_sum+=x;

            int i=0,j=0;
            int current_sum=0;
            int ans=Integer.MIN_VALUE;

            while(j<process.length){
                current_sum+=process[j];
                if(j-i+1==m){
                    ans=Math.max(current_sum, ans);
                    current_sum-=process[i];
                    i++;
                }
                j++;
            }
            System.out.println(total_sum-ans);
    }
}