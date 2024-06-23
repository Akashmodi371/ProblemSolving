import java.util.Scanner;

public class suff {
    public static void slingWeb(int length) {
        if (length == 1) {
            System.out.println("1");
            return;
        }
        StringBuilder spideyBuilder = new StringBuilder();
        for (int i = 0; i < length - 1; i++) {
            spideyBuilder.append("2 ");
        }
        spideyBuilder.append("3");
        System.out.println(spideyBuilder);
    }
public static void main(String[] args) {
        Scanner webScanner = new Scanner(System.in);
        int spiderCases = webScanner.nextInt();
        while (spiderCases > 0) {
            int webLength = webScanner.nextInt();
            slingWeb(webLength);
            spiderCases--;
        }
        webScanner.close();
        
    }
}
