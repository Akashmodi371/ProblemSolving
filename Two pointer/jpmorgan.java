public class jpmorgan {
 
    public static void main(String args[]){
        int arr[]={1,4,1,3,4};
        int k=3;
        int ans=0;
        int cnt=1;
        int n=arr.length;
        int j=1;
        int curr=-1;
        int prev=arr[0];
        if(n<3) ans=0;

        while(j<n){
            curr=arr[j];

            if(prev>=curr){
                prev=curr;
                cnt=1;
            }
            else{
                prev=curr;
                cnt++;
            }

            if(cnt==k){
                ans++;
                cnt-=1;
            }
            j++;
        }

        System.out.println(ans);
        
    }

}
