// https://docs.google.com/document/d/13sbEeg9c3NT1cMfyichvK2WOF4pv8yWaSrWXRnQOM44/edit



public class twopointerexample {
    public static void main(String args[]){
            int n=5;
            int arr1[]={2,5, 8, 10, 15};
            int arr2[]={3, 5, 8, 8, 10};

            int x=11;

            int i=0;
            int j=n-1;
            int ans=0;
            while(j>=0 && i<n){
                int sum=arr1[i]+arr2[j];

                if(sum<=x){
                    if(sum>ans){
                        ans=sum;
                    }
                    i++;
                }
                else{
                    j--;
                }
            }
            System.out.println(ans);
    }
}
