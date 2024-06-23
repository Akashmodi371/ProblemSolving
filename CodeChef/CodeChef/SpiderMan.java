import java.util.*;

public class SpiderMan {

    public static void main(String[] args) {
        Scanner webScanner = new Scanner(System.in);
        int spiderCases = webScanner.nextInt();
        while (spiderCases > 0) {
            int webLength = webScanner.nextInt();
            findWebLength(webLength);
            spiderCases--;
        }
        webScanner.close();
    }

    public static void findWebLength(int webLength) {
        List<Long> spiderPrimes = spiderSieve((int) Math.sqrt(webLength) + 1);
        int primeCount = spiderPrimes.size();
        for (int i = 0; i < primeCount; i++) {
            if (spiderPrimes.get(i) * spiderPrimes.get(i) > webLength) break;
            for (int j = 0; j < primeCount; j++) {
                if (spiderPrimes.get(i) * spiderPrimes.get(i) + spiderPrimes.get(j) * spiderPrimes.get(j) > webLength) break;
                long remainingWeb = webLength - (spiderPrimes.get(i) * spiderPrimes.get(i)) - (spiderPrimes.get(j) * spiderPrimes.get(j));
                long tempWeb = (long) Math.sqrt(remainingWeb);
                if (tempWeb * tempWeb == remainingWeb && !spiderPrimes.get(i).equals(spiderPrimes.get(j)) && !spiderPrimes.get(i).equals(tempWeb) && !spiderPrimes.get(j).equals(tempWeb)) {
                    if (Collections.binarySearch(spiderPrimes, tempWeb) >= 0) {
                        System.out.println("YES");
                        return;
                    }
                }
            }
        }
        System.out.println("NO");
    }

    public static List<Long> spiderSieve(int limit) {
        boolean[] isWebPrime = new boolean[limit + 1];
        Arrays.fill(isWebPrime, true);
        isWebPrime[0] = false;
        isWebPrime[1] = false;
        for (int i = 2; i * i <= limit; i++) {
            if (isWebPrime[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    isWebPrime[j] = false;
                }
            }
        }
        List<Long> spiderPrimes = new ArrayList<>();
        for (int i = 2; i <= limit; i++) {
            if (isWebPrime[i]) {
                spiderPrimes.add((long) i);
            }
        }
        return spiderPrimes;
    }
}
