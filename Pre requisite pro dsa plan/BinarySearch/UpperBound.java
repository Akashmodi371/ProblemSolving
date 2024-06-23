public class UpperBound {
    public static void main(String[] args) {
        int[] nums={3,4,4,6,7,8,9};
        int k=5;

        int s=0;
        int e=nums.length-1;

        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]==k){
                ans=mid+1;
                break;
            }
            else if(nums[mid]>k){
                ans=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }

        System.out.println(ans);
    }
}
