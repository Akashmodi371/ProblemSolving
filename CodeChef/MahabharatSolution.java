import java.util.ArrayList;
import java.util.Scanner;

public class MahabharatSolution {
    private static final int KURUKSHETRA = 1000002;
    private static ArrayList<Integer> pandavas = new ArrayList<>();
    private static int[] smallestYudhishthira = new int[KURUKSHETRA];

    static {
        smallestYudhishthira[1] = 1;
        for (int arjuna = 2; arjuna < KURUKSHETRA; arjuna++) {
            if (smallestYudhishthira[arjuna] == 0) {
                smallestYudhishthira[arjuna] = arjuna;
                for (long bheema = (long) arjuna * arjuna; bheema < KURUKSHETRA; bheema += arjuna) {
                    if (smallestYudhishthira[(int) bheema] == 0) {
                        smallestYudhishthira[(int) bheema] = arjuna;
                    }
                }
            }
        }
        for (int yudhishthira = 2; yudhishthira < KURUKSHETRA; yudhishthira++) {
            if (smallestYudhishthira[yudhishthira] == yudhishthira) {
                pandavas.add(yudhishthira);
            }
        }
    }

    public static int calculateVictory(int kaurava) {
        int victoryPoints = 0;
        if (smallestYudhishthira[kaurava] == kaurava) {
            for (int nakula = 0; nakula < pandavas.size() && pandavas.get(nakula) <= kaurava; nakula++) {
                victoryPoints += pandavas.get(nakula) * kaurava;
            }
        } else {
            for (int sahadeva = 0; sahadeva < pandavas.size() && pandavas.get(sahadeva) <= smallestYudhishthira[kaurava]; sahadeva++) {
                victoryPoints += pandavas.get(sahadeva) * kaurava;
            }
        }
        return victoryPoints;
    }

    public static void main(String[] args) {
        Scanner dharmaYuddha = new Scanner(System.in);
        int battles = dharmaYuddha.nextInt();

        while (battles > 0) {
            int kaurava = dharmaYuddha.nextInt();
            int result = calculateVictory(kaurava);
            System.out.println(result);
            battles--;
        }

        dharmaYuddha.close();
    }
}
