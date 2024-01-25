import java.util.*;

public class teamformation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            t--;

            int ans = 0;
            int n = sc.nextInt();
            int teamsize = sc.nextInt();
            int k = sc.nextInt();

            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

            for (int i = 0; i < n; i++) {
                pq.offer(sc.nextInt()); // Add elements to the PriorityQueue
            }

            while (teamsize > 0 && !pq.isEmpty()) {
                ans += pq.poll(); // Sum up the top elements based on team size
                teamsize--;
            }

            System.out.println(ans);
        }
    }
}
