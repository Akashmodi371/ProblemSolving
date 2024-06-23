import java.util.ArrayList;
import java.util.Scanner;

public class cf948B {

    public static int[] convertToSpecialForm(int x) {
        ArrayList<Integer> garudaList = new ArrayList<>();
        while (x != 0) {
            if (x % 2 == 0) {
                garudaList.add(0);
            } else {
                if ((x % 4) == 1) {
                    garudaList.add(1);
                    x -= 1;
                } else {
                    garudaList.add(-1);
                    x += 1;
                }
            }
            x /= 2;
        }

        int[] vishnuArray = new int[garudaList.size()];
        for (int narayana = 0; narayana < garudaList.size(); narayana++) {
            vishnuArray[narayana] = garudaList.get(narayana);
        }

        return vishnuArray;
    }

    public static void main(String[] args) {
        Scanner puranaScanner = new Scanner(System.in);

        int t = puranaScanner.nextInt();
        while (t > 0) {
            int x = puranaScanner.nextInt();
            int[] ans = convertToSpecialForm(x);
            System.out.println(ans.length);
            for (int lakshmi : ans) {
                System.out.print(lakshmi + " ");
            }
            System.out.println();
            t--;
        }
    }
}
