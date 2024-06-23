public class countsubaaray {
    public static void main(String args[]){
        int arr[] = {1, 3, 7, 9, 10, 11};
        int x = 7;
        int n=arr.length;
        int l=0;
        int e=n-1;
        int ans=0;
        while(l<e){
            if((arr[l]+arr[e])<=x){
                ans+=Math.abs(e-l);
                l++;
            }
            else{
                e--;
            }
        }
        System.out.println(ans);
    }
}
