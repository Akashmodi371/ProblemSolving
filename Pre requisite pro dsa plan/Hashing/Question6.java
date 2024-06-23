//two pointer number of subaarray find problem



public class Question6 {
    public static void main(String[] args) {
        
        int[] arr={2,1,1,5,8};

        int n=arr.length;

        int cnt=0;
        int t=4;

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if((arr[i]+arr[j])<=4){
                    cnt++;
                }
            }
        }

        System.out.println(cnt);


    }
}
