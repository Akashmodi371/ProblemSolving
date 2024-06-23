import java.util.Scanner;

public class problem1 {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();

        int[] a=new int[9];
        for(int i=0;i<9;i++){
            a[i]=sc.nextInt();
        }

        int[] hash=new int[9];

        for(int i=0;i<9;i++){
            hash[a[i]]++;
        }

        System.out.println(hash[x]);
        

    }
}

// tc:O(N+N+Q)=>O(2N+Q)=>O(N+Q)
// Sc:O(N+N)=>o(N)