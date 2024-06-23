import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class qudruplesfindwithsum {
    public static void main(String args[]){
        int a[]={12, 3, 4, 1, 6, 9};
        int sum=24;
        Map<Integer,Integer>mp=new HashMap<>();
        for(int x:a){
            mp.put(x,mp.getOrDefault(x,0)+1);
        }
        int ans[]=new int[3];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length&&j!=i ;j++){
                if(mp.containsKey(sum-(a[i]+a[j]))){
                    ans[0]=a[i];
                    ans[1]=a[j];
                    ans[2]=sum-(a[i]+a[j]);
                    break;
                }
            }
        }
        Arrays.sort(ans);
        for(int x:ans){
            System.out.print(x+" ");
        }


    }
}
