import java.util.HashMap;
import java.util.Scanner;

public class problem7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        boolean ans=false;
        int t = sc.nextInt();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int[] arr = new int[x];
        for (int i = 0; i < x; i++) {
            arr[i] = sc.nextInt();
            if(hashMap.containsKey(arr[i])){
                if(i-(hashMap.get(arr[i]))-1<=t){
                    ans=true;
                    break;
                }
            }
            hashMap.put(arr[i], i);
        }
        System.out.println(ans);



    }
}


//tc: o(N)
//sc: O(total unique elements)