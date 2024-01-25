public class intro {
    public static int f(int val){
        if(val==21){
            return 0;
        }

        return val+f(val+1);
    }
    public static void main(String[] args) {
        System.out.println(f(1));
    }
}
