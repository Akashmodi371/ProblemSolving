import java.util.Scanner;

public class ChangeAtoB {

    public static long minimumOperation(long a,long b,long k){
        long x=a;
        long operation=0;

        while(x!=b){
            if(b/k==0){
                b=b/k;
                operation++;
            }
            else{
                b--;
                operation++;
            }
        }
        return operation;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t>0){
            long a=sc.nextInt();
            long b=sc.nextInt();
            long k=sc.nextInt();
            System.out.println(minimumOperation(a,b,k));
            t--;
        }

    }
}
