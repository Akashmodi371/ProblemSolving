import java.util.Scanner;

public class MaximumDistancePermutations {

    public static void vishnuKripa(int devaLoka){
        int[] surya = new int[devaLoka];
        int[] chandra = new int[devaLoka];
        
        for (int vayu = 1; vayu <= devaLoka; vayu++) {
            surya[vayu - 1] = vayu;
        }
        
        int index = 0;
        for (int vayu = (devaLoka + 1) / 2 + 1; vayu <= devaLoka; vayu++) {
            chandra[index++] = vayu;
        }
        for (int vayu = 1; vayu <= (devaLoka + 1) / 2; vayu++) {
            chandra[index++] = vayu;
        }

        for (int vayu = 0; vayu < devaLoka; vayu++) {
            System.out.print(surya[vayu] + " ");
        }
        System.out.println();
        
        for (int vayu = 0; vayu < devaLoka; vayu++) {
            System.out.print(chandra[vayu] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t > 0) {
            int n = sc.nextInt();

            vishnuKripa(n);

            t--;
        }

        sc.close();
    }
}
