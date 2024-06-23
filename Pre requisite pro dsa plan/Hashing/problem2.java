import java.util.HashMap;
import java.util.Scanner;

public class problem2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();

        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for(int i=0;i<9;i++){
            int va=sc.nextInt();
           hashMap.put(va,hashMap.getOrDefault(va, 0)+1);
        }
        System.out.println(hashMap.getOrDefault(x, 0));
    
    }
}

//tc: o(N)+O(1)
// Sc: O(max no of unique elements)