public class amazonOA2 {
    public static void main(String args[]){
        int loc[]={1,7,6,8};
        int mf[]={1,7,2};
        int mt[]={2,9,5};

        int n=Integer.MIN_VALUE;
        for(int i=0;i<mf.length;i++){
            n=Math.max(mf[i],Math.max(mt[i],n));
        }
        int ans[]=new int[n+1
        ];
        for(int i=0;i<loc.length;i++){
            ans[loc[i]]+=1;
        }
        for(int i=0;i<mf.length;i++){
            ans[mf[i]]-=1;
            ans[mt[i]]+=1;
        }
        for(int k=0;k<ans.length;k++){
            System.out.println(k+" ->:"+ans[k]);
        }
    }
    
}
