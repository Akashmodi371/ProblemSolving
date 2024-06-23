import java.util.Arrays;
import java.util.Scanner;

public class bridge {

    public static void solve(int n, long c, int[] a) {
        int[] bad = new int[n];
        Arrays.fill(bad, 0);
        bad[0] = 1;

        if (check(n, c, a, bad)) {
            System.out.println(1);
        } else {
            int sz = 1;
            while (sz < n) {
                int mi = -1;
                for (int i = 0; i < n; i++) {
                    if (bad[i] == 0 && (mi == -1 || a[i] > a[mi])) {
                        mi = i;
                    }
                }
                bad[mi] = 1;
                sz++;
                if (check(n, c, a, bad)) {
                    System.out.println(sz);
                    return;
                }
            }
        }
    }

    public static boolean check(int n, long c, int[] a, int[] bad) {
        long prod = 0;
        for (int i = 0; i < n; i++) {
            if (bad[i] == 0) continue;
            for (int j = 0; j < n; j++) {
                if (bad[j] == 0) prod += (long) a[i] * a[j];
            }
        }
        return prod <= c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalTests = sc.nextInt();

        while (totalTests > 0) {
            int n = sc.nextInt();
            long c = sc.nextLong();
            int[] a = new int[n];
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            solve(n, c, a);   
            totalTests--;
        }

        sc.close();
    }
}
