public class make_max_heap {
    public static void swap(int i,int j,int[] arr){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static int[] max_heapify(int[] arr, int n, int i) {
        int left_child=2*i;
        int right_child=2*i+1;
        int large=i;

        if(left_child<large && arr[left_child]>arr[large]){
            large=left_child;
        }
        if(right_child<large && arr[right_child]>arr[large]){
            large=right_child;
        }

        if(large!=i){
            swap(large,i,arr);
            max_heapify(arr,n,i);
        }

        return arr;
    }

    public static void main(String args[]) {

        int[] arr = { 9, 5, 3, 2, 6, 4 };
        int n = arr.length - 1;

        for (int i = (n / 2) - 1; i >= 0; i--) {
            max_heapify(arr, n, i);
        }

        for (int i = 0; i <=n; i++) {
            System.out.println(arr[i] + ",");
        }

    }

}
