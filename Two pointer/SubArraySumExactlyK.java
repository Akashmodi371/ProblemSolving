public class SubArraySumExactlyK {

    public static int find(int arr[],int k){
        int j = 0;
        int i = 0;
        int ans = 0;
        int sum=0;
        int n=arr.length;

        while(j<n){
            sum+=arr[j];
            
            if(sum<=k){
                ans+=j-i+1;
                j++;
            }
            else if(sum>k){
                while(i<=j && sum>k){
                    sum-=arr[i];
                    i++;
                }
                if(sum<=k && sum!=0) ans+=j-i+1;
                j++;
            }
        }
        return ans;
    }
    public static void main(String args[]) {
        int arr[] = {1, 11, 5, 4, 1};
        int k = 10;
        System.out.println(find(arr,k)-find(arr,k-1));   
    }



}
