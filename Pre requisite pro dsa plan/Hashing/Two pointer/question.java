public class question {
    public static void main(String[] args) {
        
        int[] ar={1,1,2,2,1,1};

        int count=0;
        int sum=0;

        int k=4;
        int n=ar.length;
        for(int i=0,j=0;j<n;j++){
            sum+=ar[j];
            while(sum>k){
                sum-=ar[i];
                i++;
            }
            count+=(j-i+1);

        }
        System.out.println(count);


    }
}
