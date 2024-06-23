import java.util.Scanner;

public class TechGig {
    
    public static String canDistributeNK(int n, int k) {
        int sumK = (k * (k + 1)) / 2;
        if (sumK + k - 1 <= n) {
            return "Yes";
        } else {
            return "No";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();
        String[] results = new String[t];

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            results[i] = canDistributeNK(n, k);
        }

        for (String result : results) {
            System.out.println(result);
        }

        sc.close();
    }
}
