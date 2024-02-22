import java.util.Scanner;

public class Day10DpCodes {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int ans = countSubstrings(s);
        System.out.println(ans + "this is answere");
    }

    public static int countSubstrings(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        int numberOfPalindrom=0;
        for(int i=0;i<s.length();i++){
            dp[i][i]=1;
            numberOfPalindrom++;
        }
        System.out.println("Number of palidnrome indivviual"+numberOfPalindrom);

        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                dp[i][i+1]=1;
                numberOfPalindrom++;
            }
            
        }


        int length=3;

        while(length<=n){

            int i=0;
            while(i<n-length-1){

                int j=i+length-1;

                if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]==1){
                    dp[i][j]=1;
                    numberOfPalindrom++;
                }
                i++;
            }
            length++;

        }

        return numberOfPalindrom;
    }
};
