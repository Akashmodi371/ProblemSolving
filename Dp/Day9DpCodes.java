import java.util.Scanner;

public class Day9DpCodes {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] dpmx = new int[n + 1];
        int[] dpmn = new int[n + 1];

        dpmx[0] = 1;
        dpmn[0] = 1;

        for (int i = 1; i <= n; i++) {
            char c = scanner.next().charAt(0);
            if (c == '+') {
                int e = scanner.nextInt();
                dpmx[i] = Integer.max(dpmx[i - 1] + e, dpmx[i - 1]);
                dpmn[i] = Integer.min(dpmn[i - 1] + e, dpmn[i - 1]);
            } else if (c == '*') {
                int e = scanner.nextInt();
                dpmx[i] = Integer.max(dpmx[i - 1] * e, dpmx[i - 1]);
                dpmn[i] = Integer.min(dpmn[i - 1] * e, dpmn[i - 1]);
            } else if (c == '-') {
                int e = scanner.nextInt();
                dpmx[i] = Integer.max(dpmx[i - 1] - e, dpmx[i - 1]);
                dpmn[i] = Integer.min(dpmn[i - 1] - e, dpmn[i - 1]);
            } else if (c == '/') {
                int e = scanner.nextInt();
                dpmx[i] = Integer.max(dpmx[i - 1] / e, dpmx[i - 1]);
                dpmn[i] = Integer.min(dpmn[i - 1] + e, dpmn[i - 1]);
            } else {
                int e = scanner.nextInt();
                dpmx[i] = Integer.max(-1*dpmx[i - 1],Integer.max(-1*dpmn[i-1], dpmx[i-1]));
                dpmn[i] = Integer.min(-1*dpmx[i - 1],Integer.min(-1*dpmn[i-1], dpmn[i-1]));

            }
        }
        System.out.println(dpmx[n]);

    }
}


// Tc=o(n)
// Sc=o(n)