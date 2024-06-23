// https://www.geeksforgeeks.org/find-non-overlapping-intervals-among-a-given-set-of-intervals

import java.util.ArrayList;
import java.util.Scanner;

public class intervalsgfg {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        int t = Sc.nextInt();

        while (t > 0) {

            t--;
            int n = Sc.nextInt();
            int[][] arr = new int[n][2];

            for (int i = 0; i < n; i++) {
                arr[i][0] = Sc.nextInt();
                arr[i][1] = Sc.nextInt();
            }

            int prev = arr[0][0];
            int next = arr[0][1];

            int ans = 0;

            for (int i = 1; i < n; i++) {
                if (arr[i][0] > prev && arr[i][0] < next) {
                    prev = arr[i][0];
                    next = arr[i][1];
                } else {
                    ans++;
                    prev = arr[i][0];
                    next = arr[i][1];
                }

            }

            System.out.println(ans);

        }
    }

}
