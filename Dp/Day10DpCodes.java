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
        int[][] dp2=new int[n][n];
        int numberOfPalindrom=0;
        int maxv=0;
        for(int i=0;i<s.length();i++){
            dp[i][i]=1;
            dp2[i][i]=1;
            maxv=1;
            numberOfPalindrom++;
        }
        System.out.println("Number of palidnrome indivviual"+numberOfPalindrom);

        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                dp[i][i+1]=1;
                dp2[i][i+1]=3;
                maxv=2;
                numberOfPalindrom++;
            }
            else{
                dp2[i][i+1]=2;
            }
        }


        int length=3;

        while(length<=n){

            int i=0;
            while(i<n-length-1){

                int j=i+length-1;

                if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]==1){
                    dp[i][j]=1;
                    maxv=Integer.max(maxv, j-i+1);// TO get the maximum length of palindromic substring
                    System.out.println(maxv);
                    numberOfPalindrom++;
                }
                i++;

                if(s.charAt(i)!=s.charAt(j)){
                    dp2[i][j]=dp2[i][j-1]+dp2[i+1][j]-dp2[i+1][j-1];
                }
                else{
                    dp2[i][j]=dp2[i][j-1]+dp2[i+1][j]+1;
                }


            }
            length++;

        }

        return dp2[0][n-1];
    }
};
