import java.util.Scanner;

public class Chef133 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();

            int ans = 0;
            if (n % 4 == 0) {
                ans = n / 4;
            } else {
                if (n < 4) {
                    ans = n / 2;
                } else {
                    int rem = n % 4;
                    ans = n / 4;
                    if (rem >= 2) {
                        ans += rem / 2;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
