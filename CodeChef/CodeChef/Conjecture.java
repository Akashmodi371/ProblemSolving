import java.util.Scanner;

public class Conjecture {

    public static int minMoves(String s) {
        int moves = 0;
        int n = s.length();
        int i = 0;
        while (i < n) {
            if (s.charAt(i) == 'a') {
                int bIndex = -1;
                int cIndex = -1;
                // Finding the indices of 'b' and 'c' after 'a'
                for (int j = i + 1; j < n; j++) {
                    if (s.charAt(j) == 'b') {
                        bIndex = j;
                    } else if (s.charAt(j) == 'c') {
                        cIndex = j;
                        break;
                    }
                }
                // If both 'b' and 'c' found after 'a'
                if (bIndex != -1 && cIndex != -1) {
                    moves++;
                    i = cIndex + 1; // Skip 'c'
                } else {
                    i++; // Move to next character
                }
            } else {
                i++; // Move to next character
            }
        }
        return moves;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume newline
        while (t-- > 0) {
            int n = sc.nextInt();
            sc.nextLine(); // Consume newline
            String s = sc.nextLine();
            int ans = minMoves(s);
            System.out.println(ans);
        }
    }
}
