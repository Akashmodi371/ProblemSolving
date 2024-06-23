import java.util.Scanner;

public class cf1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t>0){
            t--;

            int n=sc.nextInt();
            int x=sc.nextInt();


            int ur=2*n-x;

            int rem=n-ur;

            System.out.println(2*rem);

        }

    }
}
