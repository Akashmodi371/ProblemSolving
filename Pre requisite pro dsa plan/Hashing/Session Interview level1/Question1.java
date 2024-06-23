// https://www.geeksforgeeks.org/find-frequency-number-array/
// https://leetcode.com/problems/two-sum/submissions/1241644043/

//https://www.spoj.com/problems/CSUMQ/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Question1 {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for(int i=0;i<n;i++){
            int va=sc.nextInt();
           hashMap.put(i,va);
        }
        
        int q=sc.nextInt();
        List<pair> queries=new ArrayList<>();

        for(int i=0;i<q;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            pair p=new pair(a, b);
            queries.add(p);
            System.out.println(a+" ->"+b);
        }

        for(pair p:queries){
            int a=p.a;
            int b=p.b;
            System.out.println(a+"--> "+b);

            int ans=0;
            while(a<=b){
               int v= hashMap.get(a);
                ans+=v;
                a++;
            }
            System.out.println(ans);
        }
    }
}


final class pair {
        
    int a;
    int b;
    pair(int a,int b){
        this.a=a;
        this.b=b;
    }
}


//tc:-O(N+Q+Q*N)
//sc:-O(N+Q)

