import java.util.HashMap;
import java.util.Scanner;

public class problem6 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();

        HashMap<Integer,Integer> hashMap=new HashMap<>();
        int count=0;
        int maxv=0;
        for(int i=1;i<=x;i++){
            count++;
            int va=sc.nextInt();
           hashMap.put(va,hashMap.getOrDefault(va, 0)+1);
            maxv=Integer.max(maxv, hashMap.get(va));
        }

        System.out.println(count-maxv);
    }
}
