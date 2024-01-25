import java.util.Scanner;

public class powerofnumber {
    public static int f(int n,int p){
        if(p==0){
            return 1;
        }

        return n*f(n,p-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        int n=sc.nextInt();
        int p=sc.nextInt();
        System.out.println(f(n,p));

    }
}
