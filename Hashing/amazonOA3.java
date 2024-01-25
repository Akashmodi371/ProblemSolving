import java.util.HashMap;
import java.util.Map;

public class amazonOA3 {
    public static void main(String args[]){
        String words[] = {"aba","bcb","ece","aa","e"};
        int queries[][] = {{0,2},{1,4},{1,1}};
        int a[]=new int[words.length];
        int sum=0;
        Map<Character,Integer>mp=new HashMap<>();
        mp.put('a',1);
        mp.put('e',1);
        mp.put('i',1);
        mp.put('o',1);
        mp.put('u',1);
        for(int i=0;i<words.length;i++){
            char c[]=words[i].toCharArray();
            if(c.length==1 && mp.containsKey(c[0])){
                sum++;
                a[i]=sum;
            }
            else if(c[0]==c[c.length-1] && mp.containsKey(c[0])){
                sum++;
                a[i]=sum;
                
            }
            // System.out.println(i+" :->"+a[i]);
        }
        int ans[]=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            // System.out.println(a[queries[i][1]]);
            if(queries[i][0]==0){
                ans[i]=a[queries[i][1]];
            }
            else if(queries[i][0]>0){
                ans[i]=a[queries[i][1]]-a[queries[i][0]-1];
            }
            
        }
        for(int x:ans){
            System.out.println(x);
        }
    }
}
