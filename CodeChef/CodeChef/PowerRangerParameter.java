import java.util.Scanner;

public class PowerRangerParameter {
    public static void main(String[] args) throws java.lang.Exception {

        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        while (testCases > 0) {

            int numberOfAnimals = scanner.nextInt();
            int[] animalArray = new int[numberOfAnimals + 1];

            for (int i = 1; i <= numberOfAnimals; i++) {
                animalArray[i] = scanner.nextInt();
            }

            long answer = 0;

            for (int i = 1; i <= numberOfAnimals; i++) {

                long leftAnimal = (long) animalArray[i];
                if (leftAnimal == 1) {
                    answer = answer + (long) numberOfAnimals;
                } else {
                    long power = 1;
                    for (int j = 1; j <= numberOfAnimals; j++) {

                        power = leftAnimal * power;
                        if (power > 1000000000L) {
                            break;
                        } else {
                            long rightAnimal = (long) animalArray[j];
                            if (power <= rightAnimal) {
                                // System.out.println(i+" "+j);
                                answer++;
                            }
                        }
                    }
                }

            }
            System.out.println(answer);

            testCases--;
        }

    }
}
