import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

import javafx.scene.layout.Priority;

public class reducecost {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t!=0){
        t--;

        int n=sc.nextInt();
        // int arr[]=new int[n];
        PriorityQueue pq=new PriorityQueue<>();
        for(int i=0;i<n;i++){
            int k=sc.nextInt();
            pq.add(k);
        }

        int ans=0;

        while(pq.size()!=1){
            int temp=0;
           int p=(int)pq.poll();
            temp+=p;
           int pp=(int)pq.poll();
           temp+=pp;
           
           pq.add(temp);
           ans+=temp;
        }

        
    }

}
}
