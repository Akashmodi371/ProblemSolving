import java.util.Scanner;

public class microsoftSde1 {

    public static int findmax(int... values) {
        if (values.length == 0) {
            throw new IllegalArgumentException("At least one value must be provided");
        }

        int max = values[0];
        for (int value : values) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int n = s.length();

        int[] dp = new int[n + 1];
        int[] dpa1 = new int[n + 1];
        int[] dpa2 = new int[n + 1];
        int[] dpb1 = new int[n + 1];
        int[] dpb2 = new int[n + 1];

        if (s.charAt(0) == 'a') {
            dpa1[0] = 1;
        }
        if (s.charAt(0) == 'b') {
            dpb1[0] = 1;
        }
        dpa2[0] = 0;
        dpb2[0] = 0;

        int r = 0;
        int ans = 1;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == 'a') {
                dpa1[i] = 1 + Math.max(dpb1[i - 1], dpb2[i - 1]);

                if (i >= 2 && s.charAt(i - 1) == 'a') {
                    dpa2[i] = 2 + Math.max(dpb1[i - 2], dpb2[i - 2]);
                } else if (s.charAt(i - 1) == 'a') {
                    dpa2[i] = 2;
                }

                dpb1[i] = 0;
                dpb2[i] = 0;
            } else {
                if (s.charAt(i) == 'b') {
                    dpb1[i] = 1 + Math.max(dpa1[i - 1], dpa2[i - 1]);

                    if (i >= 2 && s.charAt(i - 1) == 'b') {
                        dpb2[i] = 2 + Math.max(dpa1[i - 2], dpa2[i - 2]);
                    } else if (s.charAt(i - 1) == 'b') {
                        dpb2[i] = 2;
                    }

                    dpa1[i] = 0;
                    dpa2[i] = 0;
                }
                ans = findmax(ans, dpa1[i], dpa2[i], dpb1[i], dpb2[i]);
            }
            ans=findmax(dpa1[i],dpa2[i],dpb1[i],dpb2[i]);

            r=Math.max(r,ans);

            
        }

        System.out.println(r);
    }
}
