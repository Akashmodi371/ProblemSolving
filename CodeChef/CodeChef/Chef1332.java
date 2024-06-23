import java.util.Arrays;
import java.util.Scanner;

public class Chef1332 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();
        while (testCases-- > 0) {
            int creatures = scanner.nextInt();
            int[] legs = new int[creatures];
            for (int i = 0; i < creatures; i++) {
                legs[i] = scanner.nextInt();
            }
            Arrays.sort(legs);

            int garudaSum = 0;
            int nandiSum = 0;
            if (creatures % 2 == 0) {
                for (int i = 0; i < creatures / 2; i++) {
                    garudaSum += legs[i];
                }
                for (int i = creatures / 2; i < creatures; i++) {
                    nandiSum += legs[i];
                }
            } else {
                for (int i = 0; i < (creatures / 2) + 1; i++) {
                    garudaSum += legs[i];
                }
                for (int i = (creatures / 2) + 1; i < creatures; i++) {
                    nandiSum += legs[i];
                }
            }
            System.out.println(garudaSum - nandiSum);
        }
    }
}
