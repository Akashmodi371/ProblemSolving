import java.util.HashMap;
import java.util.Map;
public class amazonlondonOa {
    public static void main(String args[]){
    int q[][]={{4,10},{5,8},{2,10}};
    int a[]={4,10,4,10,1,5,8};
    Map<Integer,Integer>parent=new HashMap<>();
    for(int i=0;i<q.length;i++){
        parent.put(q[i][0],q[i][1]);
    }
    Map<Integer,Integer>freq=new HashMap<>();
    for(int x:a){
        freq.put(x,0);
    }   
    int count=0; 
    for(int i=0;i<a.length;i++){
        count+=freq.get(a[i]);

        int p=parent.get(a[i]);
        
        freq.put(p,freq.getOrDefault(p,0)+1);
    }
    System.out.println(count);
}
}