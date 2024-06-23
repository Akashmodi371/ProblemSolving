import java.util.Scanner;

public class cf948A {
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int m=sc.nextInt();

            if(n>=m && (n-m)%2==0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
            t--;
        }
    }public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

    
}
