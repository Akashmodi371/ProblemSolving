public class amazonString {
    public static void main(String args[]) {
        String s = "mononom";
        String t = "mon";

        int array[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            array[s.charAt(i) - 'a']++;
        }

        int minv = Integer.MAX_VALUE;

        for (int i = 0; i < t.length(); i++) {
            if (array[t.charAt(i) - 'a'] > 0) {
                minv = Math.min(minv, array[t.charAt(i) - 'a']);
            }
        }

        System.out.println(minv + "" + "answere is this");

    }
}
