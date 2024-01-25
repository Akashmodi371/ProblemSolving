import java.util.Scanner;

public class goole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] b = new int[n + 1];
        
        for (int i = 1; i <= n; i++) {
            b[i] = scanner.nextInt();
        }
        
        int i = 1;
        int j = 1;
        int mv = 0;
        int d = 0;
        
        while (i <= n && j <= n) {
            if (i == j) {
                d = b[j] - b[i];
                
                if (d > k) {
                    i++;
                    j++;
                    
                    if (i <= n) {
                        d = b[j] - b[i];
                    }
                } else {
                    int kk = 1;
                    mv = Math.max(kk, mv);
                    j++;
                    
                    if (j <= n) {
                        d = b[j] - b[i];
                    }
                }
            } else {
                d = b[j] - b[i];
                
                if (d > k) {
                    i++;
                    j--;
                    
                    if (i > j) {
                        j = i;
                    }
                    
                    d = b[j] - b[i];
                } else {
                    int kk = Math.abs(i - j) + 1;
                    j++;
                    
                    if (j <= n) {
                        d = b[j] - b[i];
                    }
                    
                    mv = Math.max(kk, mv);
                }
            }
        }
        
        System.out.println(mv);
        scanner.close();
    }
}
