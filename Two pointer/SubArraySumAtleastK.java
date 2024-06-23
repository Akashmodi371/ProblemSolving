public class SubArraySumAtleastK {
    public static void main(String args[]) {
        int arr[] = {1, 11, 2, 3, 15};
        int k = 10;

        int j = 0;
        int i = 0;
        int ans = 0;
        int sum=0;
        int n=arr.length;

        while(j<n){
            sum+=arr[j];
            
            if(sum<k) j++;
            if(sum>=k){
                while(i<=j && sum>=k){
                    sum-=arr[i];
                    ans+=n-j;
                    i++;
                }
                j++;
            }
        }
        System.out.println(ans);
    }
}
