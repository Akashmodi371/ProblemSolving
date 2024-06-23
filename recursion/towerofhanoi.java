import java.util.Scanner;

public class towerofhanoi {
    public static void towerofhanoi(int n,char s,char h,char d){
        if(n==0) return;


        towerofhanoi(n-1, s, d, h);
        System.out.println("Moving"+n+"from "+s+"to"+d);
        towerofhanoi(n-1, h, s, d);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        towerofhanoi(n,'a','b','c');
    }
}
