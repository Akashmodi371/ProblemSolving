import java.util.HashMap;
import java.util.Map;

public class amazonOA {
    public static void main(String args[]){
        String a="abacbc";
        String b="bca";

        HashMap<Character, Integer>mp=new HashMap<>();
        for(int i=0;i<a.length();i++){
            mp.put(a.charAt(i),mp.getOrDefault(a.charAt(i),0)+1);
        }
        
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<b.length();i++){
            int c=0;

            if(!mp.containsKey(b.charAt(i))){
                ans=0;
                break;
            }
            else{
                c=mp.get(b.charAt(i));
                ans=Math.min(ans,c);
            }
        }

        System.out.print(ans);
        
    }   
}
