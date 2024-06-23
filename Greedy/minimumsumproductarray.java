import java.util.Scanner;


// https://www.geeksforgeeks.org/minimum-sum-product-two-arrays/

public class minimumsumproductarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t>0){
            t--;
             int n=sc.nextInt();
        int k=sc.nextInt();

        int[] a=new int[n];
        int[] b=new int[n];

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
        }
       
        int diff=0,res=0,prod=0,temp=0;

        int i=0;
        while(i<n){
            prod=a[i]*b[i];
            res+=prod;


            if(prod<0 && b[i]<0){
                temp=(a[i]+2*k)*b[i];
            }

            else if(prod<0 && a[i]<0){
                temp=(a[i]-2*k)*b[i];
            }
            
            else if(prod>0 && a[i]<0){
                temp=(a[i]+2*k)*b[i];
            }
            else if(prod>0 && a[i]>0 ){
                temp=(a[i]-2*k)*b[i];
            }

            int d=Math.abs(prod-temp);
            if(d>diff){
                diff=d;
            }
            i++;

        }

        System.out.println(res-diff);

        }

       
    }
}
