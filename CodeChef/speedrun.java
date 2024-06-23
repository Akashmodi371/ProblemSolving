import java.util.Scanner;
import java.util.Arrays;

public class speedrun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t > 0) {
            t--;

            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] ar = new int[n + 1];
            int[] hi = new int[n + 1];

            for (int i = 1; i <= n; i++) {
                ar[i] = sc.nextInt();
            }
            for (int i = 1; i <= n; i++) {
                hi[i] = sc.nextInt();
            }

            // Find the optimal bomb placement
            Arrays.sort(ar); // Sorting the positions to make it easier to find the optimal bomb placement

            // Use a sliding window to find the maximum monsters we can kill with the bomb
            int maxMonstersKilled = 0;
            for (int i = 1; i <= n; i++) {
                int left = ar[i] - k;
                int right = ar[i] + k;
                int monstersKilled = 0;
                for (int j = 1; j <= n; j++) {
                    if (ar[j] >= left && ar[j] <= right) {
                        monstersKilled++;
                    }
                }
                maxMonstersKilled = Math.max(maxMonstersKilled, monstersKilled);
            }

            // After planting the bomb, calculate the remaining monsters
            int remainingMonsters = n - maxMonstersKilled;

            // If no monsters remain, Chef wins
            if (remainingMonsters == 0) {
                System.out.println("YES");
                continue;
            }

            // Simulate the shooting of the remaining monsters
            int[] remainingHi = new int[remainingMonsters + 1];
            int index = 1;
            for (int i = 1; i <= n; i++) {
                int left = ar[i] - k;
                int right = ar[i] + k;
                if (ar[i] < left || ar[i] > right) {
                    remainingHi[index++] = hi[i];
                }
            }

            boolean canWin = true;
            for (int i = 1; i < remainingHi.length; i++) {
                if (remainingHi[i] > 0) {
                    canWin = false;
                    break;
                }
            }

            if (canWin) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
