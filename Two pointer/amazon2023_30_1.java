import java.util.HashMap;
import java.util.Map;

public class amazon2023_30_1 {

    public static void main(String args[]) {

        int[] arr = { 1,2,7,7,7,4,3,6};
        int k = 3;

        Map<Integer, Integer> mp = new HashMap<>();
        int ans = Integer.MIN_VALUE;
        int i = 0;
        int j = 0;
        int n = arr.length;
        int cur = 0;

        while (j < n) {
            cur += arr[j];
            // System.out.println(cur);
            mp.put(arr[j], mp.getOrDefault(arr[j], 0) + 1);
            if (j - i + 1 >k){
                cur -= arr[i];
                int freq = mp.get(arr[i]);
                mp.put(arr[i], freq - 1);
                if (mp.get(arr[i])==0)
                    mp.remove(arr[i]);
                i++;
            }
            if (j - i + 1 == k) {
                if (mp.size() == k) {
                    ans = Math.max(ans, cur);
                }
            }
            j++;
        }
        System.out.println(ans);

    }
}
