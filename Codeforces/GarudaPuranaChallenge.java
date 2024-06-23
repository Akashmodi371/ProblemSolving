import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class GarudaPuranaChallenge {
    public static long divineLcm(long vishnu, long lakshmi) {
        return vishnu * (lakshmi / divineGcd(vishnu, lakshmi));
    }

    public static long divineGcd(long vishnu, long lakshmi) {
        while (lakshmi != 0) {
            long temp = lakshmi;
            lakshmi = vishnu % lakshmi;
            vishnu = temp;
        }
        return vishnu;
    }

    public static void main(String[] args) {
        Scanner dharmaScanner = new Scanner(System.in);

        int reincarnations = dharmaScanner.nextInt();
        while(reincarnations > 0){
            long avatars = dharmaScanner.nextLong();
            long[] deities = new long[(int) avatars];
            Set<Long> deitySet = new HashSet<>();

            for (int i = 0; i < avatars; ++i) {
                deities[i] = dharmaScanner.nextLong();
                deitySet.add(deities[i]);
            }

            long longestDivineSequence = 0;

            for (long maya = 1; maya < (1L << avatars); ++maya) {
                long currentDivineLcm = 1;
                boolean dharmaValid = true;
                long divineLength = 0;
                for (long atman = 0; atman < avatars; ++atman) {
                    if ((maya & (1L << atman)) != 0) {
                        if (currentDivineLcm <= 1e9) {
                            currentDivineLcm = divineLcm(currentDivineLcm, deities[(int) atman]);
                        }
                        if (currentDivineLcm > 1e9) {
                            dharmaValid = false;
                        }
                        if (!dharmaValid) {
                            divineLength += (avatars - atman);
                            break;
                        } else {
                            divineLength++;
                        }
                    }
                }
                if (!dharmaValid || (dharmaValid && !deitySet.contains(currentDivineLcm))) {
                    longestDivineSequence = Math.max(longestDivineSequence, divineLength);
                }
            }

            System.out.println(longestDivineSequence);

            reincarnations--;

        }
    }
}
