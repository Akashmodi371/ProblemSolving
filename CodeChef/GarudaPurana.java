import java.util.Scanner;

public class GarudaPurana {
    public static void main(String[] args) {
        Scanner vishnuSutra = new Scanner(System.in);

        int trials = vishnuSutra.nextInt();

        while (trials-- > 0) {
            int numOrbs = vishnuSutra.nextInt();
            int[] positions = new int[numOrbs];
            int[] powers = new int[numOrbs];

            for (int i = 0; i < numOrbs; i++) {
                positions[i] = vishnuSutra.nextInt();
            }

            for (int i = 0; i < numOrbs; i++) {
                powers[i] = vishnuSutra.nextInt();
            }

            boolean isAllActivated = false;

            for (int i = 0; i < numOrbs && !isAllActivated; i++) {
                boolean[] activatedOrbs = new boolean[numOrbs];
                activateOrb(positions, powers, activatedOrbs, i, true);
                if (allOrbsActivated(activatedOrbs)) {
                    isAllActivated = true;
                    break;
                }

                for (int j = 0; j < numOrbs; j++) {
                    if (activatedOrbs[j]) continue;
                    boolean[] secondMoveActivatedOrbs = activatedOrbs.clone();
                    activateOrb(positions, powers, secondMoveActivatedOrbs, j, true);
                    if (allOrbsActivated(secondMoveActivatedOrbs)) {
                        isAllActivated = true;
                        break;
                    }
                    secondMoveActivatedOrbs = activatedOrbs.clone();
                    activateOrb(positions, powers, secondMoveActivatedOrbs, j, false);
                    if (allOrbsActivated(secondMoveActivatedOrbs)) {
                        isAllActivated = true;
                        break;
                    }
                }
            }

            for (int i = 0; i < numOrbs && !isAllActivated; i++) {
                boolean[] activatedOrbs = new boolean[numOrbs];
                activateOrb(positions, powers, activatedOrbs, i, false);
                if (allOrbsActivated(activatedOrbs)) {
                    isAllActivated = true;
                    break;
                }

                for (int j = 0; j < numOrbs; j++) {
                    if (activatedOrbs[j]) continue;
                    boolean[] secondMoveActivatedOrbs = activatedOrbs.clone();
                    activateOrb(positions, powers, secondMoveActivatedOrbs, j, true);
                    if (allOrbsActivated(secondMoveActivatedOrbs)) {
                        isAllActivated = true;
                        break;
                    }
                    secondMoveActivatedOrbs = activatedOrbs.clone();
                    activateOrb(positions, powers, secondMoveActivatedOrbs, j, false);
                    if (allOrbsActivated(secondMoveActivatedOrbs)) {
                        isAllActivated = true;
                        break;
                    }
                }
            }

            if (isAllActivated) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        vishnuSutra.close();
    }

    private static void activateOrb(int[] positions, int[] powers, boolean[] activatedOrbs, int index, boolean moveRight) {
        if (activatedOrbs[index]) return;
        activatedOrbs[index] = true;
        int numOrbs = positions.length;
        int newPos = moveRight ? positions[index] + powers[index] : positions[index] - powers[index];

        if (moveRight) {
            for (int j = index + 1; j < numOrbs && positions[j] <= newPos; j++) {
                if (activatedOrbs[j]) break;
                activatedOrbs[j] = true;
                newPos = positions[j] + powers[j];
            }
        } else {
            for (int j = index - 1; j >= 0 && positions[j] >= newPos; j--) {
                if (activatedOrbs[j]) break;
                activatedOrbs[j] = true;
                newPos = positions[j] - powers[j];
            }
        }
    }

    private static boolean allOrbsActivated(boolean[] activatedOrbs) {
        for (boolean activated : activatedOrbs) {
            if (!activated) return false;
        }
        return true;
    }
}
