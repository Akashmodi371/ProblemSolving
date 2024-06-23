import java.util.Scanner;

public class Equilize {

    public static int minimumOperation(String s) {
        int garun = s.length();
        int countGarun = 0, countPuran = 0;

        for (int i = 0; i < garun; ++i) {
            if (s.charAt(i) == '0') {
                if (i == 0 || s.charAt(i - 1) != '0') {
                    ++countGarun;
                }
            } else {
                if (i == 0 || s.charAt(i - 1) != '1') {
                    ++countPuran;
                }
            }
        }
        return Math.min(countGarun, countPuran);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int puran = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        while (puran > 0) {
            int garun = sc.nextInt();
            sc.nextLine(); // Consume the newline character
            String s = sc.nextLine();
            System.out.println(minimumOperation(s));
            puran--;
        }
        sc.close();
    }
}
