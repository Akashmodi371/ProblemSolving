import java.util.HashMap;
import java.util.Map;

public class leetcode2131 {
    public static void main(String args[]){
        String words[]={"cl","lc","gg"};
        Map<String, Boolean>mp=new HashMap<>();
        for(String x:words){
            mp.put(x,true);
        }
        Map<String,Boolean>check=new HashMap<>();
        int ans=0;
        for(String str:words){
            String nst="";
            char a=str.charAt(0);
            char b=str.charAt(1);
            System.out.print(nst);
            nst=b+nst;
            nst=a+nst;
            if(str.charAt(0)==str.charAt(1)) ans+=2;
            else{
                if(mp.containsKey(nst) && !check.containsKey(nst) )
                    ans+=4;
            }
            check.put(str,true);
        }
        System.out.print(ans);
    }
    
}
