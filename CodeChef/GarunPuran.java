import java.util.Scanner;

public class GarunPuran {
    public static void main(String[] args) {
        Scanner vishnu = new Scanner(System.in);

        int pralay = vishnu.nextInt();

        while (pralay > 0) {
            int bhumi = vishnu.nextInt();
            int kalyug = vishnu.nextInt();

            int[] atma = new int[bhumi];

            for (int deva = 0; deva < bhumi; deva++) {
                atma[deva] = vishnu.nextInt();
            }

            int srishti = 0;
            for (int deva = 0; deva < bhumi - 1; deva++) {
                srishti += Math.abs(atma[deva] - atma[deva + 1]);
            }

            int moksha = srishti;

            for (int deva = 0; deva < bhumi; deva++) {
                int avatar = atma[deva];

                int srishtiWithOne = srishti;
                if (deva > 0) {
                    srishtiWithOne -= Math.abs(atma[deva] - atma[deva - 1]);
                    srishtiWithOne += Math.abs(1 - atma[deva - 1]);
                }
                if (deva < bhumi - 1) {
                    srishtiWithOne -= Math.abs(atma[deva] - atma[deva + 1]);
                    srishtiWithOne += Math.abs(1 - atma[deva + 1]);
                }
                moksha = Math.max(moksha, srishtiWithOne);

                int srishtiWithK = srishti;
                if (deva > 0) {
                    srishtiWithK -= Math.abs(atma[deva] - atma[deva - 1]);
                    srishtiWithK += Math.abs(kalyug - atma[deva - 1]);
                }
                if (deva < bhumi - 1) {
                    srishtiWithK -= Math.abs(atma[deva] - atma[deva + 1]);
                    srishtiWithK += Math.abs(kalyug - atma[deva + 1]);
                }
                moksha = Math.max(moksha, srishtiWithK);

                atma[deva] = avatar;
            }

            System.out.println(moksha);

            pralay--;
        }

        vishnu.close();
    }
}
