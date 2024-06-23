import java.util.LinkedHashSet;

public class longestKUniqueCharacter {
    public static void main(String args[]) {
        String s = "aabacbebebe";
        int k = 3;

        LinkedHashSet<Character> st = new LinkedHashSet<>();

        int i = 0, j = 0;
        int n = s.length();
        int maxv = Integer.MIN_VALUE;
        while (j < n) {
            st.add(s.charAt(j));
            if (st.size() > k) {
                System.out.println(st.size());
                int cur = j - i +1;
                maxv = Math.max(maxv, cur);
                st.clear();
                st.add(s.charAt(j));
                i = j;

                j++;
            }
            j++;
        }
        System.out.println(maxv);
    }

}
