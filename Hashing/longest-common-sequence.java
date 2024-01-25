// https://leetcode.com/problems/longest-consecutive-sequence/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class solution{
    public static void main(String args[]){
        int nums[]={0,3,7,2,5,8,4,6,0,1};
        Map<Integer,Boolean>mp=new HashMap<>();
        for(int x:nums){
            mp.put(x,true);
        }
        Map<Integer,Boolean>check=new HashMap<>();
        int ans=0;
        for(int x:nums){
            if(!mp.containsKey(x-1) && !check.containsKey(x)){
                int current=0;
                int start=x;
                while(mp.containsKey(start)){
                    current++;
                    check.put(start,true);
                    start++;
                }
                ans=Math.max(ans,current);
            }
        }
        System.out.println(Math.abs(5-7));
        System.out.println(ans);
    }
}