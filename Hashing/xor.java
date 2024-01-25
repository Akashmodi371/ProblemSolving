public class xor {
    public static void main(String args[]){
        int x[]={10,4,10,10,8};
        int y[]={2,2,1,9,6};

        int sum=0;
        for(int i=0;i<x.length;i++){
            for(int j=1;j<y.length;j++){
                int curr=x[i]^x[i+1]^y[j]^y[j-1];
                
            }
        }
    }
}
