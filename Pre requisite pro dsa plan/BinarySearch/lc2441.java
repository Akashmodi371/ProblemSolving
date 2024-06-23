import java.util.HashSet;
import java.util.Set;

public class lc2441{
    public static void main(String[] args) {

            int[] nums={2,3,4,6,7,8};
            Set<Integer> set = new HashSet<>();
            
            for (int num : nums) {
                set.add(num);
            }
            
            int mK = -1;
            for (int num : nums) {
                if (set.contains(-num)) {
                    mK = Math.max(mK, Math.abs(num));
                }
            }
            System.out.println(mK);
        }
    
}