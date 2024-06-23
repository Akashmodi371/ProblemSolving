//https://www.geeksforgeeks.org/find-the-largest-subarray-with-0-sum/

import java.util.HashMap;
import java.util.Map;

public class Question5 {
    public static void main(String[] args) {
        int[] arr={15, -2, 2, -8, 1, 7, 10, 23};

        //*-> N^2 approach */

        int ans=0;
        // for(int i=0;i<arr.length;i++){
        //    int ct=0;

        //    for(int j=i;j<arr.length;j++){
        //     ct+=arr[j];

        //     if(ct==0){
        //         ans=Math.max(ans, j-i+1);
        //     }
        //    }
        // }
        // System.out.println(ans);
        Map<Integer,Integer> hash=new HashMap<>();
        
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(hash.containsKey(sum)){
                ans=Math.max(ans, i-hash.get(sum));
            }
            else{
                hash.put(sum,i);
            }
        }

        System.out.println(ans);
        













    }

}
