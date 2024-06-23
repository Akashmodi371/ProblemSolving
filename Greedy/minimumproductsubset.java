import java.util.Scanner;

public class minimumproductsubset {
    public static void main(String[] args) {
        
            Scanner sc=new Scanner(System.in);

            int t=sc.nextInt();

            while(t>0){
                t--;

                int n=sc.nextInt();

                int arr[]=new int[n];

                int ans=Integer.MAX_VALUE;

                for(int i=0;i<n;i++){
                    arr[i]=sc.nextInt();
                }


                int i=0;


                int temp=1;
                while(i<n){
                    temp=temp*arr[i];

                    if(temp<ans){
                        ans=temp;
                    }
                    else{
                        temp=temp/arr[i];
                    }
                    i++;
                }
                System.out.println(ans);
            }


    }
}
